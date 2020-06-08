import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is " + age);
    }
}
