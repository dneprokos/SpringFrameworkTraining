package org.teltov.spring._entry_point.lessons;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.teltov.spring.first_app.TestBean;

public class FirstSimpleExample {
    public static void run() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "firstAppContext.xml"
        );

        //By default this bean created as Singleton
        TestBean testBean1 = context.getBean("testBean", TestBean.class);
        TestBean testBean2 = context.getBean("testBean", TestBean.class);
        testBean2.setName("Kostas changed");

        System.out.println(testBean1.getName());

        context.close();
    }
}
