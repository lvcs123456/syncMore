package springtest1;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import entity.TestInstance;

public class GetbeanfromSpring {
    public static void main(String[] args) {
        new Thread().start();
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("/SpringContextApplication.xml");
        //TestInstance testInstance = classPathXmlApplicationContext.getBean("TestInstance",TestInstance.class);
        //  System.out.println( ToStringBuilder.reflectionToString(testInstance));
        // System.out.println( ToStringBuilder.reflectionToString(testInstance));
        // ClassPathXmlApplicationContext classPathXmlApplicationContext1 = new ClassPathXmlApplicationContext("/SpringContextApplication.xml");


    }
}
