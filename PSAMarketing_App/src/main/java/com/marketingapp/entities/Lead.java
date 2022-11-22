package com.marketingapp.entities;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table
public class Lead {
private long id;
private String name;
private long mobile;
private String email;
}
