package fr.simplon.domedespuys.Service;

import fr.simplon.domedespuys.Dto.UserPostDTO;
import fr.simplon.domedespuys.Dto.UserPutDTO;
import fr.simplon.domedespuys.Model.User;
import fr.simplon.domedespuys.Repository.UserRepository;
import fr.simplon.domedespuys.Service.Interfaces.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserService {

private UserRepository  userRepository;

    @Override
    public User create(UserPostDTO userDto){
        User user = new User();
        User userToSave = this.postDtoToUser(userDto,user);
        userRepository.save(userToSave);
        userRepository.flush();
        return userToSave;
    }

    @Override
    public User update(String id, UserPutDTO userDto){
        User userToSave = this.putDtoToUser(id,userDto);
        userRepository.save(userToSave);
        userRepository.flush();
        return userToSave;
    }

    @Override
    public boolean delete(String id){
        try {
            userRepository.deleteById(Long.parseLong(id));
            return true;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public User getById(String id) {
        Optional<User> user = userRepository.findById(Long.parseLong(id));
        return user.get();
    }

    public User postDtoToUser(UserPostDTO userPostDto, User user) {
        user.setEmail(userPostDto.getEmail());
        user.setPassword(userPostDto.getPassword());
        user.setFirstname(userPostDto.getFirstname());
        user.setLastname(userPostDto.getLastname());
        user.setCreatedAt(LocalDateTime.now());
        return user;
    }

    public User putDtoToUser(String id, UserPutDTO userPutDto) {
        Optional<User> user = userRepository.findById(Long.parseLong(id));
        if(user.isPresent()){
            User userToUpdate = user.get();
            userToUpdate.setFirstname(userPutDto.getFirstname());
            userToUpdate.setLastname(userPutDto.getLastname());
            userToUpdate.setPhone(userPutDto.getPhone());
        }
        return user.get();
    }
}
