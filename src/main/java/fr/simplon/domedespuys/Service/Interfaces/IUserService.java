package fr.simplon.domedespuys.Service.Interfaces;

import fr.simplon.domedespuys.Dto.BrandDTO;
import fr.simplon.domedespuys.Dto.UserPostDTO;
import fr.simplon.domedespuys.Dto.UserPutDTO;
import fr.simplon.domedespuys.Model.Brand;
import fr.simplon.domedespuys.Model.User;

public interface IUserService extends
        ICreate<User, UserPostDTO>,
        IUpdate<User, UserPutDTO>,
        IGetItem<User>,
        IDelete
{
}
