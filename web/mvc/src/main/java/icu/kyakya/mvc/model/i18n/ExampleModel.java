package icu.kyakya.mvc.model.i18n;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ExampleModel {

    @NotNull(message = "{notNull}")
    String message;
}
