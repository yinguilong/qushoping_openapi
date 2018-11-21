package com.qushoping.opapi.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@ApiModel("用户信息")
@Entity
@Setter
@Getter
public class user implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty("用户id")
    private Long id;
    @ApiModelProperty("用户名称")
    private String userName;
    @ApiModelProperty("用户密码")
    private String passWord;
    @ApiModelProperty("用户账号")
    private String loginAccount;
    @ApiModelProperty("用户邮箱")
    private String email;
    @ApiModelProperty("用户头像地址")
    private String headerImg;
    @ApiModelProperty("用户手机号")
    private String phoneNum;
    @ApiModelProperty("用户生平")
    private String career;
    @ApiModelProperty("是否禁用")
    private Boolean isDisable;
    @ApiModelProperty("创建时间unix时间戳")
    private Long createDate;
    @ApiModelProperty("用户联系方式")
    private String contact;

}
