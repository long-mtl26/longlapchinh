
package assignments6;
import java.util.Scanner;
import java.util.Arrays;
public class excercise1 {

        public static void main(String[] args) {
        Scanner tl = new Scanner(System.in);
        System.out.print("Nhập số phần tử trong mảng: ");
        int n = tl.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập các phần tử trong mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = tl.nextInt();
        }
        System.out.println("Mảng vừa nhập là: " + Arrays.toString(a));
    }
}
  