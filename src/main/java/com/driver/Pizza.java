package com.driver;

public class Pizza {

    private int price = 0;
    private Boolean isVeg = true;
    private String bill = "";
    private int pizza = 0;
    private int extraCheese = 0;
    private int toppings = 0;
    private int paperBag = 0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
        {
            pizza = 300;
        }
        else
        {
            pizza = 400;
        }
        price += pizza;
    }

    public int getPrice(){
        return this.price;
    }

    public int getPizza() {
        return pizza;
    }
    public int getExtraCheese() {
        return extraCheese;
    }

    public int getToppings() {
        return toppings;
    }

    public int getPaperBag() {
        return paperBag;
    }

    public void addExtraCheese(){
        // your code goes here
        extraCheese = 80;
        price += extraCheese;
    }

    public void addExtraToppings(){
        if(isVeg) {
            toppings = 70;
            price += toppings;
        }
        else {
            toppings = 120;
            price += toppings;
        }
    }

    public void addTakeaway(){
        paperBag = 20;
        price += paperBag;
    }

    public String getBill(){
            bill += "Base Price Of The Pizza: "+pizza+ "\n";

            if(extraCheese != 0)
                bill += "Extra Cheese Added: "+extraCheese+ "\n";

            if(toppings != 0)
                bill += "Extra Toppings Added: "+toppings+ "\n";

            if(paperBag != 0)
                bill += "Paperbag Added: "+paperBag+ "\n";

            bill += "Total Price: "+price+ "\n";

        return this.bill;
    }
}
