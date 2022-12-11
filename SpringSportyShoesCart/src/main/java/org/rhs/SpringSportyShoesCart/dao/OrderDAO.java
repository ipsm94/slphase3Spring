package org.rhs.SpringSportyShoesCart.dao;

import java.util.List;

import org.rhs.SpringSportyShoesCart.model.CartInfo;
import org.rhs.SpringSportyShoesCart.model.OrderDetailInfo;
import org.rhs.SpringSportyShoesCart.model.OrderInfo;
import org.rhs.SpringSportyShoesCart.model.PaginationResult;

public interface OrderDAO {

    public void saveOrder(CartInfo cartInfo);

    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
   
    public OrderInfo getOrderInfo(String orderId);
   
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}