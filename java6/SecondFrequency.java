import java.util.*;

public class SecondFrequency{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        s.close();
        ArrayList<Frequency> ar = new ArrayList();
        for(int i = 0; i < str.length();){
            char ch = str.charAt(i);
            int count = findfreq(ch,str);
            ar.add(new Frequency(ch, count));
            str = str.replace(Character.toString(ch),"");
        }
        Collections.sort(ar);
        // for(int i = 0; i < ar.size(); i++){
        //     Frequency temp = ar.get(i);
        //     System.out.println(temp.ch+" "+temp.count);
        // }
        Frequency temp2;
        boolean flg=false;
        if(ar.size()>1){
            Frequency temp = ar.get(1);
            temp2=ar.get(0);
            if(temp.count!=temp2.count){
                if(ar.size()==2){
                    flg=true;
                }else{
                    temp2 = ar.get(2);
                    if(temp.count!=temp2.count){
                        flg=true;
                    }else{
                        flg=false;
                    }
                }
            }else{
                flg=false;
            }
        }
        if(flg){
            Frequency temp=ar.get(1);
            System.out.println("Second most frequent character is '"+temp.ch+"'");
        }else{
            System.out.println("No Second most frequent character");
        }
    }
    public static int findfreq(char ch, String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
}

class Frequency implements Comparable<Frequency>{
    char ch;
    int count;
    Frequency(char ch, int count){
        this.ch = ch;
        this.count = count;
    }
    
    public int compareTo(Frequency temp){
        return temp.count - this.count;
    }
}
