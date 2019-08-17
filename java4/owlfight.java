import java.util.*;
public class owlfight{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int f=s.nextInt();;
        int a[]=new int[f];
        int b[]=new int[f];
        int max=0;
        for(int i=0;i<f;i++){
            a[i]=s.nextInt();
            b[i]=s.nextInt();
        }
        int tc=s.nextInt();
        int[] o1=new int[tc];
        int[] o2=new int[tc];
        for(int i=0;i<tc;i++){
        o1[i]=s.nextInt();
        o2[i]=s.nextInt(); 
    }
        String[] str=new String[f];
        for(int i=0;i<f;i++){
            str[i]="";
        }
        
        for(int i=0;i<f;i++){
            for(int j=0;j<str.length;j++){
                
                if(str[j].contains(Integer.toString(a[i])))
                    str[j]+=a[i]+""+b[i];
                if(str[j].contains(Integer.toString(b[i])))
                    str[j]+=a[i]+""+b[i];
                if(str[j].length()==0){
                str[j]+=a[i]+""+b[i];
                break;
                }
            }
        }
        // for(int i=0;i<f;i++){
        //     String[] friends=findfriends(str);
        // }
        int n=findfriends(str);
        // for(String temp:str){
        //     System.out.println(temp);
        // }
        
        for(int t=0;t<tc;t++){
        	boolean flg=true;
        char temp1=(char)(o1[t]+48),temp2=(char)(o2[t]+48);
        for(int i=0;i<n;i++){
        	if(str[i].contains(Integer.toString(o1[t]))&&str[i].contains(Integer.toString(o2[t]))){
        		flg=false;
        		break;
        	}
        	if(str[i].contains(Integer.toString(o1[t]))){
        		temp1=str[i].charAt(str[i].length()-1);
        	}
        	if(str[i].contains(Integer.toString(o2[t]))){
        		temp2=str[i].charAt(str[i].length()-1);
        	}
        }
        //System.out.println(temp1+" "+temp2);
        if(flg){
        	if(temp1>temp2)
        		System.out.println(o1[t]+"wins");
        	else
        		System.out.println(o2[t]+"wins");
        }else{
        	System.out.println("TIE");
        }
    }
    }
    public static int findfriends(String[] str){
        String[] res;
        int n=str.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                char[] ch=str[j].toCharArray();
                for(int m=0;m<ch.length;m++){
                if(str[i].contains(Character.toString(ch[m]))){
                    str[i]+=str[j];
                    for(int k=j;k<str.length-1;k++){
                        str[k]=str[k+1];
                      
                    }j--;
                    n=n-1;
                    break;
                }
                }
            }
        }
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[i].length();j++){
                if(str[i].substring(j+1).contains(Character.toString(str[i].charAt(j)))){
                    str[i]=str[i].charAt(j)+str[i].replace(Character.toString(str[i].charAt(j)),"");
                }
            }
        }
        //System.out.println(n);
        for(int i=0;i<n;i++){
        	char[] ch=str[i].toCharArray();
        	for(int j=0;j<ch.length-1;j++){
        		for(int k=j+1;k<ch.length;k++){
        			int n1=Integer.parseInt(Character.toString(ch[j]));
        			int n2=Integer.parseInt(Character.toString(ch[k]));
        			if(n1>n2){
        				char temp=ch[j];
        				ch[j]=ch[k];
        				ch[k]=temp;
        			}
        		}
        		str[i]=new String(ch);
        	}
        }
        return n;
    }
}