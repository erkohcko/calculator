import java.util.Scanner;
import java.io.IOException;
public class Main {
             static Scanner scan;

        public static void main(String[] args) throws IOException {
            scan = new Scanner(System.in);
            System.out.print("Result: \n" +  calc(" "));

        }

        public static String calc(String input) throws IOException {
            String result = " ";
            String calculation = scan.nextLine();
            String[] nums = calculation.split(" ");
            if (nums.length < 3) {
                throw new IOException("Неверный формат, требуется пробел между операндами и оператором");
            }
            if (nums.length > 3) {
                throw new IOException("Неверный формат, укажите два операнда и один оператор(+, -, /, *) ");
            }
            int num1 = Integer.parseInt(nums[0]);
            int num2 = Integer.parseInt(nums[2]);
            if (num1 < 1 || num1 > 10) {
                throw new IOException("Неверный формат математической операции, укажите числа от 1 до 10 включительно");
            }
            if (num2 < 1 || num2 > 10) {
                throw new IOException("Неверный формат математической операции, укажите числа от 1 до 10 включительно");
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
                    throw new IOException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");

            }
            return result;

        }
    }


