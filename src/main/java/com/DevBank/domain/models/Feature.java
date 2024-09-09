package com.DevBank.domain.models;

import jakarta.persistence.*;

@Entity(name = "tbFeature")
public class Feature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String icon;
    private String description;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getIcon() {return icon;}

    public void setIcon(String icon) {this.icon = icon;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}
}
