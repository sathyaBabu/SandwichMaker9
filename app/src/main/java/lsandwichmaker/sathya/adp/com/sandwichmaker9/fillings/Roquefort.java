package lsandwichmaker.sathya.adp.com.sandwichmaker9.fillings;


import lsandwichmaker.sathya.adp.com.sandwichmaker9.R;

public class Roquefort extends Cheese implements Filling {

    @Override
    public String getName() {
        return "Roquefort";
    }

    @Override
    public int getImage() {
        return R.drawable.roquefort;
    }

    @Override
    public int getKcal() {
        return 160;
    }

    @Override
    public boolean getVeg() {
        return true;
    }

    @Override
    public int getPrice() {
        return 93;
    }
}
