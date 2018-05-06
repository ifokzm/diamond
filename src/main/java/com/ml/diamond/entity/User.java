package com.ml.diamond.entity;

import lombok.Data;

@Data
public class User extends BaseEntity {

    private String username;

    private String loginame;

    private String passwd;

    private Integer candownrows;

    private String lastusercitycode;

    private String remarks;

    private String company;
}
