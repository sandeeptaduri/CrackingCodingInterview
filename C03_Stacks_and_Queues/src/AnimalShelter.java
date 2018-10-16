import java.util.LinkedList;

public class AnimalShelter {

	private MyQueue<Animal> dog = new MyQueue<Animal>();
	private MyQueue<Animal> cat = new MyQueue<Animal>();
	private LinkedList<AnimalType> order = new LinkedList<AnimalType>(); // d or c

	public void enqueue(Animal a) {
		if (AnimalType.valueOf(a.getType()) == AnimalType.DOG) {
			dog.add(a);
			order.add(AnimalType.DOG);
		} else if (AnimalType.valueOf(a.getType()) == AnimalType.CAT) {
			cat.add(a);
			order.add(AnimalType.CAT);
		}
	}

	public Animal dequeueAny() {
		Animal a = null;
		try {
			if (order.removeFirst() == AnimalType.DOG) {
				a = dog.remove();
			} else {
				a = cat.remove();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No Animal left in the shelter!");
		}
		return a;
	}

	public Animal dequeueCat() {
		order.removeFirstOccurrence(AnimalType.CAT);
		try {
			return cat.remove();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No Cat left in the shelter!");
		}
		return null;
	}

	public Animal dequeueDog() {
		order.removeFirstOccurrence(AnimalType.DOG);
		try {
			return dog.remove();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No Dog left in the shelter!");
		}
		return null;
	}

}
