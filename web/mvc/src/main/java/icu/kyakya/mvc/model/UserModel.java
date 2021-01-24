package icu.kyakya.mvc.model;

import lombok.Data;

@Data
public class UserModel {
    String username;
    String password;

    String status;
    String onlyValidate = "false";
}
