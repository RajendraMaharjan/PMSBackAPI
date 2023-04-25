package com.miu.pmtbackendapi.resource.enquiry;

import com.miu.pmtbackendapi.domain.enquiry.EnquiryMessage;
import com.miu.pmtbackendapi.domain.enquiry.dto.EnquiryResponse;
import com.miu.pmtbackendapi.domain.enquiry.dto.EnquiryResponses;
import com.miu.pmtbackendapi.exception.customexception.ItemNotFoundException;
import com.miu.pmtbackendapi.service.enquiry.EnquiryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enqiry")
@RequiredArgsConstructor
public class EnqiryController {
    private final EnquiryService enquiryService;

    @PostMapping("/")
    public ResponseEntity<?> saveEnquiryMessage(@RequestBody EnquiryResponse enquiryResponse) {
        enquiryResponse = enquiryService.saveEnquiryMessage(enquiryResponse);
        return ResponseEntity.ok(enquiryResponse);
    }

    @GetMapping("/property/{propertyId}")
    public ResponseEntity<?> getAllEnquiryResponsesForAProperty(@PathVariable(value = "propertyId") Long propertyId) {
        EnquiryResponses responses = enquiryService.getAllEnquiryResponsesForAProperty(propertyId);
        return ResponseEntity.ok(responses);
    }

    @GetMapping("/{enquiryId}")
    public ResponseEntity<?> getEnquiryMessage(@PathVariable(value = "enquiryId") Long enquiryId)
            throws ItemNotFoundException {
        return ResponseEntity.ok(enquiryService.getEnquiryMessage(enquiryId));
    }
}
