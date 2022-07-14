package ass2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
		

		ApplicationContext co=new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Num avg=(Num)co.getBean("ave");
		avg.show();
		
		
		
	}

}
