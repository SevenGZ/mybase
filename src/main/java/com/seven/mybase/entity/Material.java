package com.seven.mybase.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author gaozhao
 * @since 2021-07-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Material implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 素材类型 0-图片，1-视频
     */
    private Integer materialType;

    /**
     * 素材地址
     */
    private String materialUrl;

    /**
     * 素材文件名
     */
    private String materialFileName;

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
