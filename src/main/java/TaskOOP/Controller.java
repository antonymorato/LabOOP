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
            Sort(necklace);
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
        for(i=0;i<inputAmount*2;i++)
        {
            if (getType()==1)
            {
                stoneList.add(new PreciousStone(  i / 10 + i / 100, i * 1000,rand.nextInt(Stone.maxTransparency+1)) );
            }
            else if(getType()==0) {
                stoneList.add(new SemiPreciousStone( i / 5 + i / 150, i * 120 + i / 7,rand.nextInt(Stone.maxTransparency+1)));
            }
        }
    }
    public void makeNecklace(Necklace necklace)
    {   for(Stone stone:stoneList) {
        if (stone.getPrice() >= inputPrice && stone.transparency>=minTransp && stone.transparency<=maxTransp)
            necklace.AddStone(stone);
        if(necklace.necklace.size()==inputAmount)
            break;
    }
        if (necklace.necklace.size()<inputAmount)
        {   stoneList.clear();
            makeStones();
            makeNecklace(necklace);
        }
    }

    public int getStonesByTransp(Necklace necklace)
    {int res=0;
        for(Stone stone:necklace.necklace)
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

    public void swap(Necklace necklace,int x,int y)
    {    Stone temp;
        temp=necklace.necklace.get(y);
        necklace.necklace.set(y,necklace.necklace.get(x));
        necklace.necklace.set(x,temp);

    }
    public void Sort(Necklace necklace) {

        for (int i = 0; i < necklace.necklace.size() - 1; i++) {
            for (int j = 0; j < necklace.necklace.size() - i - 1; j++) {
          if(necklace.necklace.get(j).compareTo(necklace.necklace.get(j+1))==1){
                    swap(necklace,j, j + 1);

                }
            }
        }
    }
    public void output(Necklace necklace)
    {
        System.out.println(necklace.toString());
        System.out.println("amount of stones with transp. from "+minTransp+" to "+maxTransp+":"+ getStonesByTransp(necklace));
        necklace.print();
    }
}

