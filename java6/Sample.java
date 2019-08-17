import java.util.*;

public class Sample{
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        Collections.rotate(ar, -1);
        System.out.println(ar);
    }
}