package com.qushoping.opapi.pojo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Setter
@Getter
public class user implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private  Long id;
    private String userName;
    private String passWord;
    private String loginAccount;
    private String email;
    private String headerImg;
    private String phoneNum;
    private String career;
    private Boolean isDisable;
    private Long createDate;
    private String contact;

}
