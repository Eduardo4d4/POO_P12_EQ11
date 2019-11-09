import java.util.ArrayList;
public class TraditionalSearch{
	public static void main (String [] args){
		ArrayList <Animal> animals = new ArrayList <Animal>();		
		animals.add(new Animal ("fish", false, true));
		animals.add(new Animal ("kangaroo", true, false));
		animals.add(new Animal ("rabbit", true, false));
		animals.add(new Animal ("turtle", false, true));

		//print(animals, new CheckIfHopper());
		System.out.println("----Can Hope----");
		print(animals, a-> a.canHope());
		System.out.println("----CanSwim----"); 
		print(animals, a-> a.canSwim());   

	}
	private static void print ( ArrayList <Animal> animals , CheckTrait checker ) {                    
		for (Animal animal : animals){
			if(checker.test(animal))
				System.out.print(animal + ", ");
		}
		System.out.println();
	}
}