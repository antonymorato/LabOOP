package TaskOOP;

import java.util.Random;
import java.util.Scanner;

public  class Controller {
    public static Scanner f;
    public static Random rand;
    private double inputPrice;
    private static int inputAmount;
    public static void start()
    public void getData(Necklace neck)
    {
        System.out.println("Input the amount of stones in Necklake:");
        neck.setAmount(f.nextInt());
        System.out.println("Input the min price of one stone:");
        double temp=f.nextDouble();
        this.inputPrice = temp + rand.nextDouble() * 300;
    }

}
