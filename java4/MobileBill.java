import java.util.ArrayList;
import java.util.Scanner;
public class MobileBill {
    public static void main(String[] args){
      //  Scanner s=new Scanner(System.in);
        String str="00:05:17,959-720-018\n00:19:38,750-222-197\n00:14:21,959-720-018\n00:17:01,892-545-277";
        // while(true){
        //     String temp= "00:05:17,959-720-018\n00:19:38,750-222-197\n00:14:21,959-720-018\n00:17:01,892-545-27";//s.nextLine();
        //     //str+=temp+"\n";
        //     if(temp.equals(""))
        //         break;
        // }
        //System.out.println(str);
        int n;
        String[] str1=str.split("\n");
        boolean flg=true;
        for(int i=0;i<str1.length;i++)
            if(!checkCondition(str1[i]))
                flg=false;
        if(flg){
            n=solution(str);
            System.out.println(n);
        }else{
            System.out.println("Invalid input");
        }
    }
    public static int solution(String str){
        int n=str.length();
        String str1[]=str.split("\n");
        ArrayList<String>time=new ArrayList<>();
        ArrayList<String>ph=new ArrayList<>();
        for(int i=0;i<str1.length;i++){
        String time1=str1[i].substring(0,8);
        String ph1=str1[i].substring(9).replace("-","");
        //System.out.println(time1+" "+ph1);
        time.add(time1);
        ph.add(ph1);
        }
        //System.out.println(time+" "+ph);
        int cost=removedup(time,ph);
//        int hh=Integer.parseInt(str.substring(0,2));
//        int mm=Integer.parseInt(str.substring(3,5));
//        int ss=Integer.parseInt(str.substring(6,8));
        
        return cost;
    }
    public static boolean checkCondition(String str){
        int n=str.length();
        if(n!=20)
            return false;
        int h=Integer.parseInt(str.substring(0,2));
        int m=Integer.parseInt(str.substring(3,5));
        int s=Integer.parseInt(str.substring(6,8));
        if(h<0)
            return false;
        if(!(m>=0&&m<=59))
            return false;
        if(!(s>=0&&s<=59))
            return false;
        if(!(str.charAt(2)==':'&&str.charAt(5)==':'))
            return false;
        if(!(str.charAt(8)==','))
            return false;
        if(str.charAt(9)=='0')
            return false;
        if(!(str.charAt(12)=='-'&&str.charAt(16)=='-'))
            return false;
        return true;
    }
    public static int removedup(ArrayList time,ArrayList ph){
        int n=ph.size();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(ph.get(i).equals(ph.get(j))){
                    String temp=(String) time.get(i);
                    int hh1=Integer.parseInt(temp.substring(0,2));
                    int mm1=Integer.parseInt(temp.substring(3,5));
                    int ss1=Integer.parseInt(temp.substring(6,8));
                    temp=(String) time.get(j);
                    int hh2=Integer.parseInt(temp.substring(0,2));
                    int mm2=Integer.parseInt(temp.substring(3,5));
                    int ss2=Integer.parseInt(temp.substring(6,8));
                    int sec=calcSec(hh1,mm1,ss1,hh2,mm2,ss2);
                    String temp1=toTime(sec);
                    //System.out.println(temp1);
                    time.set(i,temp1);
                    time.remove(j);
                    ph.remove(j);
                    n=ph.size();
                    j--;
                }
            }
        }
        n=ph.size();
        System.out.println(time+" "+ph);
        int max=0,index=0;
        for(int i=0;i<n;i++){
            String temp=(String) time.get(i);
            //System.out.println(temp);
            int hh=Integer.parseInt(temp.substring(0,2));
            int mm=Integer.parseInt(temp.substring(3,5));
            int ss=Integer.parseInt(temp.substring(6,8));
            int sec=calcSec(hh,mm,ss,0,0,0);
            if(max==sec){
                String s1=(String) ph.get(i);
                String s2=(String) ph.get(index);
                if(s1.charAt(0)<s2.charAt(0)){
                    index=i;
                }
            }
            if(sec>max){
                max=sec;
                index=i;
            }
        }
        //System.out.println(n+" "+index);
        int cost=0;
        for(int i=0;i<n;i++){
            if(i!=index){
                cost+=calcCost((String) time.get(i));
            }
        }
        //System.out.println("blah");
        
        //System.out.println(cost);
        System.out.println("Promation applied to "+ph.get(index));
        return cost;
    }
    public static int calcSec(int hh1,int mm1,int ss1,int hh2,int mm2,int ss2){
        int sec=0;
        sec+=hh1*3600;
        sec+=mm1*60;
        sec+=ss1;
        sec+=hh2*3600;
        sec+=mm2*60;
        sec+=ss2;
        return sec;
    }
    public static String toTime(int sec){
        int h=0,m=0,s=0;
        while(sec>0){
            if(sec>60*60){
                h++;
                sec-=60*60;
            }else if(sec>60){
                m++;
                sec-=60;
            }else{
                s+=sec;
                break;
            }
        }
        String temp="";
        if(h<10)
            temp+="0";
        temp+=h+":";
        if(m<10)
            temp+="0";
        temp+=m+":";
        if(s<10)
            temp+="0";
        temp+=s;
        return temp;
    }
    public static int calcCost(String str){
            int hh=Integer.parseInt(str.substring(0,2));
            int mm=Integer.parseInt(str.substring(3,5));
            int ss=Integer.parseInt(str.substring(6,8));
            int sec=calcSec(hh,mm,ss,0,0,0);
            int cost=0;
            //System.out.println(sec);
            if(sec>=300){
            while(sec>0){
                    cost+=150;
                    sec=sec-60;
            }
            }
            else{
                cost=sec*3;
            }
            return cost;
    }
}
