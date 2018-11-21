package com.qushoping.opapi.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@ApiModel("用户建议")
@Entity
@Setter
@Getter
public class userAdvice {
    private Long id;
    private Integer status;
    private String content;
    private Long createTime;
    private Long userId;
    private Integer adviceLevel;
}
