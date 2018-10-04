public class Wolf extends Canine{
	
	private int height;
	boolean isDomesticated;
	
	public Wolf(){
		height = 0;
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