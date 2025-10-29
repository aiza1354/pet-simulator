public class Cat extends Pet{
    String sound;
    String power;
    

    public Cat(String name, String gender, String sound, String power){
        super( name, gender);
        this.sound = sound;
        this.power = power;
    }
    public void usePower() {
        System.out.println("Your cat just flew!");
    }


}
