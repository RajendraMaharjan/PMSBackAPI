package com.miu.pmtbackendapi.service;

import com.miu.pmtbackendapi.domain.enums.PropertyTypeEnum;
import com.miu.pmtbackendapi.domain.property.Property;
import com.miu.pmtbackendapi.domain.property.dto.response.ResponseProperties;
import com.miu.pmtbackendapi.domain.property.dto.response.ResponseProperty;
import com.miu.pmtbackendapi.exception.CustomMessage;
import com.miu.pmtbackendapi.exception.customexception.ItemNotFoundException;

import java.util.List;


public interface PropertyService {

    List<ResponseProperty> getAllProperties();

    ResponseProperty getPropertyById(Long id) throws ItemNotFoundException;

    ResponseProperty createProperty(Property property);

    List<ResponseProperty> getPropertyByOwner(Long ownerId) throws ItemNotFoundException;

    CustomMessage deletePropertyById(Long id);

    ResponseProperty updateProperty(Long id, Property property);

    Boolean cancelProperty(Long id);

    ResponseProperties getPropertiesByParam(String street, String city, String state, String zip, String country,
                                            PropertyTypeEnum propertyType, Integer roomNum, Double propertyPrice);

    ResponseProperties filterPropertiesByCriteria(String street, String city, String state, String zip, String country,
                                                  PropertyTypeEnum propertyType, Integer roomNum, Double propertyPrice);
}
