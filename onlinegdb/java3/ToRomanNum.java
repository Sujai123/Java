import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String res="";
		while(n!=0){
		    if(n>=1000){
		        int quo=n/1000;
		        for(int i=0;i<quo;i++){
		            res+="M";
		        }
		        n=n%1000;
		    }
		    if(n>=900){
		        res+="CM";
		        n=n%900;
		    }
		    if(n>=500){
		        res+="D";
		        n=n%500;
		    }
		    if(n>=400){
		        res+="CD";
		        n=n%400;
		    }
		    if(n>=100){
		        res+="C";
		        n=n%100;
		    }
		    if(n>=90){
		        res+="XC";
		        n=n%90;
		    }
		    if(n>=50){
		        res+="L";
		        n=n%50;
		    }
		    if(n>=40){
		        res+="XL";
		        n=n%40;
		    }
		    if(n>=10){
		        res+="X";
		        n=n%10;
		    }
		    if(n>=9){
		        res+="IX";
		        n=n%9;
		    }
		    if(n>=5){
		        res+="V";
		        n=n%5;
		    }
		    if(n>=4){
		        res+="IV";
		        n=n%4;
		    }if(n>=1){
		        res+="I";
		        n=n%1;
		    }
		}
		System.out.println(res);
	}
}


