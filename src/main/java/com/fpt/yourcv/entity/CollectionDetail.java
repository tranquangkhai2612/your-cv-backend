package com.fpt.yourcv.entity;

import com.fpt.yourcv.entity.keys.KeyCollectionDetail;
import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "collection_detail")
public class CollectionDetail {
    @EmbeddedId
    KeyCollectionDetail keyCollectionDetail;

    @ManyToOne
    @JoinColumn(name = "collection_id", insertable = false, updatable = false)
    private Collection collection;
    @ManyToOne
    @JoinColumn(name = "profile_id", insertable = false, updatable = false)
    private Profile profile;
    @Column(name = "collection_date")
    private Date collectionDate;

    public KeyCollectionDetail getKeyCollectionDetail() {
        return keyCollectionDetail;
    }

    public void setKeyCollectionDetail(KeyCollectionDetail keyCollectionDetail) {
        this.keyCollectionDetail = keyCollectionDetail;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }
}
