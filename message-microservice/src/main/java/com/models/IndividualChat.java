package com.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Data
public class IndividualChat extends ChatHistory {
    @OneToOne
    private User friend;
}
