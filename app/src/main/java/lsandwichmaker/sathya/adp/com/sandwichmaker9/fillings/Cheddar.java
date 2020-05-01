package lsandwichmaker.sathya.adp.com.sandwichmaker9.fillings;


import lsandwichmaker.sathya.adp.com.sandwichmaker9.R;

public class Cheddar extends Cheese implements Filling {

    @Override
    public String getName() {
        return "Cheddar";
    }

    @Override
    public int getImage() {
        return R.drawable.cheddar;
    }

    @Override
    public int getKcal() {
        return 130;
    }

    @Override
    public boolean getVeg() {
        return true;
    }

    @Override
    public int getPrice() {
        return 75;
    }
}
