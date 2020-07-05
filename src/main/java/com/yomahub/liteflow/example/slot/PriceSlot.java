package com.yomahub.liteflow.example.slot;

import com.yomahub.liteflow.entity.data.AbsSlot;
import com.yomahub.liteflow.example.bean.PriceStepVO;
import com.yomahub.liteflow.example.bean.ProductPackVO;
import com.yomahub.liteflow.example.bean.PromotionPackVO;
import com.yomahub.liteflow.example.enums.OrderChannelEnum;
import org.apache.commons.collections4.CollectionUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PriceSlot extends AbsSlot {

    private String orderNo;

    private boolean oversea;

    private List<ProductPackVO> productPackList;

    private OrderChannelEnum orderChannel;

    private String memberCode;

    private Long couponId;

    private List<PromotionPackVO> promotionPackList;

    private List<PriceStepVO> priceStepList = new ArrayList<>();

    private BigDecimal originalOrderPrice;

    private BigDecimal finalOrderPrice;

    private String printLog;

    public PriceStepVO getLastestPriceStep(){
        if(CollectionUtils.isEmpty(priceStepList)){
            return null;
        }else{
            return priceStepList.get(priceStepList.size()-1);
        }
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public List<ProductPackVO> getProductPackList() {
        return productPackList;
    }

    public void setProductPackList(List<ProductPackVO> productPackList) {
        this.productPackList = productPackList;
    }

    public OrderChannelEnum getOrderChannel() {
        return orderChannel;
    }

    public void setOrderChannel(OrderChannelEnum orderChannel) {
        this.orderChannel = orderChannel;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public List<PriceStepVO> getPriceStepList() {
        return priceStepList;
    }

    public void setPriceStepList(List<PriceStepVO> priceStepList) {
        this.priceStepList = priceStepList;
    }

    public void addPriceStep(PriceStepVO step){
        this.priceStepList.add(step);
    }

    public List<PromotionPackVO> getPromotionPackList() {
        return promotionPackList;
    }

    public void setPromotionPackList(List<PromotionPackVO> promotionPackList) {
        this.promotionPackList = promotionPackList;
    }

    public boolean isOversea() {
        return oversea;
    }

    public void setOversea(boolean oversea) {
        this.oversea = oversea;
    }

    public BigDecimal getFinalOrderPrice() {
        return finalOrderPrice;
    }

    public void setFinalOrderPrice(BigDecimal finalOrderPrice) {
        this.finalOrderPrice = finalOrderPrice;
    }

    public BigDecimal getOriginalOrderPrice() {
        return originalOrderPrice;
    }

    public void setOriginalOrderPrice(BigDecimal originalOrderPrice) {
        this.originalOrderPrice = originalOrderPrice;
    }

    public String getPrintLog() {
        return printLog;
    }

    public void setPrintLog(String printLog) {
        this.printLog = printLog;
    }
}
