import java.util.Scanner;
public class TP_EXERCICE3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer le premier nombre");
        int N1 = scanner.nextInt();
        System.out.println("entrer le second nombre");
        int N2 = scanner.nextInt();
        System.out.println("choisir l'opération à effectuer entre +,-,*,/");
        char  oper = scanner.next().charAt(0);
        System.out.println(oper);
        if(oper=='+'){ 
            int Somme = N1+N2;
            System.out.println("la somme est "+Somme);
        }
        else if (oper=='-'){
            int difference = N1-N2;
            System.out.println("la difference est"+difference);
        }
        else if (oper=='*'){
            int produit = N1*N2;
            System.out.println("le produit est"+produit);
        }
        else if (oper=='/') {
            double quotient = N1/N2;
            System.out.println("leur quotient vaut"+quotient);
        }
        else {
            System.out.println("vous n'avez pas entré un caractere soit vous avez inseré un espace");
            System.out.println("veuiller réouvrir le programme et reessayer");
        }
    }
    
    }
