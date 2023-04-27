package com.miu.pmtbackendapi.service;

import com.miu.pmtbackendapi.domain.enums.PropertyTypeEnum;
import com.miu.pmtbackendapi.domain.property.Property;
import com.miu.pmtbackendapi.domain.property.dto.request.PropertyDTO;
import com.miu.pmtbackendapi.exception.customexception.ItemNotFoundException;

import java.util.List;


public interface PropertyService{

    List<PropertyDTO> getAllProperties();

    PropertyDTO getPropertyById(Long id) throws ItemNotFoundException;

    PropertyDTO createProperty(Property property);

    List<PropertyDTO> getPropertyByOwner(Long ownerId) throws ItemNotFoundException;

    Boolean deletePropertyById(Long id);

    PropertyDTO updateProperty(Long id, Property property);

    Boolean cancelProperty(Long id);

    List<PropertyDTO> getPropertiesByParam(String street, String city, String state, String zip, String country,
                                           PropertyTypeEnum propertyType, Integer roomNum, Double propertyPrice);


    void saveStatusProperty(Property property);
    void cancelStatusProperty(Property property);


}
