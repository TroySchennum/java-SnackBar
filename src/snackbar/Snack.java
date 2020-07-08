package snackbar;

public class Snack {
    private static int maxId = 0;

    private int id;
    private String name;
    private double quanity;
    private double cost;
    private int vendingId;

    public Snack(String name, double quanity, double cost, int vendingId) {
        maxId++;
        id = maxId;

        this.name = name;
        this.quanity = quanity;
        this.cost = cost;
        this.vendingId = vendingId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuanity() {
        return quanity;
    }

    public void setQuanity(double quanity) {
        this.quanity = quanity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getVendingId() {
        return vendingId;
    }

    public void setVendingId(int vendingId) {
        this.vendingId = vendingId;
    }

    @Override
    public String toString() {
        return "Quanity of snack " + id + " is " + quanity;
    }

}