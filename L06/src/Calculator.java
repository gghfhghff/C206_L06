/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Lucius Neo Tze Hean
 * Student ID: 21016412
 * Class: W65E
 * Date/Time created: Wednesday 24-05-2023 09:55
 */

/**
 * @author 21016412

 *
 */

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {

		return a * b;
	}
	
	public int divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException();
		}
		return a / b;
	}
	
	public boolean boundary(int a, int b ) {
		boolean bound = true;
		if ((a < 0) || (a > 9999) || (b < 0) || (b > 9999)) {
			bound = false;
		}
		return bound;
	}
}
