package com.miu.pmtbackendapi.domain.offer.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.miu.pmtbackendapi.domain.property.PropertyDTO;
import com.miu.pmtbackendapi.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfferDTO {
//    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private String submissionDate;
    private Double offeredPrice;
    private User user;
    private PropertyDTO property; //Implementation in progress. Uncomment when implemented.
}
