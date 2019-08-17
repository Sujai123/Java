import java.util.*;
public class frequency{
    public static void main(String[] args) {
        String str = "abcddcbaabcddcba";
        ArrayList<Integer> count =new ArrayList();
        ArrayList<Character> characters =new ArrayList();
        for(int i = 0; i < str.length(); i++){
            if(!characters.contains(str.charAt(i))){
                characters.add(str.charAt(i));
                count.add(1);
            }
            else{
                int index = characters.indexOf(str.charAt(i));
                int temp = count.get(index);
                count.set(index, ++temp);
            }
        }
        int res = 0;
        for(int i = 0; i < count.size();i++){
            if(count.get(i)%2!=0){
                res++;
            }
        }
        if(res>0){
            res--;
        }
        System.out.println(res);
    }
}