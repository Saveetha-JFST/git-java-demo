import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = Integer.parseInt(scanner.nextLine());
        int input2 = Integer.parseInt(scanner.nextLine());
        System.out.println(adder(input1, input2));
    }

    static int adder(int number1, int number2)
    {
        return number1 + number2;
    }
}
