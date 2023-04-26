package com.miu.pmtbackendapi.service.offer;

import com.itextpdf.text.DocumentException;
import com.miu.pmtbackendapi.domain.offer.Offer;
import com.miu.pmtbackendapi.domain.offer.request.OfferDTO;
import com.miu.pmtbackendapi.exception.customexception.ItemNotFoundException;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


public interface OfferService {

    OfferDTO placeOffer(OfferDTO offer) throws ItemNotFoundException;


    void deleteOfferById(int offerId)throws ItemNotFoundException;

    String getReceiptOfOffer(int offerId, int customerId) throws ItemNotFoundException, DocumentException, IOException;

    List<Offer> getAllOffersByUserId(int userId);


    List<Offer> getOfferHistoryByPropertyId(int propertyId);

    Offer getOfferByOfferId(Long offerId);
}
