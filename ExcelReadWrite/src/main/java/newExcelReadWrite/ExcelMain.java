package newExcelReadWrite;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException
	{
		String d=ExcelCode.getStringData(0,1);
		System.out.println(d);
		String e=ExcelCode.getIntegerData(2,0);
		System.out.println(e);

	}

}
