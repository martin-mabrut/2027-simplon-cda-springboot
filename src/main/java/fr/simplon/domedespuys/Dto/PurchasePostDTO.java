package fr.simplon.domedespuys.Dto;

import fr.simplon.domedespuys.Model.PurchaseProduct;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PurchasePostDTO {
    AddressDTO address;
    List<PurchaseProduct> purchaseProducts;
}
