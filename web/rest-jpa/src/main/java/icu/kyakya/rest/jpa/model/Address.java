package icu.kyakya.rest.jpa.model;

import icu.kyakya.rest.jpa.model.audit.AuditMetadata;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Address extends AuditMetadata {
    @Id
    @SequenceGenerator(name = "address_seq",
            allocationSize = 50)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "address_seq")
    private Long id;


    private String country;
    private String city;
    private String PostalCode;


}
