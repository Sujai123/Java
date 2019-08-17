public class YourClassNameHere {
    public static void main(String[] args) {
      Stack<Integer> stk=new Stack<Integer>();
      stk.push(34);
      stk.push(3);
      stk.push(31);
      stk.push(98);
      stk.push(92);
      stk.push(23);
      Stack<Integer> tempstk=new Stack<Integer>();
      System.out.println(stk);
      while(stk.size()!=0){
       int temp=stk.pop();
       if(tempstk.size()==0){
         tempstk.push(temp);
       }else if(tempstk.peek()>temp){
         tempstk.push(temp);
      }else{
        stk.push(tempstk.pop());
        stk.push(temp);
    }
      }
      System.out.println(tempstk);

}}
