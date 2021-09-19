import java.util.Scanner;
public class QuestF {
    public static void main(String[] args){
        Scanner bilangan = new Scanner (System.in);
        int a, b;
        int baris = 3;
        int kolom = 3;
        int arrayomik[][] = new int[baris][kolom];

        for(a=0; a<baris; a++){
            for(b=0; b<kolom; b++){
                arrayomik[a][b] = bilangan.nextInt();
            }
        }

        for(a=0; a<kolom; a++){
            for(b=0; b<baris; b++){
                System.out.print(arrayomik[b][a]+" ");
            }
            System.out.println();
        }
    }
}
        



