package Spring02;

import org.springframework.stereotype.Component;

@Component
public class PinPrinter implements Printer{

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("针式打印机打印了");
		
	}

}
