package com.miu.pmtbackendapi.resource.offer;

import com.itextpdf.text.DocumentException;
import com.miu.pmtbackendapi.domain.offer.Offer;
import com.miu.pmtbackendapi.exception.customexception.ItemNotFoundException;
import com.miu.pmtbackendapi.service.offer.OfferService;
import com.miu.pmtbackendapi.utils.PdfGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/offers")
public class OfferController {
    @Autowired
    private OfferService offerService;
    @Autowired
    private PdfGenerator pdfGenerator;

    //Place the offer
    @PostMapping()
    // @PreAuthorize(value = "hasRole('CUSTOMER')")
    public ResponseEntity<?> placeOffer(@RequestBody Offer offer) throws ItemNotFoundException {

        return ResponseEntity.ok(offerService.placeOffer(offer));

    }

    @DeleteMapping("/{offerId}")
    public void deleteOfferbyId(@PathVariable int offerId) throws ItemNotFoundException {
        offerService.deleteOfferById(offerId);
    }

   // @GetMapping("/{offerId}/customer/{customerId}")

    @GetMapping("/abc")
    public String getReceiptOfOffer(
            @PathVariable int offerId, @PathVariable int customerId
    ) throws ItemNotFoundException, DocumentException, IOException {
//       // Offer offer=offerService.
//        byte[] pdfBytes = PdfGenerator.generatePdf(Arrays.asList("offer.getOfferId().toString()","is generated with price ", "offer.getOfferedPrice().toString()" ,"for customer Id: ","Integer.toString(customerId)"));
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_PDF);
//        headers.setContentDispositionFormData("attachment", "Recipt_of_Offer.pdf");
//        headers.setContentLength(pdfBytes.length);
//        return new ResponseEntity<>((pdfBytes), headers, HttpStatus.OK);
//
return offerService.getReceiptOfOffer(offerId,customerId);


    }

    //Get all offers
    @GetMapping("/{userId}")
    public ResponseEntity<List<Offer>> getAllOffersByUserId(@PathVariable int userId) {
        List<Offer> offers = offerService.getAllOffersByUserId(userId);
        return new ResponseEntity<>(offers, HttpStatus.OK);
    }
    @GetMapping("/history/{propertyId}")
    public ResponseEntity<List<Offer>>getOfferHistoryByPropertyId(@PathVariable int propertyId){
        List<Offer>offers=offerService.getOfferHistoryByPropertyId(propertyId);
        return new ResponseEntity<>(offers, HttpStatus.OK);
    }
}
