import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Notes twenties=new Notes(20);
        Notes tens=new Notes(10);
        Notes fives=new Notes(5);
        Notes ones=new Notes(1);
        Coins quarters=new Coins(0.25f,0.2f);
        Coins dimes=new Coins(0.10f,0.08f);
        Coins nickels=new Coins(0.05f,0.176f);
        Coins pennies=new Coins(0.01f,0.088f);

        dimes.increaseQuantity(41);
        nickels.increaseQuantity(17);
        pennies.increaseQuantity(132);
        ones.increaseQuantity(33);
        fives.increaseQuantity(12);
        tens.increaseQuantity(2);
        twenties.increaseQuantity(5);

        System.out.println(twenties.toString());
        System.out.println(tens.toString());
        System.out.println(fives.toString());
        System.out.println(ones.toString());
        System.out.println(quarters.toString());
        System.out.println(dimes.toString());
        System.out.println(nickels.toString());
        System.out.println(pennies.toString());

        float totalValue = twenties.getTotalValue() + tens.getTotalValue() +
                fives.getTotalValue() + ones.getTotalValue() +
                quarters.getTotalValue() + dimes.getTotalValue() +
                nickels.getTotalValue() + pennies.getTotalValue(); // total value of all money
        float totalWeight = quarters.getTotalWeight() + dimes.getTotalWeight() + nickels.getTotalWeight() + pennies.getTotalWeight(); // Coin weight
        System.out.println("Total money is $" + String.format("%4.2f",totalValue) + ", weight is " + totalWeight +"oz");
        System.out.print("How much do you need? ");
        float amount = scan.nextFloat();

        while(amount > 0.01f)
        {
            while(amount>=20 && twenties.getQuantityOnHand() > 0)
            {
                System.out.println("Give them a $20 note");
                twenties.decreaseQuantity(1);
                amount-=20;
            }
            while(amount>=10 && tens.getQuantityOnHand() > 0)
            {
                System.out.println("Give them a $10 note");
                tens.decreaseQuantity(1);
                amount-=10;
            }
            while(amount>=5 && fives.getQuantityOnHand() > 0)
            {
                System.out.println("Give them a $5 note");
                fives.decreaseQuantity(1);
                amount-=5;
            }
            while(amount>=1 && ones.getQuantityOnHand() > 0)
            {
                System.out.println("Give them a $1 note");
                ones.decreaseQuantity(1);
                amount-=1;
            }
            while(amount>= 0.25F && quarters.getQuantityOnHand() > 0)
            {
                System.out.println("Give them a quarter");
                quarters.decreaseQuantity(1);
                amount-=0.25F;
            }
            while(amount>= 0.10F && dimes.getQuantityOnHand() > 0)
            {
                System.out.println("Give them a dime");
                dimes.decreaseQuantity(1);
                amount-=0.10F;
            }
            while(amount>= 0.05F && nickels.getQuantityOnHand() > 0)
            {
                System.out.println("Give them a nickel");
                nickels.decreaseQuantity(1);
                amount-=0.05F;
            }
            while(amount>= 0.01F && pennies.getQuantityOnHand() > 0)
            {
                System.out.println("Give them a penny");
                pennies.decreaseQuantity(1);
                amount-=0.01F;
            }
            if(amount > 0.001F)
            {
                System.out.println("I don't have enough money. I still owe you $"+String.format("%.2f", amount));
                break;
            }
        }
        totalValue = twenties.getTotalValue() + tens.getTotalValue() +
                fives.getTotalValue() + ones.getTotalValue() +
                quarters.getTotalValue() + dimes.getTotalValue() +
                nickels.getTotalValue() + pennies.getTotalValue();
        totalWeight = quarters.getTotalWeight() + dimes.getTotalWeight() + nickels.getTotalWeight() + pennies.getTotalWeight();
        System.out.println("I have $" + String.format("%4.2f",totalValue) + " left, it's total weight is " + totalWeight +"oz");
    }
}