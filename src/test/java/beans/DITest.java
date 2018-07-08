package beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by chelseayin on 2017/7/5.
 */
public class DITest {
    public static void main(String[] args) {
        ApplicationContext appContext=new ClassPathXmlApplicationContext("core.xml");

        Student student=(Student)appContext.getBean("student1");
        student.displayInfo();

    }
}
