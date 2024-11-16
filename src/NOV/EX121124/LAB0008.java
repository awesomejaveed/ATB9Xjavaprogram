package NOV.EX121124;

public class LAB0008 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int result =(a > b)?(a > c)? a:b :(b > c)? b:c;
        System.out.printf("largest value is %d",result);
    }
}
