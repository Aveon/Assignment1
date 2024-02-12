public class Coins
{
    private int quantityOnHand;
    private float denomination, weight;
    public Coins(float den1, float w)
    {
        this.denomination = den1;
        this.weight = w;
        this.quantityOnHand = 0;
    }
    public float getTotalWeight()
    {
        float totalWeight = weight * quantityOnHand;
        return totalWeight;
    }
    public float getTotalValue()
    {
        float totalValue = denomination * quantityOnHand;
        return totalValue;
    }
    public void increaseQuantity(int quantity)
    {
        quantityOnHand+=quantity;
    }
    public void decreaseQuantity(int quantity)
    {
        quantityOnHand-=quantity;
        if(quantityOnHand < 0)
        {
            quantityOnHand = 0;
        }
    }
    public int getQuantityOnHand()
    {
        return quantityOnHand;
    }
    public String printPretty(float amount)
    {
        return("$"+String.format("%4.2f",amount));
    }

    @Override public String toString()
    {
        return printPretty(getTotalValue()) + " in " + printPretty(denomination) + " coins";
    }
}
