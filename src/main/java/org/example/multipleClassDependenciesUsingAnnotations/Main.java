package org.example.multipleClassDependenciesUsingAnnotations;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("multipleClassDependenciesUsingAnnotations.xml");

        Student student=(Student) applicationContext.getBean("student");
        System.out.println(student);
    }
}
