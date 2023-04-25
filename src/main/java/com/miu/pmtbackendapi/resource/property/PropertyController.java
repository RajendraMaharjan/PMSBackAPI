package com.miu.pmtbackendapi.resource.property;


import com.miu.pmtbackendapi.domain.property.Property;
import com.miu.pmtbackendapi.exception.customexception.ItemNotFoundException;
import com.miu.pmtbackendapi.service.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/properties")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class PropertyController {

    private final PropertyService propertyService;


    @GetMapping("")
    ResponseEntity<?> getAllProperties(){
        return new ResponseEntity<>(propertyService.getAllProperties(), HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    ResponseEntity<?> getPropertyById(@PathVariable("id") Long id) throws ItemNotFoundException {
        return new ResponseEntity<>(propertyService.getPropertyById(id), HttpStatus.FOUND);
    }

    @PostMapping("")
    ResponseEntity<?> createNewProperty(@RequestBody Property property){
        return new ResponseEntity<>(propertyService.createProperty(property), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<?> deletePropertyById(@PathVariable("id") Long id){
        return new ResponseEntity<>(propertyService.deletePropertyById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    ResponseEntity<?> updatePropertyById(@PathVariable("id") Long id, @RequestBody Property property){
        return new ResponseEntity<>(propertyService.updateProperty(id,property),HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    ResponseEntity<?> getPropertyByOwnerId(@PathVariable("userId") Long ownerId) throws ItemNotFoundException {
        return new ResponseEntity<>(propertyService.getPropertyByOwner(ownerId), HttpStatus.FOUND);
    }

    // TODO  search and filter
}
