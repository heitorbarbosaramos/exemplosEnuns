package com.heitor.exemploEnuns;

import java.util.Date;

import com.heitor.exemploEnuns.entities.Order;
import com.heitor.exemploEnuns.entities.enun.OrderStatus;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Order order = new Order(1080, new Date(), OrderStatus.PEDING_PAYMENT);        
        
        System.out.println(order);
        
        OrderStatus os1 = OrderStatus.SHIPPEND;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        
        System.out.println(os1);
        System.out.println(os2);
    }
}
