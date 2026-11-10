package fr.simplon.domedespuys.Dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddressDTO {
    private String line;
    private String extraLine;
    private String zipCode;
    private String city;
    private String country;
    private String phone;
    private String firstname;
    private String lastname;
}
