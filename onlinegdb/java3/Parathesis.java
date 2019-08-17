import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		boolean flg=false;
		if(str.contains("*")){
		    if(isValid(str.replace("*","("))){
		        flg=true;
		    }
		    else if(isValid(str.replace("*",")"))){
		        flg=true;
		    }
		    else if(isValid(str.replace("*",""))){
		        flg=true;
		    }
		}else{
		    if(isValid(str)){
		        flg=true;
		    }
		}
		//if(flg)
		System.out.print(flg);
	}
	public static boolean isValid(String str){
	    if(str.charAt(0)==')')
	    return false;
	    Stack<String> stk=new Stack<>();
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)=='('){
	            stk.push(Character.toString(str.charAt(i)));
	        }
	        if(str.charAt(i)==')'){
	            if(stk.size()==0){
	                return false;
	            }else if(stk.peek().equals("(")){
	                stk.pop();
	            }
	        }
	    }
	    if(stk.size()==0)
	    return true;
	    else
	    return false;
	}
}

