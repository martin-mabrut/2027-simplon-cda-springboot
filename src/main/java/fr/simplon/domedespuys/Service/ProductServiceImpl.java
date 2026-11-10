package fr.simplon.domedespuys.Service;

import fr.simplon.domedespuys.Dto.ProductDTO;
import fr.simplon.domedespuys.Model.Product;
import fr.simplon.domedespuys.Service.Interfaces.IProductService;

public class ProductServiceImpl implements IProductService {
    @Override
    public Product create(ProductDTO dto) {}

    @Override
    public Product update(String id, ProductDTO dto) {}

    @Override
    public Product getById(String id) {}

    @Override
    public boolean delete(String id) {}
}
