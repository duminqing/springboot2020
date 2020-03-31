package com.example.demomybatis.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @author Administrator
 */
public interface ProductMapper {
    /**
     * 根据产品号查询产品
     *
     * @param productNum 产品号
     * @return 产品
     */
    @Select("SELECT productNum, productName FROM bside_product WHERE productNum = #{productNum}")
    Product getProductByProductNum(int productNum);
}
