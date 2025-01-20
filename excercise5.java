
package assignments6;
import java.util.Random;
import java.util.ArrayList;
public class excercise5 {
    public static void main(String[] args){
        ArrayList<Integer> tl = new ArrayList<>();
        Random random = new Random();
        for(int i=0; i<10;i++){
            tl.add(random.nextInt(100))+1);
        }
        System.out.println("danh sach:"+tl);
        if(tl.size()>3){
            tl.remove(3);
            System.out.println("sau khi xoa o muc 3:"+tl);
        }else{
            System.out.println("khong the xoa vi khong du phan tu");
        }
    }
}
