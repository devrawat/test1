#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.c.namespace;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        BeanFactory bean = new ClassPathXmlApplicationContext("spring-core-example-c-namespace.xml");
        CalculateInterest ci = (CalculateInterest) bean.getBean("calculateInterest");
        System.out.println(ci.toString());
    }
}
