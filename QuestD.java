import java.util.Scanner;
public class QuestD {
    public static void main (String[] args) {
        Scanner banyakBebek = new Scanner(System.in);
        int n,m;
        n = banyakBebek.nextInt();
        m = banyakBebek.nextInt();
        System.out.println("masing-masing " + n / m);
        System.out.println("bersisa " + n % m);
    }
}