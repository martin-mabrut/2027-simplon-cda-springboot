package fr.simplon.domedespuys.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PurchaseProductDTO {
    private int quantity;
    private Long price;
    private Long idProduct;
}
