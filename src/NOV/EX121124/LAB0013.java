package NOV.EX121124;
import java.util.Scanner;
public class LAB0013 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER YOUR NAME :");
        String name = scanner.nextLine();

        System.out.println("ENTER YOUR AGE");
        int age = scanner.nextInt();

        System.out.print("ENTER YOUR SALARY");
        float salary = scanner.nextFloat();


        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

        scanner.close();









    }
}
