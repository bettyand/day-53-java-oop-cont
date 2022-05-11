import java.util.ArrayList;
import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        ArrayList<Animal> animals = new ArrayList<>();
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

        while (true) {
            System.out.println("Please enter a name:");
            String newName = in.nextLine();
            if (newName == "") {
                break;
            }

            System.out.println("Is " + newName + " a dog? Yes or no:");
            boolean dogStatus;
            String ans = in.nextLine();
            if (ans.equalsIgnoreCase("yes")) {
                dogStatus = true;
            } else {
                dogStatus = false;
            }

            animals.add(new Animal(newName, dogStatus));
        }

        System.out.println("Looks like animals are back on the menu, boys:");

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        in.close();
    }
}
