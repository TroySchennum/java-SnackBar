package snackbar;

public class Main {
    private static void workWithData() {
        System.out.println("Welcome to the snackbar!");

        Customer c1 = new Customer("1", 37.75);
        Customer c2 = new Customer("2", 28.14);

        VendingMachine v1 = new VendingMachine("pepsi");

        // public Snack(String name, double quanity, double cost, int vendingId)
        Snack s1 = new Snack("oreos", 5, 1.00, v1.getId());
        Snack s2 = new Snack("lays", 35, 1.00, v1.getId());
        Snack s3 = new Snack("lays", 29, 1.00, v1.getId());
        Snack s4 = new Snack("lays", 21, 1.00, v1.getId());

        System.out.println(c1);

        System.out.println(s4);

        c1.setCash(c1.getCash() - 2);

        System.out.println(c1);

        System.out.println(s3);

        System.out.println(c2);

        s4.setQuanity(s4.getQuanity() - 2);

        System.out.println(s4);

        c1.setCash(c1.getCash() + 10);

        System.out.println(c1);

        c1.setCash(c1.getCash() - 1);

        System.out.println(c1);

        System.out.println(s2);

        s3.setQuanity(s3.getQuanity() + 12);

        System.out.println(s3);

        c2.setCash(c2.getCash() - 6);

        System.out.println(c2);

        s3.setQuanity(s3.getQuanity() - 3);

        System.out.println(s3);

    }

    public static void main(String[] args) {
        workWithData();
    }
}