package com.miu.pmtbackendapi.resource.property;

import com.miu.pmtbackendapi.domain.enums.PropertyTypeEnum;
import com.miu.pmtbackendapi.domain.property.Property;
import com.miu.pmtbackendapi.exception.customexception.ItemNotFoundException;
import com.miu.pmtbackendapi.service.property.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/properties")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PropertyController {

    private final PropertyService propertyService;

    @GetMapping("/")
    ResponseEntity<?> getAllProperties() {
        return new ResponseEntity<>(propertyService.getAllProperties(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<?> getPropertyById(@PathVariable("id") Long id) throws ItemNotFoundException {
        return new ResponseEntity<>(propertyService.
                getPropertyById(id), HttpStatus.FOUND);
    }

    @PostMapping(value = "/")
    ResponseEntity<?> createNewProperty(@RequestBody Property property) {
        return new ResponseEntity<>(propertyService.createProperty(property), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<?> deletePropertyById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(propertyService.deletePropertyById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    ResponseEntity<?> updatePropertyById(@PathVariable("id") Long id, @RequestBody Property property) {
        return new ResponseEntity<>(propertyService.updateProperty(id, property), HttpStatus.OK);
    }

    @GetMapping("/owner/{userId}")
    ResponseEntity<?> getPropertyByOwnerId(@PathVariable("userId") Long ownerId) throws ItemNotFoundException {
        return new ResponseEntity<>(propertyService.getPropertyByOwner(ownerId), HttpStatus.OK);
    }

    // TODO  search and filter


    @GetMapping("/search")
    ResponseEntity<?> filterPropertyByParams(@RequestParam(value = "street", required = false) String street,
                                             @RequestParam(value = "city", required = false) String city,
                                             @RequestParam(value = "state", required = false) String state,
                                             @RequestParam(value = "zip", required = false) String zip,
                                             @RequestParam(value = "country", required = false) String country,
                                             @RequestParam(value = "propertyType", required = false) PropertyTypeEnum propertyType,
                                             @RequestParam(value = "roomNum", required = false) Integer roomNumber,
                                             @RequestParam(value = "price", required = false) Double propertyPrice) {


        return new ResponseEntity<>(propertyService.getPropertiesByParam(street, city, state, zip, country, propertyType, roomNumber, propertyPrice), HttpStatus.FOUND);
    }

    @GetMapping("/filter")
    ResponseEntity<?> testFilter(@RequestParam(value = "street", required = false) String street,
                                 @RequestParam(value = "city", required = false) String city,
                                 @RequestParam(value = "state", required = false) String state,
                                 @RequestParam(value = "zip", required = false) String zip,
                                 @RequestParam(value = "country", required = false) String country,
                                 @RequestParam(value = "propertyType", required = false) PropertyTypeEnum propertyType,
                                 @RequestParam(value = "roomNum", required = false) Integer roomNumber,
                                 @RequestParam(value = "price", required = false) Double propertyPrice) {


        return new ResponseEntity<>(propertyService.filterPropertiesByCriteria(street, city, state, zip, country, propertyType, roomNumber, propertyPrice), HttpStatus.FOUND);
    }
}
