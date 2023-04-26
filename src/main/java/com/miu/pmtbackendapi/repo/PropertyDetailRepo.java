package com.miu.pmtbackendapi.repo;

import com.miu.pmtbackendapi.domain.propertydetail.PropertyDetail;
import org.springframework.data.repository.CrudRepository;

public interface PropertyDetailRepo extends CrudRepository<PropertyDetail, Long> {
}
