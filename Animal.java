public class Animal{
	private String species;
	private boolean canHope;
	private boolean canSwim;

	public Animal(String speciesName, boolean hopper, boolean swimmer){
		species = speciesName;
		canHope = hopper;
		canSwim = swimmer;
	}
	public boolean canHope(){return  canHope;}
	public boolean canSwim(){return canSwim;}
	public String toString() {return species;}
}
