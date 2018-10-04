public class Dog extends Canine{
	
	private int height;
	private String breed;
	boolean isDomesticated;
	
	public Dog(){
	
		breed = null;
		isDomesticated = true;
	}
	public Dog(String b){
		setBreed(b);
		isDomesticated = true;
	}
	
	public void setBreed(String h){
		breed = h;
	}
	
}