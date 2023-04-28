package com.miu.pmtbackendapi.service.propertydetail;

import com.miu.pmtbackendapi.domain.propertydetail.PropertyDetail;
import com.miu.pmtbackendapi.domain.propertydetail.dto.PropertyDetailDTO;
import com.miu.pmtbackendapi.exception.customexception.ItemNotFoundException;

import java.util.List;

public interface PropertyDetailService {

    List<PropertyDetailDTO> getAllPropertyDetails();

    PropertyDetailDTO getPropertyDetailById(Long id) throws ItemNotFoundException;

    PropertyDetailDTO createPropertyDetail(PropertyDetail propertyDetail);


    Boolean deletePropertyDetailById(Long id);

    PropertyDetailDTO updatePropertyDetail(Long id, PropertyDetail propertyDetail);
}
