package fr.simplon.domedespuys.Service.Interfaces;

import fr.simplon.domedespuys.Dto.PurchasePostDTO;
import fr.simplon.domedespuys.Dto.PurchasePutDTO;
import fr.simplon.domedespuys.Model.Brand;
import fr.simplon.domedespuys.Model.Purchase;

public interface IPurchaseService extends
        ICreate<Purchase, PurchasePostDTO>,
        IUpdate<Purchase, PurchasePutDTO>,
        ICollection<Purchase>,
        IGetItem<Purchase>
{
}
