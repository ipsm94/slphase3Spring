package org.rhs.SpringSportyShoesCart.dao;

import org.rhs.SpringSportyShoesCart.entity.Product;
import org.rhs.SpringSportyShoesCart.model.PaginationResult;
import org.rhs.SpringSportyShoesCart.model.ProductInfo;

public interface ProductDAO {

   
   
    public Product findProduct(String code);
   
    public ProductInfo findProductInfo(String code) ;
 
   
    public PaginationResult<ProductInfo> queryProducts(int page,
                       int maxResult, int maxNavigationPage  );
   
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                       int maxNavigationPage, String likeName);

    public void save(ProductInfo productInfo);
   
}