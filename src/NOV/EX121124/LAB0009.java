package NOV.EX121124;

public class LAB0009 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        int result = (a >= b && a >= c)? a : (b >= c ? b : c);
        System.out.printf("largest value %d",result);



    }
}
