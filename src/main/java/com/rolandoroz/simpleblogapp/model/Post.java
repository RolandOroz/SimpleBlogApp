package com.rolandoroz.simpleblogapp.model;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;

@Entity
@Table
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column
    private String title;   //title of blog
    @Lob
    @Column
    @NotEmpty
    private String content;   //content of blog
    @Column
    private Instant createdOn;  //time stamp
    @Column
    private Instant updatedOn;  //time stamp
    @Column
    @NotBlank
    private String username;  //name of the user of blogApp

    //-------getter and setter set with Lombok---------//


}
