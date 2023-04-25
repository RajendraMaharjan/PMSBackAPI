package com.miu.pmtbackendapi.repo;

import com.miu.pmtbackendapi.domain.property.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PropertyRepo extends CrudRepository<Property,Long> {

    Optional<Property> findPropertyByOwner_UserId(Long userId);

}
