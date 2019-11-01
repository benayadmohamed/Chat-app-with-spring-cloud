package com.models;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
//@DiscriminatorValue("CE")
public class GroupeChat extends ChatHistory {
    private String name;
}
