public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("male");
        wolf.setName("Wolf");
        wolf.setWeight(120);
        wolf.setAge(9);
        wolf.setColor("Black");

        System.out.println("Wolf's name is " + wolf.getName());
        System.out.println("Wolf's sex is " + wolf.getSex());
        System.out.println("Wolf's age is " + wolf.getAge());
        System.out.println("Wolf's weight is " + wolf.getWeight());
        System.out.println("Wolf's color is " + wolf.getColor());
        wolf.run();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();

    } 
}