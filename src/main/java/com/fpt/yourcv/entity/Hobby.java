package com.fpt.yourcv.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "hobbies")
public class Hobby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;
    @Column(name = "hobby_name")
    private String hobbyName;
    @Column(name = "description")
    private String description;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "updated_date")
    private Date updatedDate;

}
