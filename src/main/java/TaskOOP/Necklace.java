package TaskOOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Necklace {
    private double totalWeight = 0;
    private double totalPrice = 0;

    protected List<Stone> necklace;
    private int amount;

    Necklace()
    {   necklace=new ArrayList<>();

    }
    public void AddStone(Stone stone)
    {
     this.necklace.add(stone);
     totalPrice+=stone.getPrice();
     totalWeight+=stone.getWeight();
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public int getAmount() {
        return amount;
    }
    public void necklaceStonesSort()
    {
        Collections.sort(necklace);
    }
    @Override
    public String toString()
    {return "Necklace:\n"+"Weight:"+String.format("%.4f", totalWeight)+";Price:"+String.format("%.4f",totalPrice);

    }
}
