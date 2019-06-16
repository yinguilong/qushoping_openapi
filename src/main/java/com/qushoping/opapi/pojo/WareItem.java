package com.qushoping.opapi.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author yinguilong
 */
@ApiModel("商品")
@Entity
@Data
public class WareItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * 主键
     */
    private  Long id;
    /**
     * 监听地址
     */
    private  String listenUrl;
    /**
     *
     */
    private  String itemName;
    private  Long firstListenTime;
    private  Long lastListenTime;
    private  Integer itemType;
    private  Integer itemStatus;
    private  Integer trend;
    private Integer itemSource;
    private String itemImage;
    private  Double itemPrice;
    /**
     * 创建时间
     */
    private Date createTime;
}
