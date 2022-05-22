package Day4;

public class Student {
	
	int roll;
	String name;
	int age;
	int marks;
	
	public Student() {
		roll=21;
		name="Chandan";
		age=22;
		marks=480;
		
	}

	public Student(int roll, String name, int age, int marks) {
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.marks=marks;
		
	}
	
	void showDetails() {
		if(18<age && age<60 && 0<marks && marks<500) {
			System.out.println("roll No:" + roll);
			System.out.println("Name is: "+ name);
			System.out.println("Age is: "+age);
			System.out.println("Marks is: "+marks);
			
		}else {
			System.out.println("Please Enter Valid Marks and Age");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1= new Student();
		s1.showDetails();
		
		Student s2=new Student(21,"Prem",10,300);
		s2.showDetails();
		
	}
}
