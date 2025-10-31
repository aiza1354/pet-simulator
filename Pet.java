import java.util.Scanner;
public class Pet {
    Scanner scanner = new Scanner(System.in);
    String name;
    String gender;
    int happiness = 30;
    int energy = 30;
    int notHungry = 30;
    int age = 0;

    public Pet(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void view() {
        System.out.println("Your beautiful cat is called " + name + ".\nThey are a " + gender + ".\nAt the moment they are " + age + " years old 🎉.\n Their happiness is at "+ happiness + " ☺️.\n Their fully fed level is at "+ notHungry + ".🍗\n Their energy is at" + energy + "🪫."  );
    }

    public void checkHappiness(int happiness) {
        System.out.println("Your pet's happiness is at " + happiness + " %.");
    }

    public void checkEnergy(int energy) {
        System.out.println("Your pet's happiness is at " + happiness + " %.");
    }

    public void checknotHungry(int notHungry) {
        System.out.println("Your pet's notHungry is at " + notHungry + " %.");
    }

    public void eat() {
        String food = scanner.nextLine();
        if (food.equals("A") || food.equals("B") || food.equals("C")) {
            notHungry += 10;
            energy += 10;
            System.out.println("Aww your pet loves it! Their fully fed level 🍗 has increased to  " + notHungry + " \nYour pet's happiness ☺️ has stayed the same.\nTheir energy 🪫 has increased to " + energy);
        } else {
            notHungry -= 30;
            energy -= 30;
            happiness -= 30;
            System.out.println("That was dangerous...📛\nYour pet's fully fed level 🍗 has decreased to  " + notHungry + " \nYour pet's happiness ☺️ has decreased to " + happiness + " \nYour pet's energy 🪫 has decreased to " + energy);
        }
    }

        public void play () {
            System.out.println("Pick a toy to play with your pet!\nA: Ball of Yarn\nB: Cat feather Ball\nC: Laser pointer\nD: String of LEDs");
            String toy = scanner.nextLine();
            if (toy.equals("A") || toy.equals("B") || toy.equals("C")) {
                notHungry -= 10;
                energy -= 10;
                happiness += 10;
                System.out.println("Aww your pet is having a lot of fun! Their fully fed level 🍗 has decreased to  " + notHungry + " \nYour pet's happiness ☺️ has increased to " + happiness + " \nTheir energy 🪫 has decreased to " + energy);
            } else {
                notHungry -= 30;
                energy -= 30;
                happiness -= 30;
                System.out.println("That was dangerous...📛\nYour pet's fully fed level 🍗 has decreased to  " + notHungry + " \nYour pet's happiness ☺️ has decreased to " + happiness + " \nYour pet's energy 🪫 has decreased to " + energy);
            }

        }

        public void sleep () {
            this.energy = this.energy + 10;
            this.notHungry = this.notHungry + 10;
        }

        public void grow () {
            if (happiness == 100 || notHungry == 100 || energy == 100) {
                this.age = +1;
                System.out.println("Your pet has turned " + age + " 🥳!!!");
            } else {
                System.out.println("Your pet is " + age + " years old 🥳. ");
            }

        }
    }
