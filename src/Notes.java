public class Notes
{
    private int quantityOnHand, denomination;
    public Notes(int denomination)
    {
        this.denomination = denomination;
        this.quantityOnHand = 0;
    }
    public int getTotalValue()
    {
        int totalValue = denomination * quantityOnHand;
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
        return("$"+String.format("%4.2f", amount));
    }
    @Override public String toString()
    {
        return printPretty(getTotalValue()) + " in " + printPretty(denomination) + " notes";
    }
}
