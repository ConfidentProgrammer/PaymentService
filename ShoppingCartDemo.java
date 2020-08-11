/**
 * Filename: ShoppingCartDemo.java
 * 
 * this is the shopping cart
 * 
 * 
 * @author Deep patel, User: Deep
 */
package shoppingcartdemo;

import java.io.File;

public class ShoppingCartDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //gets the absolute path of the file
        File file = new File("ShoppingCartDemo.java");
        String absolutePath = file.getAbsolutePath();
        
        System.out.println(absolutePath);
        
        //creates the payment service instances
        PaymentServiceFactory factory = PaymentServiceFactory.getInstance();
        PaymentService creditService = factory.getPaymentService(PaymentServiceType.CREDIT);
        PaymentService debitService = factory.getPaymentService(PaymentServiceType.DEBIT);
        
        //creates the cart and adds products
        Cart cart = new Cart();
        cart.addProduct(new Product("bicycle", 510));
        cart.addProduct(new Product("blanket", 600));
        
        //set debit card as the paymentservice and pay
        cart.setPaymentService(creditService);
        cart.payCart();
        
        //set debit service  as the payment and pay
        cart.setPaymentService(debitService);
        cart.payCart();
    }
    
}
