package com.miu.pmtbackendapi.service;

import com.miu.pmtbackendapi.domain.address.Address;
import com.miu.pmtbackendapi.domain.property.Property;
import com.miu.pmtbackendapi.dtos.AddressDTO;
import com.miu.pmtbackendapi.dtos.PropertyDto;
import com.miu.pmtbackendapi.exception.customexception.ItemNotFoundException;

import java.util.List;

public interface AddressService {

    List<AddressDTO> getAllAddresses();

    AddressDTO getAddressById(Long id) throws ItemNotFoundException;

    AddressDTO createAddress(Address address);


    Boolean deleteAddressById(Long id);

    AddressDTO updateAddress(Long id, Address address);
}
