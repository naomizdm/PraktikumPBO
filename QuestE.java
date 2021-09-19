import java.util.Scanner;
public class QuestE {
    public static void main(String[] args){
        Scanner bil = new Scanner(System.in);
        double a, t;
        a = bil.nextDouble();
        t = bil.nextDouble();
        double l;
        l = a * t / 2;
        System.out.printf("%.2f", l);
    }
}