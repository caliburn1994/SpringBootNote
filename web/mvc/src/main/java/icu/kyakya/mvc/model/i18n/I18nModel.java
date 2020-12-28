package icu.kyakya.mvc.model.i18n;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;


@Data
public class I18nModel {

    @NotNull(message = "{notNull}")
    String message;
}
