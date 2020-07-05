package com.yomahub.liteflow.example.bean;

import com.yomahub.liteflow.example.enums.OrderChannelEnum;

import java.math.BigDecimal;
import java.util.List;

public class PriceCalcReqVO {

    private Long id;

    private String orderNo;

    private boolean oversea;

    private List<ProductPackVO> productPackList;

    private OrderChannelEnum orderChannel;

    private String memberCode;

    private Long couponId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public boolean isOversea() {
        return oversea;
    }

    public void setOversea(boolean oversea) {
        this.oversea = oversea;
    }
}
