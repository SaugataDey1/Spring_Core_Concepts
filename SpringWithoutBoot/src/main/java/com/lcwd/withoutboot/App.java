package com.lcwd.withoutboot;

import com.lcwd.withoutboot.beans.CartService;
import com.lcwd.withoutboot.beans.OrderService;
import com.lcwd.withoutboot.beans.UserService;
import com.lcwd.withoutboot.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Application Started!" );

        // We have to create object of Application Context
        // this is for Annotation Configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context);
        CartService cartService1 = context.getBean("cartService1", CartService.class);
        cartService1.createCart();

        UserService bean = context.getBean(UserService.class);
        bean.saveUser();

        OrderService bean1 = context.getBean(OrderService.class);
        bean1.createOrder();



        // this is for XML based Configuration
       // ApplicationContext context = new ClassPathXmlApplicationContext();
    }
}
