public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		new derived();
	}
}
class MainBase{
    MainBase(){
        System.out.println("This is Base Constructor");
    }
    
}
class Base extends MainBase{
    Base(){
        System.out.println("This is Base Constructor");
    }
    
}
class derived extends Base{
    derived(){
        super();
        System.out.println("This is Derived construvt");
    }
}
