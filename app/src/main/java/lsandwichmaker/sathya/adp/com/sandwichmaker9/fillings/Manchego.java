package lsandwichmaker.sathya.adp.com.sandwichmaker9.fillings;

import lsandwichmaker.sathya.adp.com.sandwichmaker9.R;

public class Manchego extends Cheese implements Filling {

    @Override
    public String getName() {
        return "Manchego";
    }

    @Override
    public int getImage() {
        return R.drawable.manchego;
    }

    @Override
    public int getKcal() {
        return 132;
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
