package fr.simplon.domedespuys.Model;

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
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, length = 80)
    private String firstname;

    @Column(nullable = false, length = 80)
    private String lastname;

    @Column(length = 80)
    private String phone;

    @Column(nullable = false, length = 80)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "user")
    List<Purchase> purchases = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    List<Address> addresses = new ArrayList<>();
}
