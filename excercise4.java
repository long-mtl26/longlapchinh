
package assignments6;
import java.util.ArrayList;
public class excercise4 {
    public static void main(String[] args){
        ArrayList<String> tl = new ArrayList<>();
        tl.add("lon don");
        tl.add("paris");
        tl.add("ha noi");
        tl.add("tokyo");
        tl.add("sydney");
        System.out.println("danh sach cac thanh pho:" + tl);
        if(tl.contains("lon don")){
            System.out.println("co chua thanh pho lon don");
        }else{
            System.out.println("khong chua thanh pho lon don");
        }
    }
}
