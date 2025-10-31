import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! The cat distribution system has found you.");
        System.out.println("Please name your new cat.");
        String catName = scanner.nextLine();
        System.out.println("Please pick a gender for " + catName + ".");
        String gender = scanner.nextLine();

        Inventory inventory = new Inventory();
        ;
        Food food1 = new Food("Tuna", "High", false);
        Food food2 = new Food("Chicken", "High", false);
        Food food3 = new Food("Treat", "Medium", false);
        Food food4 = new Food("Grape", "Low", true);
        inventory.foods.add(food1);
        inventory.foods.add(food2);
        inventory.foods.add(food3);
        inventory.foods.add(food4);

        Toy toy1 = new Toy("Ball of Yarn", "High", false);
        Toy toy2 = new Toy("Cat feather ball", "High", false);
        Toy toy3 = new Toy("Laser pointer", "Medium", false);
        Toy toy4 = new Toy("String of LEDs", "Low", true);
        inventory.toys.add(toy1);
        inventory.toys.add(toy2);
        inventory.toys.add(toy3);
        inventory.toys.add(toy4);


        Cat cat = new Cat(catName, gender, "meow!", "flying ability!");
        while (cat.notHungry != 0 || cat.energy != 0 || cat.happiness != 0) {
            System.out.println("Play on!! Beware, if any of your pets statistics reach 0, your pet may fall ill! 🤒");
            System.out.println("What would you like to do next? \n A: View pet statistics 🐈. \n B: Play with your pet 🪀. \n C: Feed your pet 🍔. \n D: Make your pet sleep 💤.");
            String choice = scanner.nextLine();
            if (choice.equals("A")) {
                cat.view();
            }

            if (choice.equals("B")) {
                cat.play();
            }

            if (choice.equals("C")) {
                cat.eat();
            }

            if (choice.equals("D")) {
                cat.sleep();
            }

            if (
                    (cat.notHungry == 100 || cat.energy == 100 || cat.happiness == 100) || (cat.notHungry == 200 || cat.energy == 200 || cat.happiness == 200) || (cat.notHungry == 300 || cat.energy == 300 || cat.happiness == 300)
            ) {
                cat.grow();
                System.out.println("Your cat just flew 🪽!");
            }


            {
            }
        }
        System.out.println("Unfortunately, your cat has become ill 🤒! The cat authorities have removed your pet from your care 😔. You must now restart 🐈.");
    }
}

