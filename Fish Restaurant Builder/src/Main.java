// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Salmon, Tilapia or Halibut: ");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("Salmon")) {
            Salmon salmon = new Salmon();
            Cook cook = new Cook(salmon);

            cook.createFishMenu();
            cook.getFish().Display();
        } else if (type.equalsIgnoreCase("Tilapia")) {
            Tilapia til = new Tilapia();
            Cook cook = new Cook(til);

            cook.createFishMenu();
            cook.getFish().Display();
        } else if (type.equalsIgnoreCase("Halibut")) {
            Halibut hal = new Halibut();
            Cook cook = new Cook(hal);

            cook.createFishMenu();
            cook.getFish().Display();
        }

    }
}