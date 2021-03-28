package icu.kyakya.rest.jpa.model;

import icu.kyakya.rest.jpa.model.audit.AuditMetadata;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Address extends AuditMetadata {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String country;
    private String city;
    private String PostalCode;


}
