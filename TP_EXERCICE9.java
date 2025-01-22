import java.util.Scanner;

public class TP_EXERICE9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MonTableau1 [] []= new int[4][4];
        System.out.println("Entrer les elements de la premiere matrice ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 ; j++) {
                int u = i+1;
                int v = j+1;
                System.out.println("ligne "+ u + " colonne "+ v);
                MonTableau1[i][j]= scanner.nextInt();
            }
            
        }
        System.out.println("Votre premiere matrice est : ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 ; j++) {
                System.out.print(MonTableau1[i][j] + " ");
            }
            System.out.println();
        }
        int MonTableau2 [] []= new int[4][4];
        System.out.println("Entrer les elements de la deuxieme matrice ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 ; j++) {
                int m = i+1;
                int n = j+1;
                System.out.println("ligne "+ m + " colonne "+ n);
                MonTableau2[i][j]= scanner.nextInt();

            }
            
        }
        System.out.println("Votre deuxieme matrice est : ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 ; j++) {
                System.out.print(MonTableau2[i][j] + " ");
            }
            System.out.println();
        }
        int TrasTab2[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 ; j++) {
                TrasTab2[i][j]= MonTableau2[j][i];
                }
            }
                System.out.println("la transposee de la  matrice 2 est : ");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4 ; j++) {
                        System.out.print(TrasTab2[i][j] + " ");
                    }
                    System.out.println();
                }
                int produit[][] = new int[4][4];
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4 ; j++) {
                        produit[i][j]=0;
                        for (int k = 0; k < 4; k++) {
                            produit[i][j] =produit[i][j] + (  MonTableau1[i][k] * TrasTab2[k][j]);
                        }
                        }
                    }
                        System.out.println("le produit de la matrice 1 par la transposee de la matrice 2 vaut : ");
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4 ; j++) {
                                System.out.print(produit[i][j] + " ");
                            }
                            System.out.println();
                        }
            
        
    }
}