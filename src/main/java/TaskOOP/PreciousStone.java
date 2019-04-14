package TaskOOP;

public class PreciousStone extends Stone {

    public PreciousStone( double weight, double price,int transparency) {
      super(weight,price,transparency);
        this.name = "Precious Stone";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }



}
