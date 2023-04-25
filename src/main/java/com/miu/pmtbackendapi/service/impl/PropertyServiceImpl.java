package com.miu.pmtbackendapi.service.impl;


import com.miu.pmtbackendapi.domain.property.Property;
import com.miu.pmtbackendapi.dtos.PropertyDto;
import com.miu.pmtbackendapi.exception.customexception.ItemNotFoundException;
import com.miu.pmtbackendapi.repo.PropertyRepo;
import com.miu.pmtbackendapi.service.PropertyService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PropertyServiceImpl implements PropertyService{


    private final PropertyRepo propertyRepo;

    private final ModelMapper modelMapper;

    @Override
    public List<PropertyDto> getAllProperties() {

        Iterable<Property> propertyList = propertyRepo.findAll();
        List<PropertyDto> propertyDtos = new ArrayList<>();
        for(Property property : propertyList){
            PropertyDto propertyDto = modelMapper.map(property, PropertyDto.class);
            propertyDtos.add(propertyDto);
        }
        return propertyDtos;
    }

    @Override
    public PropertyDto getPropertyById(Long id) throws ItemNotFoundException {
        Optional<Property> find = propertyRepo.findById(id);
        if(find.isPresent()){
            Property property = find.get();
            PropertyDto propertyDto = modelMapper.map(property, PropertyDto.class);
            return propertyDto;
        }
        else
        throw new ItemNotFoundException("Property Not Found !!!");
    }

    @Override
    public PropertyDto createProperty(Property property) {
        Property newProperty = propertyRepo.save(property);
        PropertyDto propertyDto = modelMapper.map(newProperty, PropertyDto.class);
        return propertyDto;
    }

    @Override
    public PropertyDto getPropertyByOwner(Long owner) throws ItemNotFoundException {
        Optional<Property> find = propertyRepo.findPropertyByOwner_UserId(owner);
        if(find.isPresent()){
            Property found = find.get();
            PropertyDto propertyDto = modelMapper.map(found, PropertyDto.class);
            return propertyDto;
        }
        else
        throw new ItemNotFoundException("No Property Registered by THis Owner");
    }

    @Override
    public Boolean deletePropertyById(Long id) {
        Optional<Property> find = propertyRepo.findById(id);
        if(find.isPresent()){
            propertyRepo.delete(find.get());
            return true;
        }
        else
        return false;
    }

    @Override
    public PropertyDto updateProperty(Long id, Property property) {
        Optional<Property> find = propertyRepo.findById(id);
        if(find.isPresent()){
            Property found = find.get();
            found.setPropertyDetail(property.getPropertyDetail());
            found.setPropertyImages(property.getPropertyImages());
            found.setOwner(property.getOwner());
            found.setStatusEnum(property.getStatusEnum());
            found.setAddress(property.getAddress());
            PropertyDto propertyDto = modelMapper.map(found, PropertyDto.class);
            return propertyDto;
        }
        else
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Property not found");
    }

    @Override
    public Boolean cancelProperty(Long id) {
        return null;
    }
    // is it same as delete ????
}
