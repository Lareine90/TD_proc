import java.util.Scanner;

public class TP_EXERCICE6 {
    public static double
    calculdelta(double a, double b, double c) {
        return b*b -4*a*c;
    }
    public static void 
afficherSolutions(double a, double b, double c) {
    double delta = calculdelta(a, b, c);
    System.out.println(a+"x²+"+b+"x+"+c);
    if(delta>0) {
        double X1 = (-b + Math.sqrt(delta))/(2*a);
        double X2 = (-b - Math.sqrt(delta))/(2*a);
        System.out.println("les racines sont: " + X1 + " et " + X2);
    } else if(delta==0) {
        double X = (-b/2*a);
        System.out.println("la racine est"+X);

    } else {
        System.out.println("pas de racine reel");
    }

}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter le coefficient en x²: ");
    double a = scanner.nextDouble();
    System.out.println("enter le coefficient en x: ");
    double b = scanner.nextDouble();
    System.out.println("enter le terme independant: ");
    double c = scanner.nextDouble();
    afficherSolutions(a, b, c);
    scanner.close();
}
}

