package com.miu.pmtbackendapi.domain.offer.request;

import com.miu.pmtbackendapi.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfferDTO {
    private LocalDateTime submissionDate;
    private Double offeredPrice;
    private User user;
    //private Property property; //Implementation in progress. Uncomment when implemented.
}
