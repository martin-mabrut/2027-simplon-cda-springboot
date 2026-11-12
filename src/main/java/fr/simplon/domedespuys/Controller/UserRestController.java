package fr.simplon.domedespuys.Controller;

import com.fasterxml.jackson.annotation.JsonView;
import fr.simplon.domedespuys.Dto.UserPostDTO;
import fr.simplon.domedespuys.Dto.UserPutDTO;
import fr.simplon.domedespuys.Model.User;
import fr.simplon.domedespuys.Repository.UserRepository;
import fr.simplon.domedespuys.Service.UserServiceImpl;
import fr.simplon.domedespuys.View.UserView;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserRestController {

    private UserRepository userRepository;
    private UserServiceImpl userService;

    /*
    @GetMapping
    @JsonView(UserView.UserListView.class)
    public List<User> getUsers() {
        return this.userRepository.findAll();
    }
     */

    @GetMapping("/{id}")
    @JsonView(UserView.UserDetailView.class)
    public User getUser(@PathVariable String id) {
        return this.userService.getById(id);
    }

    @PostMapping
    @JsonView(UserView.UserDetailView.class)
    public User createUser(@RequestBody UserPostDTO userPostDto) {
        return this.userService.create(userPostDto);
    }

    @PutMapping("/{id}")
    @JsonView(UserView.UserDetailView.class)
    public User updateUser(@PathVariable String id, @RequestBody UserPutDTO userPutDto) {
        return this.userService.update(id, userPutDto);
    }

    @DeleteMapping("/{id}")
    @JsonView(UserView.UserDetailView.class)
    public boolean deleteUser(@PathVariable String id) {
        return this.userService.delete(id);
    }

    /*@GetMapping("/purchase/{purchase}")
    @JsonView(UserView.UserDetailView.class)
    public Optional<User> getUserByPurchases(@PathVariable String purchase) {
        return this.userRepository.findUserByPurchases(purchase);
    }*/
}
