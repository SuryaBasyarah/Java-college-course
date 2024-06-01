public class hero {
    private String name;
    private double health;

    hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    void setName(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("This is " + this.name + " wwith health " + this.health);
    }

    public String toString() {
        return "Hero:   " + this.name;
    }
}
