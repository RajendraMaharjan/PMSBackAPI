package com.miu.pmtbackendapi.repo;

import com.miu.pmtbackendapi.domain.property.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends JpaRepository<Property,Long> {
}
