package com.qushoping.opapi.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 用户商品关系表
 *
 * @author yinguilong
 * @Time 2019/6/4 22:15
 **/
@Entity
public class BoxItem {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 用户id
     */
    private Long userId ;
    /**
     * 商品id
     */
    private Long wareId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 状态
     */
    private Integer status;
}
