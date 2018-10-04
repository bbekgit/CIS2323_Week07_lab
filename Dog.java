public class Dog extends Canine{
	
	private String breed;
	
	public Dog(String b){
		setBreed(b);
		isDomesticated = true;
	}
	
	public void setBreed(String h){
		breed = h;
	}
	
}