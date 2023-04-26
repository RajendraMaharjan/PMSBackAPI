package com.miu.pmtbackendapi.repo;

import com.miu.pmtbackendapi.domain.enums.PropertyTypeEnum;
import com.miu.pmtbackendapi.domain.property.Property;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PropertyRepo extends CrudRepository<Property,Long> {

    Optional<List<Property>> findPropertyByOwner_UserId(Long userId);


    @Query(value = "SELECT p FROM Property p "+
            "WHERE (:street is null OR p.address.street = :street) "+
            "AND (:city is null OR p.address.city = :city) "+"" +
            "AND (:state is null OR p.address.state = :state)" + "" +
            "AND (:zip is null OR p.address.zip = :zip)"+"" +
            "AND (:country is null OR p.address.country = :country)" +
            "AND (:propertyType is null OR p.propertyDetail.propertyType = :propertyType)"+
            "AND (:roomNum is null OR p.propertyDetail.roomNum = :roomNum)"+
            "AND (:price is null OR p.propertyDetail.propertyPrice = :price)")
    List<Property> findPropertiesByParam(@Param("street") String street,
                                         @Param("city") String city,
                                         @Param("state") String state,
                                         @Param("zip") String zip,
                                         @Param("country") String country,
                                         @Param("propertyType") PropertyTypeEnum propertyType,
                                         @Param("roomNum") Integer roomNum,
                                         @Param("price") Double price);

}
