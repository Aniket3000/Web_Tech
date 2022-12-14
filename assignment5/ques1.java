interface Mammals {
    default void print()
    {
        System.out.println("I am mammal");
    }
}
 
// Interface 2
interface MarineAnimals {
 
    default void print()
    {
        System.out.println("I am a marine animal");
    }
}

class BlueWhale implements Mammals, MarineAnimals {

    public void print()
    {
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
    }
}


public class Main
{
	public static void main(String[] args) {
		BlueWhale bw = new BlueWhale();
		bw.print();
	}
}
