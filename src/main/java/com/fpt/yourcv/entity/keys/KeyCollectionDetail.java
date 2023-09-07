package com.fpt.yourcv.entity.keys;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class KeyCollectionDetail implements Serializable {
    @Column(name = "collection_id")
    private int collectionId;
    @Column(name = "profile_id")
    private int profileId;

    public KeyCollectionDetail(){};

    public KeyCollectionDetail(int collectionId, int profileId) {
        this.collectionId = collectionId;
        this.profileId = profileId;
    }

    public int getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(int collectionId) {
        this.collectionId = collectionId;
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }
}
