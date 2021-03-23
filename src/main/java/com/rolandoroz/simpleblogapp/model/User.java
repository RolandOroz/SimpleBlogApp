package com.rolandoroz.simpleblogapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//-------User entity---------//

@Entity
@Table
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String userName;
    @Column
    private String password;
    @Column
    private String email;

    //-----getter and setter------//


}
