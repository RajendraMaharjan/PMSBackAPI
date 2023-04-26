package com.miu.pmtbackendapi.repo;

import com.miu.pmtbackendapi.domain.address.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<Address, Long> {
}
