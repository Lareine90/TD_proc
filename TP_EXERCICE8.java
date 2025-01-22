import java.util.Scanner;

public class TP_EXERCICE8 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       int MonTableau [] []= new int[4][5];
       int nombre;
       System.out.println("Entrer les elements de la matrice ");
       for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 5 ; j++) {
            int u = i+1;
            int v = j+1;
            System.out.println("ligne "+ u + " colonne "+ v);
            MonTableau[i][j]= scanner.nextInt();

        }
           
       }
       System.out.println("Votre matrice est : ");
       for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 5 ; j++) {
            System.out.print(MonTableau[i][j] + " ");
        }
        System.out.println();
           
       }
    System.out.println("Entrer le nombre a verifier: ");
    nombre = scanner.nextInt();
    boolean trouve = false;
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 5 ; j++) {
            int m = i+1;
            int n = j+1;
            if (MonTableau[i][j] == nombre){
                trouve=true;
                System.out.println(" ce nombre appartient a la matrice ; a la ligne [" + m +"]"+ " et a la colonne [" + n+"]" );
            }
            else {
                System.out.println("Ce nombre n'appartient pas a la matrice ");
            }
        }


   }
}
}
