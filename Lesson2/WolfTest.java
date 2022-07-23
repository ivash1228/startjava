public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = "male";
        wolf.name = "Wolf";
        wolf.weight = 500;
        wolf.age = 20;
        wolf.color = "White";
        System.out.printf("Wolf's name is %s\n", wolf.name);
        System.out.printf("Wolf's sex is %s\n", wolf.sex);
        System.out.printf("Wolf's age is %d\n", wolf.age);
        System.out.printf("Wolf's weight is %d\n", wolf.weight);
        System.out.printf("Wolf's color is %s\n", wolf.color);
        wolf.run();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();

    } 
}