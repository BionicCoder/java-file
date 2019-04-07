import java. util. Collection;
import java.util.Collections;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.lang.String;

public class ShoppingCart {

    private static DecimalFormat df2 = new DecimalFormat("###.00");

        Product J01 = new Product("Jeans", 32.95);

        Product B01 = new Product("Blouse", 24.95);

        Product S01 = new Product("Socks", 7.95);

        public double bulkDiscount (Collection < Product > order) {

            jeansOffer(order);
            double sum = 0.0;

            for (Product M : order) {
                sum += (M.getPrice());

                sum = Math.round(sum*100.0)/100.0;

            }
            System.out.println("Total Orders = GBP " + sum);

            if (sum < 50) {
                sum = sum + 4.95;
                System.out.println("Orders under GBP 50 with Delevery Charge of 4.95");
            } else if (sum < 90) {
                sum = sum + 2.95;
                System.out.println("Orders under GBP 90 with Delevery Charge of 2.95");
            } else {
                System.out.println("Orders over GBP 90 with no Delevery Charge");
            }

            sum = Math.round(sum*100.0)/100.0;
            return sum;
        }


        public void jeansOffer (Collection < Product > order) {



            int jeansNo = 0;
            double p = 0.0;

            jeansNo = Collections.frequency(order, J01);

            System.out.println("Occurance of Jeans = " + jeansNo);

            if (order.contains(J01)) {

                System.out.println("Buy One Get One Half Price ");

            if (jeansNo > 1){
                if (jeansNo % 2 == 0) {

                    p = J01.getPrice();
                    p = (p*3)/4;
                    p = Math.round(p*100.0)/100.0;
                    J01.setPrice(p);

                } else {
                    {

                        p = J01.getPrice();
                        p = (p*5)/6;
                        p = Math.round(p*100.0)/100.0;

                        J01.setPrice(p);
                    }
                }
            }
            }
        }
    }
