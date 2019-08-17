
public class Main
{
	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		s1.s="Bye";
		System.out.println(s1.s);
		
		Singleton s2=Singleton.getInstance();
		System.out.println(s2.s);
	}
}
class Singleton{
    static Singleton instance=null;
    static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
    String s;
    private Singleton(){
        s="Hello";
    }
}

