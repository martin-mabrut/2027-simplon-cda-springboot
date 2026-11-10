package fr.simplon.domedespuys.Service.Interfaces;

import fr.simplon.domedespuys.Dto.PurchaseProductDTO;
import fr.simplon.domedespuys.Model.Purchase;
import fr.simplon.domedespuys.Model.PurchaseProduct;

public interface IPurchaseProductService {
        PurchaseProduct createPurchaseProduct(Purchase purchase, PurchaseProductDTO purchaseProductDto);
}
