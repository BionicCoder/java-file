import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        ShoppingCart s = new ShoppingCart();

        Collection<Product> orderA = new ArrayList<Product>() {{
            add(s.S01);
            add(s.B01);
        }};
        Collection<Product> orderB = new ArrayList<Product>() {{
            add(s.J01);
            add(s.J01);
        }};
        Collection<Product> orderC = new ArrayList<Product>() {{
            add(s.J01);
            add(s.B01);
        }};
        Collection<Product> orderD = new ArrayList<Product>() {{
            add(s.S01);
            add(s.S01);
            add(s.J01);
            add(s.J01);
            add(s.J01);
        }};

        System.out.println("Order Price GBP "+ s.bulkDiscount(orderD));



    }

}
