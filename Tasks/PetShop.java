import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dogFood = Integer.parseInt(scanner.nextLine()) * 2.50;
        int catFood = Integer.parseInt(scanner.nextLine()) * 4;
        double total = dogFood + catFood;
        System.out.println(total + " " +"lv.");
    }
}
