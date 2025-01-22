import java.util.Scanner ;
public class TP_EXERCICE5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer un nombre entier positif");
        int N = scanner.nextInt();
        int somme = 0;
        for (int i=1;i<N;i++)
        {
           somme = somme + i;
        }
        System.out.println("la somme des entiers inferieurs à  "+N+"  est  "+somme);
    }
}
