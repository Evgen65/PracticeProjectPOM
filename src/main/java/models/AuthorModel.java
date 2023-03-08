package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder

public class AuthorModel {
    private String name;
    private String email;
    private String password;
    private String confirm_password;
}
