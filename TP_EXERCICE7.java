import java.util.Scanner;
public class TP_EXERCICE7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int MonTab []= new int [10];
        int somme=0;
        int produit = 1;
        float moyenne = 0;
        int len = 0;
        System.out.println("Entrer les elements du tableau");
        for (int i = 0; i < 10; i++) {
            int u =i+1;
            System.out.println("ligne "+ u );
            MonTab[i]= scanner.nextInt();
        }
        len = MonTab.length;
        for (int i = 0; i < 10; i++) {
            somme = somme + MonTab[i];
        }
        moyenne = somme / len ;
        System.out.println("la somme de vos nombres est: "+ somme );
        System.out.println("la moyenne de vos nombres est: "+ moyenne );
        for (int i = 0; i < 10; i++) {
           produit  = produit * MonTab[i];
        }
        System.out.println("la produit de vos nombres est: "+ produit );
    }
}
