package Ass1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RoleTest 
{
	public static void main(String[] args)
	{
		
		ApplicationContext ref=new ClassPathXmlApplicationContext("Ass1/applicationcontext.xml");
		Role_Q1 ob=(Role_Q1) ref.getBean("ibean1");
		ob.show();
		
		
	}
	
}	