package TaskOOP;

import java.util.*;

public  class Controller {
    public static Scanner f;
    public static Random rand;
    private List<Stone> stoneList;
    private double inputPrice;
    private int inputAmount;
    private int minTransp;
    private int maxTransp;
    public Controller()
    {   stoneList=new ArrayList<>();
        f=new Scanner(System.in);
    rand=new Random();

    }

    public void begin()
        {
            Necklace necklace=new Necklace();
            getData(necklace);
            makeStones();
            makeNecklace(necklace);
            output(necklace);
            necklace.necklaceStonesSort();
        }
    public void getData(Necklace neck)
    {
        System.out.println("Input the amount of stones in Necklake:");
        int var=f.nextInt();
        inputAmount= var;
        System.out.println("Input the min price of one stone:");
        double temp=f.nextDouble();
        this.inputPrice = temp + rand.nextDouble() * 300;
        System.out.println("Input needed range(2 numbers from 1 to 10) of transparency:");
        minTransp=f.nextInt();
        maxTransp=f.nextInt();
    }

    public void makeStones()
    { double i;
        for(i=0;i<2*inputAmount;i++)
        {
            if (getType()==1)
            {
                stoneList.add(new PreciousStone("preciousStone" + i, i / 10 + i / 100, i * 1000,rand.nextInt(Stone.maxTransparency+1)) );
            }
            else if(getType()==0) {
                stoneList.add(new SemiPreciousStone("semiPreciousStone" + i, i / 5 + i / 150, i * 120 + i / 7,rand.nextInt(Stone.maxTransparency+1)));
            }
        }
    }
    public void makeNecklace(Necklace necklace)
    {   for(Stone stone:stoneList)
        if (stone.getPrice()>=inputPrice)
            necklace.AddStone(stone);
    }
    public double getInputPrice() {
        return inputPrice;
    }
    public boolean cmp(Stone stone1)
    {
        if(stone1.getPrice()>=inputPrice)
            return true;

        else {
            return false;
        }
    }
    public int getStonesByTransp()
    {int res=0;
        for(Stone stone:stoneList)
        {
            if(stone.transparency>=minTransp && stone.transparency<=maxTransp)
                res++;
        }
        return res;
    }
    public int getType() {
        int temp;
        temp = rand.nextInt(2);
        return temp;
    }
    public void output(Necklace necklace)
    {
        System.out.println(necklace.toString());
        System.out.println("amount of stones with transp. from "+minTransp+" to "+maxTransp+":"+ getStonesByTransp());
    }
}

