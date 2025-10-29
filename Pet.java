public class Pet {
    String name;
    String gender;
    int happiness = 50;
    int energy = 50;
    int hunger = 50;
    int age = 0;

    public Pet(String name, String gender){
        this.name = name;
        this.gender = gender;
    }
    public void introducePet(){
            System.out.println("Your pet is called " + name + " and they are " + age + " years old.");
    }

    public void checkHappiness (int happiness){
    System.out.println("Your pet's happiness is at " + happiness + " %.");
    }

    public void checkEnergy (int energy) {
        System.out.println("Your pet's happiness is at " + happiness + " %.");
    }

    public void checkHunger (int hunger) {
        System.out.println("Your pet's happiness is at " + happiness + " %.");
    }

    public void eat(){
        hunger = hunger --;
        energy = energy++;
    }
    public void play(){
        hunger = hunger ++;
        energy = energy--;
        happiness = happiness ++;
    }
    public void sleep(){
        energy = energy++;
    }
    public void grow(){
        age = age++;
    }
}


