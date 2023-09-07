package com.fpt.yourcv.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity(name = "profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "profile_photo")
    private String profilePhotoUrl;
    @Column(name = "headline")
    private String headline;
    @Column(name = "about")
    private String about;
    @Column(name = "country")
    private String country;
    @Column(name = "city")
    private String city;
    @Column(name = "website")
    private String portfolioWebUrl;
    @Column(name = "is_open_to_work")
    private boolean isOpenToWork;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "updated_date")
    private Date updatedDate;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(mappedBy = "profile")
    private Set<CollectionDetail> collectionDetails;
    @OneToMany(mappedBy = "profile")
    private Set<Patent> patents;
    @OneToMany(mappedBy = "profile")
    private Set<Honor> honors;
    @OneToMany(mappedBy = "profile")
    private Set<Skill> skills;
    @OneToMany(mappedBy = "profile")
    private Set<Education> educations;
    @OneToMany(mappedBy = "profile")
    private Set<Experience> experiences;
    @OneToMany(mappedBy = "profile")
    private Set<Language> languages;
    @OneToMany(mappedBy = "profile")
    private Set<Hobby> hobbies;

    public Set<CollectionDetail> getCollectionDetails() {
        return collectionDetails;
    }

    public void setCollectionDetails(Set<CollectionDetail> collectionDetails) {
        this.collectionDetails = collectionDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPortfolioWebUrl() {
        return portfolioWebUrl;
    }

    public void setPortfolioWebUrl(String portfolioWebUrl) {
        this.portfolioWebUrl = portfolioWebUrl;
    }

    public boolean isOpenToWork() {
        return isOpenToWork;
    }

    public void setOpenToWork(boolean openToWork) {
        isOpenToWork = openToWork;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
