import java.util.*;

public class CollegeDuplicateEntry{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet<Student> h = new HashSet<Student>(); 
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            String name=s.next();
            String str=s.next();
            Float a=s.nextFloat();
            String str1=s.next();
            Student t=new Student(name,str,a,str1);
            h.add(t);
        }
        for(Student e:h){
            System.out.println(e.name+" "+e.CourseOpted+" "+e.CutoffMarks+" "+e.Location);
        }
        
    }
}
 class Student {
    String  name;
    String  CourseOpted;
    Float CutoffMarks;
    String Location;
    public Student(String  name, String CourseOpted, Float CutoffMarks,String Location) {
        this.name = name;
        this.CourseOpted=CourseOpted;
        this.CutoffMarks=CutoffMarks;
        this.Location=Location;
    }
    public String getName() {
        return CourseOpted;
    }
    public void setName(String CourseOpted) {
        this.CourseOpted = CourseOpted;
    }
    public Float getCutoffMarks() {
        return CutoffMarks;
    }
    public void setCutoffMarks(Float CutoffMarks) {
        this.CutoffMarks = CutoffMarks;
    }
	public String getLocation() {
		return Location;
	}
	public void setLocation(String Location) {
		this.Location = Location;
	}

    public int hashCode(){
        int hashcode = 0;
        hashcode = (int)(CutoffMarks*20);
        hashcode += CutoffMarks.hashCode();
        return hashcode;
    }
 
	public boolean equals(Object obj) {
		Student e = null;
	    if(obj instanceof Student){
	        e = (Student) obj;
	    }
        if(this.getName().equals(e.getName())
        &&this.getCutoffMarks().equals(e.getCutoffMarks())
        &&this.getLocation().equals(e.getLocation())){
	        return true;
	    } else {
	        return false;
	    }  

    }
}

