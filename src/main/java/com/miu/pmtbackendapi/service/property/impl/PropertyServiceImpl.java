package com.miu.pmtbackendapi.service.property.impl;


import com.miu.pmtbackendapi.domain.enums.PropertyStatusEnum;
import com.miu.pmtbackendapi.domain.enums.PropertyTypeEnum;
import com.miu.pmtbackendapi.domain.offer.Offer;
import com.miu.pmtbackendapi.domain.property.Property;
import com.miu.pmtbackendapi.domain.property.dto.request.PropertyDTO;
import com.miu.pmtbackendapi.exception.customexception.ItemNotFoundException;
import com.miu.pmtbackendapi.repo.address.AddressRepo;
import com.miu.pmtbackendapi.repo.offer.OfferRepository;
import com.miu.pmtbackendapi.repo.property.PropertyRepository;
import com.miu.pmtbackendapi.repo.propertydetail.PropertyDetailRepository;
import com.miu.pmtbackendapi.service.PropertyService;
import com.miu.pmtbackendapi.service.commonadpater.Adapter;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Transactional
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private final PropertyRepository propertyRepo;
    PropertyStatusEnum propertyStatusAvaiable;
    @Autowired
    private OfferRepository offerRepository;
    private final Adapter adapter;
    private final AddressRepo addressRepo;
    private final PropertyDetailRepository propertyDetailRepo;

    private PropertyStatusEnum propertyStatusEnum;

    @Override
    public List<PropertyDTO> getAllProperties() {

        List<Property> propertyList = propertyRepo.findAll();
        List<PropertyDTO> propertyDtos = propertyList.stream()
                .map(p -> adapter.convertObject(p, PropertyDTO.class))
                .collect(Collectors.toList());
        return propertyDtos;
    }

    @Override
    public PropertyDTO getPropertyById(Long id) throws ItemNotFoundException {
        Optional<Property> find = propertyRepo.findById(id);
        if (find.isPresent()) {
            Property property = find.get();
            PropertyDTO propertyDto = adapter.convertObject(property, PropertyDTO.class);
            return propertyDto;
        } else
            throw new ItemNotFoundException("Property Not Found !!!");
    }


    @Override
    public PropertyDTO createProperty(Property property) {
//        Address address = property.getAddress();
//        addressRepo.save(address);
//        property.setAddress(address);
//        PropertyDetail propertyDetail = property.getPropertyDetail();
//        propertyDetailRepo.save(propertyDetail);
//        property.setPropertyDetail(propertyDetail);
        Property newProperty = propertyRepo.save(property);
        PropertyDTO propertyDto = adapter.convertObject(newProperty, PropertyDTO.class);
        return propertyDto;
    }

    @Override
    public void saveStatusProperty(Property property) {

        PropertyStatusEnum propertyStatusEnum1 = PropertyStatusEnum.CONTINGENT;
        propertyStatusEnum1.setValue("CONTINGENT");
        property.setStatusEnum(propertyStatusEnum1);
        propertyRepo.save(property);

    }

    @Override
    public void cancelStatusProperty(Property property) {

        PropertyStatusEnum propertyStatusEnum1 = PropertyStatusEnum.AVAILABLE;
        propertyStatusEnum1.setValue("AVAILABLE");
        property.setStatusEnum(propertyStatusEnum1);
        propertyRepo.save(property);

    }

    @Override
    public List<PropertyDTO> getPropertyByOwner(Long owner) throws ItemNotFoundException {
        Optional<List<Property>> find = propertyRepo.findPropertyByOwner_UserId(owner);
        if (find.isPresent() && !find.get().isEmpty()) {
            List<Property> found = find.get();
            List<PropertyDTO> propertyDto = new ArrayList<>();
            for (Property p : found) {
                PropertyDTO dto = adapter.convertObject(p, PropertyDTO.class);
                propertyDto.add(dto);
            }
            return propertyDto;
        } else
            throw new ItemNotFoundException("No Property Registered by This Owner");
    }

    @Override
    public Boolean deletePropertyById(Long id) {
        Optional<Property> find = propertyRepo.findById(id);
        if (find.isPresent()) {
            propertyRepo.delete(find.get());
            return true;
        } else
            return false;
    }

    @Override
    public PropertyDTO updateProperty(Long id, Property property) {
        Optional<Property> find = propertyRepo.findById(id);
        if (find.isPresent()) {
            Property found = find.get();
            found.setPropertyDetail(property.getPropertyDetail());
            found.setPropertyImages(property.getPropertyImages());
            found.setOwner(property.getOwner());
            found.setStatusEnum(property.getStatusEnum());
            found.setAddress(property.getAddress());
            propertyRepo.save(found);
            PropertyDTO propertyDto = adapter.convertObject(found, PropertyDTO.class);
            return propertyDto;
        } else
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Property not found");
    }

    @Override
    public Boolean cancelProperty(Long id) {
        return null;
    }

    @Override
    public List<PropertyDTO> getPropertiesByParam(String street, String city, String state, String zip,
                                                  String country, PropertyTypeEnum propertyType, Integer roomNum,
                                                  Double propertyPrice) {

        List<Property> properties = propertyRepo.findPropertiesByParam(street, city, state, zip, country, propertyType, roomNum, propertyPrice);
        List<PropertyDTO> propertyDtos = new ArrayList<>();
        for (Property p : properties) {
            PropertyDTO dto = adapter.convertObject(p, PropertyDTO.class);
            propertyDtos.add(dto);
        }
        return propertyDtos;
    }
    // is it same as delete ????


}
