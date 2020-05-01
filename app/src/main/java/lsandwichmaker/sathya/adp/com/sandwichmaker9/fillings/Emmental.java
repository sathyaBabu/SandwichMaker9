package lsandwichmaker.sathya.adp.com.sandwichmaker9.fillings;


import lsandwichmaker.sathya.adp.com.sandwichmaker9.R;

public class Emmental extends Cheese implements Filling {

    @Override
    public String getName() {
        return "Emmental";
    }

    @Override
    public int getImage() {
        return R.drawable.emmental;
    }

    @Override
    public int getKcal() {
        return 120;
    }

    @Override
    public boolean getVeg() {
        return true;
    }

    @Override
    public int getPrice() {
        return 65;
    }
}
