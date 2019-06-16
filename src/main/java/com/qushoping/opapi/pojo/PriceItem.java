package com.qushoping.opapi.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 价格条目
 *
 * @author yinguilong
 * @Time 2019/6/4 22:09
 **/
@Data
@Entity
public class PriceItem {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 活动价格
     */
    private BigDecimal activityPrice;
    /**
     * 备注
     */
    private String note;
}
