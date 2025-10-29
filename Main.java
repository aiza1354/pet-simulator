import java.util.Scanner;
public class Main {
    public static void main(String [] args){
    Scanner scanner = new Scanner (System.in);
        System.out.println("Hello! The cat distribution system has found you.");
        System.out.println("Please name your new cat.");
        String catName = scanner.nextLine();

        Cat cat = new Cat (catName, "male","meow!", "flying ability!") ;
        cat.usePower();
        cat.grow();
        cat.introducePet();
    }
}

