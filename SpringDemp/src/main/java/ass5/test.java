package ass5;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ass5.Max;

public class test {
public static void main(String[] args) {
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Max max=(Max)contex.getBean("max1");
		
		max.show();
		max.maxNum();
		
	}
}
