package co.uk.javavm.spring.core.bean.inheritance;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext(
            "spring-core-example-bean-inheritance.xml");

        SubBean subBean = (SubBean) beanFactory.getBean("subBean");
        System.out.println(subBean.toString());

    }
}
