package TaskOOP;

import java.util.ArrayList;
import java.util.List;

public class Necklace {
    private double totalWeight = 0;
    private double totalPrice = 0;

    protected List<Stone> necklace;
    private int amount;
    private String name;
    Necklace(Stone[] stones)
    {   necklace=new ArrayList<>();
        name="Semi Precious Necklace";

    }
    public boolean cmp(Stone stone)
    {

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
}
