package com.iridescent.ms.product.service.service;


import com.iridescent.ms.product.common.dto.ProductInfoDto;
import com.iridescent.ms.product.service.domain.ProductInfo;

/**
 * Description:
 *
 * @author  陌北有棵树
 * @version 2019/3/11
 */


public interface ProductInfoService {

    ProductInfoDto save(ProductInfo productInfo);


}
