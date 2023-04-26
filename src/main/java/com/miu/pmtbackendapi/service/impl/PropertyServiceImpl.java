package com.miu.pmtbackendapi.service.impl;


import com.miu.pmtbackendapi.domain.address.Address;
import com.miu.pmtbackendapi.domain.enums.PropertyTypeEnum;
import com.miu.pmtbackendapi.domain.property.Property;
import com.miu.pmtbackendapi.domain.propertydetail.PropertyDetail;
import com.miu.pmtbackendapi.dtos.PropertyDto;
import com.miu.pmtbackendapi.exception.customexception.ItemNotFoundException;
import com.miu.pmtbackendapi.repo.AddressRepo;
import com.miu.pmtbackendapi.repo.PropertyDetailRepo;
import com.miu.pmtbackendapi.repo.PropertyRepo;
import com.miu.pmtbackendapi.service.PropertyService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PropertyServiceImpl implements PropertyService{


    private final PropertyRepo propertyRepo;

    private final ModelMapper modelMapper;

    private final AddressRepo addressRepo;

    private final PropertyDetailRepo propertyDetailRepo;

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

    @Transactional
    @Override
    public PropertyDto createProperty(Property property) {
        Address address = property.getAddress();
        addressRepo.save(address);
        property.setAddress(address);
        PropertyDetail propertyDetail = property.getPropertyDetail();
        propertyDetailRepo.save(propertyDetail);
        property.setPropertyDetail(propertyDetail);
        Property newProperty = propertyRepo.save(property);
        PropertyDto propertyDto = modelMapper.map(newProperty, PropertyDto.class);
        return propertyDto;
    }

    @Override
    public List<PropertyDto> getPropertyByOwner(Long owner) throws ItemNotFoundException {
        Optional<List<Property>> find = propertyRepo.findPropertyByOwner_UserId(owner);
        if(find.isPresent() && !find.get().isEmpty()){
            List<Property> found = find.get();
            List<PropertyDto> propertyDto = new ArrayList<>();
            for(Property p : found){
                PropertyDto dto = modelMapper.map(p, PropertyDto.class);
                propertyDto.add(dto);
            }
            return propertyDto;
        }
        else
        throw new ItemNotFoundException("No Property Registered by This Owner");
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
            propertyRepo.save(found);
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

    @Override
    public List<PropertyDto> getPropertiesByParam(String street, String city, String state, String zip,
                                                  String country, PropertyTypeEnum propertyType, Integer roomNum,
                                                  Double propertyPrice) {

        List<Property> properties = propertyRepo.findPropertiesByParam(street,city,state,zip,country,propertyType,roomNum,propertyPrice);
        List<PropertyDto> propertyDtos = new ArrayList<>();
        for(Property p : properties){
            PropertyDto dto = modelMapper.map(p, PropertyDto.class);
            propertyDtos.add(dto);
        }
        return propertyDtos;
    }
    // is it same as delete ????




}
