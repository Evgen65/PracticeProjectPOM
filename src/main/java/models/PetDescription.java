package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder

public class PetDescription {
    private String type;
    private String sex;
    private String breed;
    private String height;
    private String color;
    private String distinctive_features;
    private String description;
    private String location;




}
