package boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//@SpringBootApplication
public class Testboot {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(28690)+ "         " +Integer.toBinaryString(15));
       // ConfigurableApplicationContext run = SpringApplication.run(Testboot.class);
    }
}
