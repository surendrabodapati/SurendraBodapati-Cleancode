package cleancode.ht4;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CalculateInterest {

	public static void CalInterest() {
		PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
		Scanner sc = new Scanner(System.in);
		ps.println("Enter principle amount: ");
		try {
			double principal = sc.nextDouble();
			ps.println("Enter time(in years) : ");
			double timePeriod = sc.nextDouble();
			ps.println("Enter rate: ");
			double rate = sc.nextDouble();
			ps.println("simple interest = " +((principal * timePeriod * rate) / 100));
			ps.println("compound interest = " +((principal * Math.pow(1 + (rate / 100), timePeriod)) - principal));
			
		} catch (Exception e) {
			ps.println("Please enter a valid input!");
			
		}
	}
		
}
