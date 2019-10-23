package Spring03;

import org.springframework.stereotype.Component;

@Component
public class LaserPrinter implements Printer{

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("激光打印机打印了");
		
	}

}
