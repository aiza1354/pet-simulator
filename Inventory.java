import java.util.ArrayList;

public class Inventory {
    ArrayList<Food> foods = new ArrayList<>();
    ArrayList<Toy> toys = new ArrayList<>();

    public void addFood(Food food) {
        foods.add(food);
    }

    public void takeFood(Food food) {
        foods.remove(food);
    }

    public void showCurrentInventoryOfFood() {
        for (int i = 0; i < foods.size(); i++) {
            System.out.println((i + 1) + ". " + foods.get(i));
        }
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void takeToy(Toy toy) {
        toys.remove(toy);
    }

    public void showCurrentInventoryOfToy() {
        for (int i = 0; i < toys.size(); i++) {
            System.out.println((i + 1) + ". " + toys.get(i));
        }

    }

}
