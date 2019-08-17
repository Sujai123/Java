import java.util.*;
public class Main
{
    static int[] d=new int[4];
    static int result=0;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str="Day 1$ T1 - N - X - 4 : T2 - W - X - 3;Day 2$ T1 - N - X - 6 : T1 - N - X - 5";
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)=='$'){
		        int index=str.lastIndexOf("D",i);
    		    str=str.replace(str.substring(index,i+1),"");    
		    }
		}
// 		System.out.println(str);
// 		str=str.replace(";",":");
        String[] days=str.split(";");
        for(String temp1:days){
            String[] attacks=temp1.split(":");
    		ArrayList N=new ArrayList();
    		ArrayList S=new ArrayList();
    		ArrayList E=new ArrayList();
    		ArrayList W=new ArrayList();
    		for(String temp:attacks){
    		    temp=temp.trim();
    		  //  System.out.println(temp+" "+temp.charAt(5));
    		    if(temp.charAt(5)=='N')
    		    N.add(temp);
    		    if(temp.charAt(5)=='S')
    		    S.add(temp);
    		    if(temp.charAt(5)=='E')
    		    E.add(temp);
    		    if(temp.charAt(5)=='W')
    		    W.add(temp);
    		}
    		int counter=0;
    		d[0]=isWin(N,0);
    		d[1]=isWin(S,1);
    		d[2]=isWin(E,2);
    		d[3]=isWin(W,3);
    		
    		
        }
		System.out.println(result);
// 		System.out.println("N "+N);
// 		System.out.println("S "+S);
// 		System.out.println("E "+E);
// 		System.out.println("W "+W);
	}
	public static int isWin(ArrayList B,int k){
	    int wall=0,win=0,max=0;
	    for(int i=0;i<B.size();i++){
	        String str=(String)(B.get(i));
	        int strength=(int)(str.charAt(13)-48);
	       // System.out.println(strength);
	        if(strength>d[k]){
	            win++;
	           // d[k]=0;
	            result++;
	            //wall=strength;
	        }
	        if(strength>max)
	        max=strength;
	    }
	    return max;
	}
}


