import java.util.Scanner;

public class input {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Input your first number: ");
        int num1 = in.nextInt();
        System.out.println("input your second number ");
        int num2 = in.nextInt();
        System.out.println(num1 + "x" + num2 + "=" + num1*num2);

    }
}
