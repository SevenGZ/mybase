package com.seven.mybase.entity;

import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 彩单配置信息表
 * </p>
 *
 * @author gaozhao
 * @since 2021-07-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BillConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 机构ID
     */
    private String shopId;

    /**
     * 商户实体店Id(基础平台)
     */
    private String shopEntityId;

    /**
     * 机构名称
     */
    private String shopName;

    /**
     * 商户展示名称
     */
    private String shopEntityName;

    /**
     * 机构或者商户属性()
     */
    private String shopAttr;

    /**
     * 商户logo地址
     */
    private String shopEntityLogoUrl;

    /**
     * 是机构还是商户(1:机构，0：商户)
     */
    private String shopOrEntity;

    /**
     * 是否展示消费明细(1-是 0-否)
     */
    private String consumDetailInfoFlag;

    /**
     * 是否展示消费总额(1-是 0-否)
     */
    private String totalAmtFlag;

    /**
     * 是否展示优惠金额(1-是 0-否)
     */
    private String couponAmtFlag;

    /**
     * 是否展示支付方式(1-是 0-否)
     */
    private String payTypeFlag;

    /**
     * 是否开启支付(1-是 0-否)
     */
    private String payOpenFlag;

    /**
     * 权益领取条件（1-关注公众号和手机 0-关注公众号）
     */
    private String interestCondition;

    /**
     * 是否展示电子凭证(1-是 0-否)
     */
    private String voucherInfoFlag;

    /**
     * 电子凭证领取方式(1：点击领取，0：扫码领取)
     */
    private String voucherInfoType;

    /**
     * 是否开发票(1-是 0-否)
     */
    private String invoiceFlag;

    /**
     * 是否展示积分信息(1-是 0-否)
     */
    private String integralInfoFlag;

    /**
     * 积分规则形式 1：数衍CRM积分规则，2：对接API接口规则，3：跳转链接
     */
    private String integralRuleType;

    /**
     * 积分规则形式 3的跳转链接URL
     */
    private String integralLinkUrl;

    /**
     * 积分领取方式(0：扫码领取，1：点击领取)
     */
    private String integralInfoType;

    /**
     * 积分渠道编码
     */
    private String integralChannelCode;

    /**
     * 是否需要退票推积分(0:否，1:是)
     */
    private String integralBreakFlag;

    /**
     * 是否展示优惠信息(1-是 0-否)
     */
    private String couponInfoFlag;

    /**
     * 优惠券领取方式(0：扫码领取，1：点击领取)
     */
    private String couponInfoType;

    /**
     * 是否展示停车券(1-是 0-否)
     */
    private String parkCouponFlag;

    /**
     * 停车券领取方式(0：扫码领取，1：点击领取)
     */
    private String parkCouponType;

    /**
     * 停车券图片url
     */
    private String parkCouponUrl;

    /**
     * 是否展示广告(1-是 0-否)
     */
    private String adInfoFlag;

    /**
     * 用户权限(0.关注1.关注+注册）
     */
    private String userRightType;

    /**
     * 关注地址
     */
    private String attendUrl;

    /**
     * 注册地址
     */
    private String registerUrl;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date cTimeStamp;

    /**
     * 标记是否在页面展示（1：展示，0：不展示）
     */
    private String showFlag;

    /**
     * 预留字段2
     */
    private String reserve2;

    /**
     * 预留字段3
     */
    private String reserve3;

    /**
     * 预留字段4
     */
    private String reserve4;

    /**
     * 预留字段5
     */
    private String reserve5;

    /**
     * 区别先打单后支付（1），还是先支付后打单（0）
     */
    private String billPayFlag;

    /**
     * 电子凭证开关,1-展示 0-不展示
     */
    private String voucherFlag;

    /**
     * 是否支持修改积分金额。0-关闭，不支持，1-开启，支持
     */
    private String integralUpdateFlag;

    /**
     * 是否需要查询第三方优惠券信息(0:不需要,1:需要)
     */
    private String thirdCouponFlag;

    private String aliCardAppId;

    /**
     * 是否需要调用积分(0:否，1:是)
     */
    private String thirdIntegralFlag;

    /**
     * 开放平台密钥SecretKey
     */
    private String openAppSecret;

    /**
     * 积分支持小数
     */
    private String integralSupportsDecimal;


}
