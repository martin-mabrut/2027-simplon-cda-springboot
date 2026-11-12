package fr.simplon.domedespuys.Controller;

import fr.simplon.domedespuys.Model.User;
import fr.simplon.domedespuys.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserRestController {

    private UserRepository userRepository;

    @GetMapping
    public List<User> getUsers() {
        return this.userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable long id) {
        return this.userRepository.findById(id);
    }

    @GetMapping("/purchase/{purchase}")
    public Optional<User> getUserByPurchases(@PathVariable String purchase) {
        return this.userRepository.findUserByPurchases(purchase);
    }
}
