import java.util.Scanner;

public class TP_EXERCICE1 {
    public static void main(String[] args) {
        int temps, heures, min;
        float sec;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le temps en seconde ");
        temps = scanner.nextInt();
        heures= temps / 3600;
        min = (temps % 3600)/60;
        sec =  (temps % 3600)%60; 
       System.out.println("votre temps est : " + heures+ "heures "+ min + "minutes " + sec +"secondes" );

    }

}
