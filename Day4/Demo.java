package Day4;

public class Demo {

	public Demo() {
		System.out.println("Construstor Without Parameter");
	}
	public Demo(String s) {
		System.out.println("Construstor With String Value: "+s);
	}
	public Demo(int i) {
		System.out.println("Construstor With Integer Value: "+i);
	}
	public Demo(float f) {
		System.out.println("Construstor With float Value: "+f);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
			d=new Demo("Prem");
			d=new Demo(10.55f);
			d=new Demo(1234);

	}

}
