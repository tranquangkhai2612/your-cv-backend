package com.fpt.yourcv.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity(name = "collections")
public class Collection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "collection_name")
    private String collectionName;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "updated_date")
    private Date updatedDate;
    @OneToMany(mappedBy = "collection")
    private Set<CollectionDetail> collectionDetailList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
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

    public Set<CollectionDetail> getCollectionDetailList() {
        return collectionDetailList;
    }

    public void setCollectionDetailList(Set<CollectionDetail> collectionDetailList) {
        this.collectionDetailList = collectionDetailList;
    }
}
