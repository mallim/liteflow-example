package com.yomahub.liteflow.example.bean;

import com.yomahub.liteflow.example.enums.CategoryEnum;
import com.yomahub.liteflow.example.enums.SkuSourceEnum;

import java.math.BigDecimal;
import java.util.List;

public class ProductPackVO {

    private Long productId;

    private String productCode;

    private Long skuId;

    private String skuCode;

    private String skuName;

    private SkuSourceEnum skuSource;

    private CategoryEnum category;

    private BigDecimal salePrice;

    private Integer count;

    private List<PromotionInfoVO> promotionList;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public SkuSourceEnum getSkuSource() {
        return skuSource;
    }

    public void setSkuSource(SkuSourceEnum skuSource) {
        this.skuSource = skuSource;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public List<PromotionInfoVO> getPromotionList() {
        return promotionList;
    }

    public void setPromotionList(List<PromotionInfoVO> promotionList) {
        this.promotionList = promotionList;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }else{
            if(getClass() != obj.getClass()){
                return false;
            }else{
                if(((ProductPackVO)obj).getSkuId().equals(this.getSkuId())){
                    return true;
                }else{
                    return false;
                }
            }
        }
    }


}
