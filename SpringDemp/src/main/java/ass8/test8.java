package ass8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class test8 {
	public static void main(String[] args) {
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Ascending item=(Ascending) contex.getBean("itemlist");
		
		item.show();
		
		
		
	item.ascending();
	item.descending();

		
	item.removeDuplicate();
		
	}
}
