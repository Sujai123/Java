import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		Boolean flg=false;
		if(isBalanced(str))
		flg=true;
		System.out.println(str);
        System.out.println(flg);
	}
	public static boolean isBalanced(String str){
	    if(str.charAt(0)=='}'||str.charAt(0)==']'||str.charAt(0)==')')
	    return false;
	    Stack<Character> stk=new Stack();
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)=='{'||str.charAt(i)=='['||str.charAt(i)=='('){
	            stk.push(str.charAt(i));
	        }
	        if(str.charAt(i)=='}'||str.charAt(i)==']'||str.charAt(i)==')'){
	            if(stk.size()==0){
	                return false;
	            }
	            else{
	                char ch=str.charAt(i);
	                if((stk.peek()=='{'&&ch=='}')||(stk.peek()=='['&&ch==']')||(stk.peek()=='('&&ch==')')){
	                    stk.pop();
	                }else{
	                    return false;
	                }
	            }
	        }
	    }
	    if(stk.size()==0)
	    return true;
	    return false;
	}
}

