import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] l=new int[n];
        String[][] str=new String[n][];
        for(int i=0;i<n;i++){
            l[i]=s.nextInt();
            str[i]=new String[l[i]];
            for(int j=0;j<l[i];j++){
                str[i][j]=s.next();
            }
        }
        for(int i=0;i<n;i++){
            int counter=Counter(str[i],l[i]);
            System.out.println(counter);
        }
    }
    public static int Counter(String[] str,int n){
        String temp=str[0];
        int count=0;
        for(int i=0;i<n;i++){
            boolean flg=false;
            for(int j=i+1;j<n;j++){
                if(str[i].equals(str[j])){
                    flg=true;
                    for(int k=j;k<n-1;k++){
                        str[k]=str[k+1];
                    }n=n-1;
                    j--;
                    
                }
            }
            if(flg)
            count++;
        }
        return count;
    }
}
