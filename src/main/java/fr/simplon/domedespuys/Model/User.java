package fr.simplon.domedespuys.Model;

import com.fasterxml.jackson.annotation.JsonView;
import fr.simplon.domedespuys.View.UserView;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 80)
    @JsonView(UserView.Id.class)
    private String email;

    @Column(nullable = false)
    @JsonView(UserView.Password.class)
    private String password;

    @Column(nullable = false, length = 80)
    @JsonView(UserView.Firstname.class)
    private String firstname;

    @Column(nullable = false, length = 80)
    @JsonView(UserView.Lastname.class)
    private String lastname;

    @Column(length = 80)
    @JsonView(UserView.Phone.class)
    private String phone;

    @Column(nullable = false, length = 80)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "user")
    List<Purchase> purchases = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    @JsonView(UserView.Addresses.class)
    List<Address> addresses = new ArrayList<>();
}
