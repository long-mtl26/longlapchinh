
package assignments6;
import java.util.Scanner;
import java.util.ArrayList;
public class excercise2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Đỏ");
        colors.add("Xanh");
        colors.add("Tím");
        colors.add("Hồng");
        colors.add("Cam");
        System.out.println("Danh sách ban đầu: " + colors);
        colors.set(1, "Vàng");
        System.out.println("Danh sách sau khi cập nhật: " + colors);
    }
}
    

