package com.bank.BankSecurity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")
public class User {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    @Column(unique = true)
    private String username;

    @Setter
    @Getter
    private String password;

    @Setter
    @Getter
    private String role;

    //default Constructor
    public User(){}



}
