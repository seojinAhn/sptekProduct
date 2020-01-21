package kr.co.sptek.product.productMgr.dao;

import java.util.List;


import kr.co.sptek.product.info.ConditionInfo;
import kr.co.sptek.product.info.ProductInfo;


public interface ProductMgrDao {
	
	//Product_Info
	int insertProductInfo(ProductInfo productInfo);
	List<ProductInfo> selectListProductInfo(ConditionInfo condition);
	ProductInfo selectProductInfo(ConditionInfo condition);
	ProductInfo getSelectProductInfoTotalNum(ConditionInfo condition);
	int deleteProductInfo(ConditionInfo condition);
	int updateProductInfo(ProductInfo productInfo);
	
	
	
}
