package com.miu.pmtbackendapi.service;

import com.miu.pmtbackendapi.domain.enums.PropertyTypeEnum;
import com.miu.pmtbackendapi.domain.property.Property;
import com.miu.pmtbackendapi.dtos.PropertyDto;
import com.miu.pmtbackendapi.exception.customexception.ItemNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PropertyService{


    List<PropertyDto> getAllProperties();

    PropertyDto getPropertyById(Long id) throws ItemNotFoundException;

    PropertyDto createProperty(Property property);

    List<PropertyDto> getPropertyByOwner(Long ownerId) throws ItemNotFoundException;

    Boolean deletePropertyById(Long id);

    PropertyDto updateProperty(Long id, Property property);

    Boolean cancelProperty(Long id);

    List<PropertyDto> getPropertiesByParam(String street,String city,String state,String zip, String country,
                                                PropertyTypeEnum propertyType, Integer roomNum, Double propertyPrice);


}
