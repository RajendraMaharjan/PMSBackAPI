package com.miu.pmtbackendapi.service.offer.impl;

import com.itextpdf.text.DocumentException;
import com.miu.pmtbackendapi.domain.offer.Offer;
import com.miu.pmtbackendapi.exception.customexception.ItemNotFoundException;
import com.miu.pmtbackendapi.repo.offer.OfferRepository;
import com.miu.pmtbackendapi.service.offer.OfferService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Service
public class OfferServiceImpl implements OfferService {
    @Autowired
    private OfferRepository offerRepository;

    @Override
    public Object placeOffer(Offer offer) throws ItemNotFoundException {
        String role = offer.getUser().getUserRole().toString();


        if (role.equalsIgnoreCase("Customer")) {
            return offerRepository.save(offer);
        } else
            throw new ItemNotFoundException("Cannot Place an Offer");
    }

    @Override
    public void deleteOfferById(int offerId)throws ItemNotFoundException {
        Offer offer=offerRepository.getOfferByOfferId(offerId);
        if ((offer.getProperty().getStatusEnum().toString()).equalsIgnoreCase("Pending")){
            offerRepository.removeByOfferId(offerId);
        }
        else
            throw new ItemNotFoundException("Cannot delete offer");
    }

    @Override
    public String getReceiptOfOffer(int offerId, int customerId) throws ItemNotFoundException, DocumentException, IOException {

        Offer offer=offerRepository.getOfferByOfferId(offerId);
        if((offer.getProperty().getStatusEnum().toString()).equalsIgnoreCase("Contingent")){

            return offer.getOfferedPrice()+"is offerred for"+offer.getProperty();
          //  generateReceipt();


//            byte[] pdfBytes = PdfGenerator.generatePdf(Arrays.asList(offer.getOfferId().toString(),"is generated with price ", offer.getOfferedPrice().toString() ,"for customer Id: ",Integer.toString(customerId)));
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_PDF);
//            headers.setContentDispositionFormData("attachment", "example.pdf");
//            headers.setContentLength(pdfBytes.length);
//            return new ResponseEntity<String>(pdfBytes, headers, HttpStatus.OK);





        }
        else
            throw new ItemNotFoundException("Cannot delete offer");
    }

    @Override
    public List<Offer> getAllOffersByUserId(int userId) {
        return offerRepository.findAllOffersByUserId(userId);
    }

    @Override
    public List<Offer> getOfferHistoryByPropertyId(int propertyId) {
        return offerRepository.getOfferHistoryByPropertyId(propertyId);
    }


}
