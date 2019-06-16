package com.qushoping.opapi.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author yinguilong
 */
@ApiModel("用户建议")
@Entity
@Data
public class UserAdvice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer status;
    private String content;
    private Long createTime;
    private Long userId;
    private Integer adviceLevel;
}
