package fr.simplon.domedespuys.Service.Interfaces;

import fr.simplon.domedespuys.Dto.ProductDTO;
import fr.simplon.domedespuys.Model.Product;

public interface IProductService extends
        ICreate<Product, ProductDTO>,
        IUpdate<Product, ProductDTO>,
        IGetItem<Product>,
        IDelete
{
}
