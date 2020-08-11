/**
 * Filename: DebitPaymentService.java
 * @author Deep patel, User: Deep
 */
package shoppingcartdemo;

public class DebitPaymentService extends PaymentService {

    @Override
    public void processAmount(double amount) {
        System.out.printf("Processing debit payment is \n", amount);
    }
    
}
