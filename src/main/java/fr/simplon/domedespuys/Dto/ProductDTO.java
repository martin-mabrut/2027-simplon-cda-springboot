package fr.simplon.domedespuys.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ProductDTO {
    private String label;
    private String description;
    private Long price;
    private String brand;
    private List<String> images;
}
