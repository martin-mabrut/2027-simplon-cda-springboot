package fr.simplon.domedespuys.Service;

import fr.simplon.domedespuys.Dto.UserPostDTO;
import fr.simplon.domedespuys.Dto.UserPutDTO;
import fr.simplon.domedespuys.Model.User;
import fr.simplon.domedespuys.Service.Interfaces.IUserService;

public class UserServiceImpl implements IUserService {

    @Override
    public User create(UserPostDTO userDto){}

    @Override
    public User update(String id, UserPutDTO userDto){}

    @Override
    public boolean delete(String id){}

    @Override
    public User getById(String id) {}

}
