package lsandwichmaker.sathya.adp.com.sandwichmaker9.fillings;


import lsandwichmaker.sathya.adp.com.sandwichmaker9.R;

public class Gouda extends Cheese implements Filling {

    @Override
    public String getName() {
        return "Gouda";
    }

    @Override
    public int getImage() {
        return R.drawable.gouda;
    }

    @Override
    public int getKcal() {
        return 117;
    }

    @Override
    public boolean getVeg() {
        return true;
    }

    @Override
    public int getPrice() {
        return 80;
    }
}
