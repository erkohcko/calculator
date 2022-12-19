package calculator;
import java.util.Scanner;
import java.io.IOException;
public class calculator1 {
	static Scanner scan;
	public static void main(String[] args) throws IOException {
		scan = new Scanner (System.in);
		System.out.print(calc(" "));
		
		
	
	}
	public static String calc(String input) throws IOException {
		String result = " ";
		String calculation = scan.nextLine();
		String[] nums = calculation.split(" ");
		int num1 = Integer.parseInt(nums[0]);
		int num2 = Integer.parseInt(nums[2]);
		if (num1 == 0 || num1 >= 11) {
			throw new IOException();
		}
		if (num2== 0 || num2 >= 11) {
			throw new IOException();
		}
		String operation = nums[1];
		switch (operation) {
        case "+":
          result = Integer.toString(num1 + num2);
            break;
        case "-":
        	 result = Integer.toString(num1 - num2);
            break;
        case "*":
        	 result = Integer.toString(num1 * num2);
            break;
        case "/":
        	 result = Integer.toString(num1 / num2);
            break;
        default:
        	System.out.print("ошибка");
        	
        	
		}
		return result;
		
	
		
	} }
	