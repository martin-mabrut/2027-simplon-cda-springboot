package fr.simplon.domedespuys.Service.Interfaces;

import fr.simplon.domedespuys.Dto.BrandDTO;
import fr.simplon.domedespuys.Model.Brand;

public interface IBrandService extends
        ICreate<Brand, BrandDTO>,
        IUpdate<Brand, BrandDTO>,
        ICollection<Brand>,
        IGetItem<Brand>,
        IDelete
{
}
