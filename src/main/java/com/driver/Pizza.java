package com.driver;

public class Pizza {

    private int Price;
    private Boolean isVeg;
    private String bill;
    private int extraCheese;
    private int toppings;
    private int paperBag;
    private boolean isExtraCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isPaperBagAdded;
    private  boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
        {
            this.Price = 300;
            this.toppings = 70;
        }
        else
        {
            this.Price = 400;
            this.toppings = 120;
        }
        this.extraCheese = 80;
        this.paperBag = 20;
        this.bill = "Base Price Of The Pizza: "+ Price + "\n";
    }

    public int getPrice(){
        return this.Price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheeseAdded == false)
        {
            Price += extraCheese;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(isToppingsAdded == false)
        {
            Price += toppings;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(isPaperBagAdded == false)
        {
            Price += paperBag;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){

        if(isBillGenerated == false)
        {
            if (isExtraCheeseAdded)
                bill += "Extra Cheese Added: " + extraCheese + "\n";

            if (isToppingsAdded)
                bill += "Extra Toppings Added: " + toppings + "\n";

            if (isPaperBagAdded)
                bill += "Paperbag Added: " + paperBag + "\n";

            bill += "Total Price: " + Price + "\n";

            isBillGenerated = true;
        }
        return this.bill;
    }
}
