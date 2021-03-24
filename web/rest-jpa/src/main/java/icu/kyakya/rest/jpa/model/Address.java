package icu.kyakya.rest.jpa.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Person user;

    private String country;
    private String city;
    private String PostalCode;


}
