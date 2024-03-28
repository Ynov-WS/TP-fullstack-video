package com.ynov.webfullstack.tp.video.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;


@Entity
public class Video {
    @Id
    private UUID uuid;
    @NotNull
    private String title;
    @NotNull
    private String shortDescription;
    private String longDescription;
    @ManyToMany
    private List<Tag> tags;

    public Video() {}

    public Video(String title, String shortDescription) {
        this.uuid = UUID.randomUUID();
        this.title = title;
        this.shortDescription = shortDescription;
    }



    // getters and setters
}