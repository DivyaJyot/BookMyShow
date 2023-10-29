package com.fav.BookMyshow.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity(name="User_table")
public class User {
    private String name ;
    private String email;
    @OneToMany
    private List<Ticket> tickets;
}
