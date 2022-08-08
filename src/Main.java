import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        System.out.println("Nhập vào chuỗi");
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
           stack.push(s.charAt(i)+"");

        }
        System.out.println("Chuỗi đảo ngược");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stack.pop());

        }

    }
}
