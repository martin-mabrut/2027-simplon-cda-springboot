package fr.simplon.domedespuys.Service;

import fr.simplon.domedespuys.Dto.PurchasePostDTO;
import fr.simplon.domedespuys.Dto.PurchasePutDTO;
import fr.simplon.domedespuys.Model.Purchase;
import fr.simplon.domedespuys.Service.Interfaces.IPurchaseService;

import java.util.List;

public class PurchaseServiceImpl implements IPurchaseService {
    @Override
    public Purchase create(PurchasePostDTO dto) {}

    @Override
    public Purchase update(String id, PurchasePutDTO dto) {}

    @Override
    public Purchase getById(String id) {}

    @Override
    public List<Purchase> getCollection() {}
}
