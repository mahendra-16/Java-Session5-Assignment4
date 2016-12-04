package Session5;

import java.io.*;

public class NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataInputStream treat = new DataInputStream(System.in);
		
		try {
			int num = Integer.parseInt("XYZ");
			System.out.println(num);
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Throwing Number Format Exception.");
			System.out.println("Because String XYZ cannot be parsed to integer.");
			
		}
		
		
		
	}

}
