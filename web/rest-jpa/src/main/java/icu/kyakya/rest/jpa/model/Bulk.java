package icu.kyakya.rest.jpa.model;

import lombok.Data;

import java.util.List;

@Data
public class Bulk<T> {
    private  List<T> bulk ;
}