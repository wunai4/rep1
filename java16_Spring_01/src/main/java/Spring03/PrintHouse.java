package Spring03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



/**
 * @Configuration就等于空的config.xml
 * @ComponentScan就等同于<context:component-scan>,扫描的默认值就是当前类所在的包及其子包
 * @author fred
 *
 */
@Configuration
@ComponentScan
public class PrintHouse {

	private Printer printer;
	
	
	public void service() {
		printer.print();
	}
	
	public static void main(String[] args) {

		
		 ApplicationContext ctx=new AnnotationConfigApplicationContext(PrintHouse.class);
		 System.out.println(ctx);
		 
		 Printer bean = ctx.getBean("pinPrinter", Printer.class);
		 System.out.println(bean);
		 bean.print();
		 
		 Printer bean1 = ctx.getBean("laserPrinter", Printer.class);
		 System.out.println(bean);
		 bean1.print();
		 
	}
}
