package NOV.EX121124;
import java.util.Scanner;
public class LAB0015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter your score :");
        byte score = sc.nextByte();

        if (score >= 90 && score <= 100 ){
            System.out.println('A');
        } else if (score >= 80 && score <=89) {
            System.out.println('B');
        }else if (score >= 70 && score <=79) {
            System.out.println('c');
        } else if (score >= 60 && score <=69) {
            System.out.println('c');
        }else{
            System.out.println("you are failed, better luck next time ");

        }
        sc.close();



    }
}
