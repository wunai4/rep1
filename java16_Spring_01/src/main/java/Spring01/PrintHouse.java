package Spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrintHouse {

	private Printer printer;
	
	public PrintHouse(Printer printer){
		this.printer=printer;
	}
	
	
	public void service() {
		printer.print();
	}
	
	public static void main(String[] args) {
//		PrintHouse printHouse=new PrintHouse();
//		printHouse.service();
		
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("Spring01/config.xml");
		 System.out.println(ctx);
		 //通过类型
		 Printer bean = ctx.getBean(PinPrinter.class);
		 bean.print();
		 
		  //通过名字
		  Printer printer = (Printer) ctx.getBean("pinPrinter");
		  printer.print();
		 
		 //通过名字和类型
		 Printer bean2 = ctx.getBean("pinPrinter", Printer.class);
		 bean2.print();
		 
	}
}
