import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double squareMeter = Double.parseDouble(scanner.nextLine()) * 7.61;
        double diss = squareMeter * 0.18;
        double total = squareMeter - diss;
        System.out.println("The final price is :" + " " + total  + " " + "lv.");
        System.out.println("The discount is :" + " " + diss + " " + "lv.");
    }
}
