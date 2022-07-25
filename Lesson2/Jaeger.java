public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight, 
            int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin){
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public int getStrengh() {
        return strength;
    }

    public void setArmor(int armor){
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    boolean drift() {
        System.out.println("You're in a drift mode");
        return true;
    }

    void move() {
        System.out.println("You walked 5 steps");
    }

    String destroyed() {
        return "Robot destroyd";
    }

    void useVortexCannon() {
        if (getArmor() >= 10) {
            System.out.println("Robot can use Vortex Cannon");
        } else {
            System.out.println("Robot can't use Vortex Cannon");
        }
    }
}
