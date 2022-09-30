package org.genspark;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {

        Resource r=new ClassPathResource("main.xml");
        BeanFactory factory = new XmlBeanFactory(r);

        Address a=(Address) factory.getBean("a");
        Phone p=(Phone) factory.getBean("p");

        Student s=(Student) factory.getBean("s");
        s.show();
    }
}