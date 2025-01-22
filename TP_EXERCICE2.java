import java.util.Scanner;

public class TP_EXERCICE2 {
    public static void main(String[] args) {
        int a, b, somme, produit;
        int c = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le premier nombre ");
        a = scanner.nextInt();
        System.out.println("Entrer le second nombre ");
        b = scanner.nextInt();
        produit = a * b;
        somme = a + b;
        if ( produit<0 ) {
            System.out.println("le produit est negatif, il vaut: "+ produit );
            a=c;
            a=b;
            c=b;
            System.out.println("la nouvelle valeur de a est :" + a + " la nouvelle valeur de b est: "+ b );
            
        }
        else if (produit >=0) {
            System.out.println("le produit est positif, il vaut: "+ produit );
            System.out.println("la nouvelle valeur de a est :" + produit + " la nouvelle valeur de b est: "+ somme );
        }
    }
}
