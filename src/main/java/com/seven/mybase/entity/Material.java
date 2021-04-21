package com.seven.mybase.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author ice
 * @since 2021-04-20
 */
@Setter
@Getter
@TableName("material")
public class Material extends Model<Material> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

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

    private String operator;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Integer isDelete;

    public static final String ID = "id";

    public static final String MATERIAL_NAME = "material_name";

    public static final String MATERIAL_TYPE = "material_type";

    public static final String MATERIAL_URL = "material_url";

    public static final String SHOP_ID = "shop_id";

    public static final String CREATE_TIME = "create_time";

    public static final String UPDATE_TIME = "update_time";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Material{" +
                "id=" + id +
                ", materialName=" + materialName +
                ", materialType=" + materialType +
                ", materialUrl=" + materialUrl +
                ", shopId=" + shopId +
                ", operator=" + operator +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                "}";
    }
}
