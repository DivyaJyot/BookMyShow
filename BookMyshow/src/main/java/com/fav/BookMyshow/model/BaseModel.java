package com.fav.BookMyshow.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Column()
    private String id;
}
