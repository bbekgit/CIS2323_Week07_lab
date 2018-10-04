import java.util.Scanner;

public class MakePack{
	public static void main(String[] args){
		
		Dog rover = new Dog("Beagle");
		Dog chewy = new Dog("Chiwawa");
	
		Wolf wolfee = new Wolf();
		
		System.out.println(" Is Rover domesticated: " + rover.getDomesticated());
		System.out.println(" Is Chewy domesticated: " + chewy.getDomesticated());
		System.out.println(" Is Wolfee domesticated: " + wolfee.getDomesticated());
	}
	
}