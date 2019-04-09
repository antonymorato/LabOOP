package TaskOOP;

import java.util.Random;

public class Gems{
    private double weight;
    private int price;
    private String name;
    public static Random rand=new Random();
    Gems()
    {weight=rand.nextDouble();
    price=rand.nextInt();

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

  //  @Override
    public int compareTo(Gems gem) {
        return 0;
    }
}
