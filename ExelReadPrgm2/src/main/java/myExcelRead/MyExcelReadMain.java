package myExcelRead;

import java.io.IOException;



public class MyExcelReadMain {

	public static void main(String[] args) throws IOException {
		String value1 = MyXLReadCode.stringDataRead(0, 1);
		System.out.println(value1);
		String value2 = MyXLReadCode.integerDataRead(1, 0);
		System.out.println(value2);
	}
}
