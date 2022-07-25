public class JaegerTest {

    public static void main(String[] args) {

        Jaeger brawlerYukon = new Jaeger();
        brawlerYukon.setModelName("Brawler Yukon");
        brawlerYukon.setMark("Mark-1");
        brawlerYukon.setOrigin("USA");
        brawlerYukon.setHeight(70.8f);
        brawlerYukon.setWeight(2.4f);
        brawlerYukon.setSpeed(3);
        brawlerYukon.setStrength(9);
        brawlerYukon.setArmor(10);

        Jaeger diabloIntercept = 
            new Jaeger("Diablo Intercept", "Mark-2", "Chile", 70.4f, 2.6f, 3, 9, 8);
        System.out.println("First Robot: " + brawlerYukon.getModelName() + " was made in " + 
            brawlerYukon.getOrigin() + " by " + brawlerYukon.getMark());
        brawlerYukon.useVortexCannon();
        System.out.println(brawlerYukon.destroyed());
        brawlerYukon.setModelName("Kitty");
        System.out.println("We can rename this robot and now it is called" + 
            brawlerYukon.getModelName());
        System.out.println("Second robot: " + diabloIntercept.getModelName() + " is " + 
            diabloIntercept.getHeight() + "feet tall");
        
        if (diabloIntercept.getArmor() > brawlerYukon.getArmor()) {
            System.out.println(diabloIntercept.getModelName() + " has more armor than " + 
                brawlerYukon.getModelName());
        } else {
            System.out.println("Kitty wins!");
        }
    }
}