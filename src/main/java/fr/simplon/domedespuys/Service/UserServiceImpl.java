package fr.simplon.domedespuys.Service;

import fr.simplon.domedespuys.Dto.UserPostDTO;
import fr.simplon.domedespuys.Dto.UserPutDTO;
import fr.simplon.domedespuys.Model.User;
import fr.simplon.domedespuys.Repository.UserRepository;
import fr.simplon.domedespuys.Service.Interfaces.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserService {

private UserRepository  userRepository;

    @Override
    public User create(UserPostDTO userDto){ return null;}

    @Override
    public User update(String id, UserPutDTO userDto){ return null;}

    @Override
    public boolean delete(String id){ return false;}

    @Override
    public User getById(String id) {
        Optional<User> user = userRepository.findById(Long.parseLong(id));
        return user.get();
    }

    //public User postDtoToUser() { return null;}
}
