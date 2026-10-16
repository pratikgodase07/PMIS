package october_16th.Consumer_Function;

import java.util.function.*;

;

public class ConsumerDemo
{
    public static void main(String[] args) {
        Consumer<String> smsNotifier = mobNo -> 
        {
            System.out.println("Sending the OTP to the ph no.: " + mobNo);
        };
        smsNotifier.accept("+91 8888101210");
      
    }
}
