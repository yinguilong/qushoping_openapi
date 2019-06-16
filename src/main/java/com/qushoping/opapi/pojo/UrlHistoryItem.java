package com.qushoping.opapi.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 商品的url历史
 *
 * @author yinguilong
 * @Time 2019/6/4 22:18
 **/
public class UrlHistoryItem {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * url地址
     */
    private String wareUrl;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 状态
     */
    private Integer status;

}
