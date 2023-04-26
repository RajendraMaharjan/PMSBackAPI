package com.miu.pmtbackendapi.domain.image;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.miu.pmtbackendapi.domain.property.Property;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyImage {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq")
    @SequenceGenerator(name = "my_seq", sequenceName = "my_sequence", allocationSize = 1)
    private Long pImageId;
    private String imageName;
    private String imageLocation;

    @JsonBackReference
    @ManyToOne
    private Property property;


}
