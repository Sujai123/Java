import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		HashMap<String,ArrayList> hm=new HashMap();
		String name=in.nextLine();
		String name1=in.nextLine();
		ArrayList<Email> ar=new ArrayList();
		ArrayList<Email> ar1=new ArrayList();
		ar.add(new Email("abc","123"));
		ar.add(new Email("def","456"));
		ar1.add(new Email("123","abc"));
		ar1.add(new Email("456","def"));
		hm.put(name,ar);
		hm.put(name1,ar1);
		for(String eee:hm.keySet()){
			System.out.println(eee);
		ArrayList<Email> temp1=hm.get(eee);
		for(Email temp:temp1)
		System.out.println(temp.to+" "+temp.msg);
}
	}
}
class Email{
	String to;
	String msg;
	Email(String to,String msg){
		this.to=to;
		this.msg=msg;
	}
}