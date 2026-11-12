package fr.simplon.domedespuys.Service;

import fr.simplon.domedespuys.Dto.PurchasePostDTO;
import fr.simplon.domedespuys.Dto.PurchasePutDTO;
import fr.simplon.domedespuys.Model.Purchase;
import fr.simplon.domedespuys.Service.Interfaces.IPurchaseService;

import java.util.List;

public class PurchaseServiceImpl implements IPurchaseService {
    @Override
    public Purchase create(PurchasePostDTO dto) { return null; }

    @Override
    public Purchase update(String id, PurchasePutDTO dto) { return null; }

    @Override
    public Purchase getById(String id) { return null; }

    @Override
    public List<Purchase> getCollection() { return null; }
}
