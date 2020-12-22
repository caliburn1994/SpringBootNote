package icu.kyakya.SpringMVC.model;

import lombok.Data;

import javax.validation.constraints.Max;

@Data
public class ExampleModel {
    String field1;
    @Max(value = 30,message = "最大数据为30")
    int field2;
}
