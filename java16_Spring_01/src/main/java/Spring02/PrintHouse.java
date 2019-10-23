package Spring02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class PrintHouse {

	private Printer printer;
	
	
	public void service() {
		printer.print();
	}
	
	public static void main(String[] args) {

		
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("Spring02/config.xml");
		 System.out.println(ctx);
		 
		 Printer bean = ctx.getBean("pinPrinter", Printer.class);
		 System.out.println(bean);
		 bean.print();
		 
		 Printer bean1 = ctx.getBean("laserPrinter", Printer.class);
		 System.out.println(bean);
		 bean1.print();
		 
	}
}
