package com.yomahub.liteflow.example;

import com.google.common.collect.Lists;
import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.example.bean.PriceCalcReqVO;
import com.yomahub.liteflow.example.bean.ProductPackVO;
import com.yomahub.liteflow.example.bean.PromotionInfoVO;
import com.yomahub.liteflow.example.enums.CategoryEnum;
import com.yomahub.liteflow.example.enums.OrderChannelEnum;
import com.yomahub.liteflow.example.enums.PromotionTypeEnum;
import com.yomahub.liteflow.example.enums.SkuSourceEnum;
import com.yomahub.liteflow.example.slot.PriceSlot;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class TestCase implements CommandLineRunner {

    @Resource
    private FlowExecutor flowExecutor;

    @Override
    public void run(String... args) throws Exception {
        PriceCalcReqVO req = mockReq();
        flowExecutor.execute("mainChain", req, PriceSlot.class);

    }

    private PriceCalcReqVO mockReq(){
        PriceCalcReqVO req = new PriceCalcReqVO();
        req.setOrderNo("SO2020070611120001");
        req.setOversea(false);
        req.setMemberCode("M21152");
        req.setOrderChannel(OrderChannelEnum.APP);
        req.setCouponId(80081L);
        List<ProductPackVO> productPackList = new ArrayList<>();
        req.setProductPackList(productPackList);

        ProductPackVO productPack = new ProductPackVO();
        productPack.setProductId(5001L);
        productPack.setProductCode("PD5001XC");
        productPack.setSkuId(67001441L);
        productPack.setSkuCode("SKU5001XC001");
        productPack.setSkuName("夏季运动女式短裙M");
        productPack.setSkuSource(SkuSourceEnum.RAW);
        productPack.setCategory(CategoryEnum.CLOTHES);
        productPack.setSalePrice(new BigDecimal("139.00"));
        productPack.setCount(2);
        productPack.setPromotionList(Lists.newArrayList(
                new PromotionInfoVO(1001L,"PM1001","夏季满减活动", PromotionTypeEnum.FULL_CUT),
                new PromotionInfoVO(1002L,"PM1002","夏季满折活动", PromotionTypeEnum.FULL_DISCOUNT)));
        productPackList.add(productPack);

        productPack = new ProductPackVO();
        productPack.setProductId(6001L);
        productPack.setProductCode("PD6001XC");
        productPack.setSkuId(67002334L);
        productPack.setSkuCode("SKU6001XC001");
        productPack.setSkuName("男士迷彩短袜均码");
        productPack.setSkuSource(SkuSourceEnum.RAW);
        productPack.setCategory(CategoryEnum.CLOTHES);
        productPack.setSalePrice(new BigDecimal("59.00"));
        productPack.setCount(3);
        productPack.setPromotionList(Lists.newArrayList(
                new PromotionInfoVO(1001L,"PM1001","夏季满减活动", PromotionTypeEnum.FULL_CUT)));
        productPackList.add(productPack);

        productPack = new ProductPackVO();
        productPack.setProductId(8001L);
        productPack.setProductCode("PD8001XC");
        productPack.setSkuId(87002001L);
        productPack.setSkuCode("SKU8001XC001");
        productPack.setSkuName("纯棉毛巾");
        productPack.setSkuSource(SkuSourceEnum.RAW);
        productPack.setCategory(CategoryEnum.DAILY_USE);
        productPack.setSalePrice(new BigDecimal("28.00"));
        productPack.setCount(5);
        productPack.setPromotionList(Lists.newArrayList(
                new PromotionInfoVO(1002L,"PM1002","夏季满折活动", PromotionTypeEnum.FULL_DISCOUNT)));
        productPackList.add(productPack);

        productPack = new ProductPackVO();
        productPack.setProductId(9001L);
        productPack.setProductCode("PD9001XC");
        productPack.setSkuId(97552001L);
        productPack.setSkuCode("SKU9001XC001");
        productPack.setSkuName("杀菌护手凝胶");
        productPack.setSkuSource(SkuSourceEnum.RAW);
        productPack.setCategory(CategoryEnum.DAILY_USE);
        productPack.setSalePrice(new BigDecimal("30"));
        productPack.setCount(2);
        productPack.setPromotionList(Lists.newArrayList(
                new PromotionInfoVO(1003L,"PM1003","618抢购活动", PromotionTypeEnum.RUSH_BUY)));
        productPackList.add(productPack);

        return req;
    }
}