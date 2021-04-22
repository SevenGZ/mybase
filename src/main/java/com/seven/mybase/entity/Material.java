package com.seven.mybase.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author gaozhao
 * @since 2021-04-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Material implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 素材名称
     */
    private String materialName;

    /**
     * 素材类型 0-图片，1-视频
     */
    private Integer materialType;

    /**
     * 素材地址
     */
    private String materialUrl;

    /**
     * 机构id
     */
    private String shopId;

    /**
     * 操作人
     */
    private String operator;

    private Date createTime;

    private Date updateTime;

    /**
     * 是否删除 0-否，1-是
     */
    private Boolean isDelete;


}
