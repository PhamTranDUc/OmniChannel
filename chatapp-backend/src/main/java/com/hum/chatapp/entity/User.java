package com.hum.chatapp.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Getter @Setter
@Table(
        name = "user"
//        ,
//        uniqueConstraints = @UniqueConstraint(
//                name = "constraint_unique_email",
//                columnNames = "email"
//        )
)
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "user_id")
//    private int userId;
//
//    @Column(name = "first_name")
//    private String firstName;
//
//    @Column(name = "last_name")
//    private String lastName;

    @Id
    private String id;

    private String name;

    private String image;


}
