package lsandwichmaker.sathya.adp.com.sandwichmaker9.fillings;

public abstract class Cheese implements Filling {
    private String name;
    private int image;
    private String description;
    private int kcal;
    private boolean vegetarian;
    private int price;


    public Cheese() {
    }

    public abstract String getName();

    public abstract int getImage();

    public abstract int getKcal();

    public abstract boolean getVeg();

    public abstract int getPrice();
}
