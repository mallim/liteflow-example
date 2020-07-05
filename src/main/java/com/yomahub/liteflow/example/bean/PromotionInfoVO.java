package com.yomahub.liteflow.example.bean;

import com.yomahub.liteflow.example.enums.PromotionTypeEnum;

public class PromotionInfoVO {

    private Long id;

    private String promotionCode;

    private String promotionName;

    private PromotionTypeEnum promotionType;

    public PromotionInfoVO() {
    }

    public PromotionInfoVO(Long id, String promotionCode, String promotionName, PromotionTypeEnum promotionType) {
        this.id = id;
        this.promotionCode = promotionCode;
        this.promotionName = promotionName;
        this.promotionType = promotionType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public PromotionTypeEnum getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(PromotionTypeEnum promotionType) {
        this.promotionType = promotionType;
    }
}
