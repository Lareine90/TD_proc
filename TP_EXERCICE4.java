import java.util.Scanner;

public class TP_EXERCICE4 {
    public static void main(String[] args) {
        int nbre,iter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le nombre de depart ");
        nbre = scanner.nextInt();
        System.out.println("combien de nombre vous voulez afficher ");
        iter = scanner.nextInt();
        System.out.println("vos " +iter+ "nombre precedent sont : "  );
        for (int i=0; i <iter; i++) { 
            nbre--;
            System.out.println(nbre);
            
        }
    }

}
