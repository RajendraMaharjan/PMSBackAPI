package com.miu.pmtbackendapi.repo.offer;

import com.miu.pmtbackendapi.domain.offer.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfferRepository extends JpaRepository<Offer,Integer> {
    public Offer getOfferByOfferId(int offerId);
    public void removeByOfferId(int offerID);
    @Query("select o from Offer o where o.user.userId  =:userId")
    List<Offer> findAllOffersByUserId(int userId);

    @Query("select o from Offer o where o.property.propertyId  =:propertyId")
    List<Offer> getOfferHistoryByPropertyId(int propertyId);

}