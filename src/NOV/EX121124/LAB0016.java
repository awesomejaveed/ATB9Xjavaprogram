package NOV.EX121124;
import java.util.Scanner;
public class LAB0016 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side1");
        double side1 = sc.nextDouble();
        System.out.println("enter the side2");
        double side2 = sc.nextDouble();
        System.out.println("enter the side3");
        double side3 = sc.nextDouble();

        if (side1 == side2 && side2 == side3 && side3 == side1){
            System.out.println(" its an equalylateral triangle");
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println(" its an isoceles triangle ");
        } else if (side1 <= 0 || side2 <= 0|| side3 <= 0) {
            System.out.println("invalide, side must be in positive ");

        }else {
            System.out.println("its an scalen triangle ");
        }
        sc.close();


    }
}
