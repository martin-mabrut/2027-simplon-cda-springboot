package fr.simplon.domedespuys.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String line;

    @Column(length = 80)
    private String extraLine;

    @Column(nullable = false, length = 80)
    private String city;

    @Column(nullable = false, length = 20)
    private String zipCode;

    @Column(nullable = false, length = 30)
    private String country;

    @Column(length = 80)
    private String phone;

    @Column(nullable = false, length = 80)
    private String firstname;

    @Column(nullable = false, length = 80)
    private String lastname;

    @Column(nullable = false, length = 80)
    private LocalDateTime createdAt;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private User user;

}
