public class Runner {

	
	Drawing d; 
	//constructor injection point
	/*public Travel(Vehicle v) {
	this.v=v;
	} */
	//setter injection point
	
	public void setV(Drawing d) {
	this.d=d;
	}
	
	public void runner() {
	
	d.draw();
	
	System.out.println("We DRAWN...");
	}

}
