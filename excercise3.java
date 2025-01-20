
package assignments6;
import java.util.ArrayList;
public class excercise3 {
    public static void main(String[] args) {
        ArrayList<Double> tl = new ArrayList<>();

        tl.add(10.99);
        tl.add(25.50);
        tl.add(7.75);
        tl.add(15.30);
        tl.add(42.99);

        System.out.println("Product Prices:");
        for (int i = 0; i < tl.size(); i++) {
            System.out.println("Price " + (i + 1) + ": $" + tl.get(i));
        }
    }
}

