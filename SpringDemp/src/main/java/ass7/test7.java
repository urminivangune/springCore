package ass7;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test7 {

public static void main(String[] args) {
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("my.xml");
		Merge arr=(Merge) contex.getBean("array5");
		
		//Merge2 arr1=(Merge2) contex.getBean("array6");
		
		arr.merge();
	}

}



