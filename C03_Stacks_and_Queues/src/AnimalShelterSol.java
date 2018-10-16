
public class AnimalShelterSol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// New AnimalShelter
		AnimalShelter as = new AnimalShelter();

		// Add Animals
		Animal a;
		a = new Animal(AnimalType.DOG, "Rocky");
		as.enqueue(a);
		a = new Animal(AnimalType.DOG, "Boxer");
		as.enqueue(a);
		a = new Animal(AnimalType.CAT, "Pussy");
		as.enqueue(a);
		a = new Animal(AnimalType.DOG, "Tiger");
		as.enqueue(a);
		a = new Animal(AnimalType.CAT, "Lucy");
		as.enqueue(a);
		a = new Animal(AnimalType.CAT, "Lincoln");
		as.enqueue(a);
		a = new Animal(AnimalType.DOG, "Snoopy");
		as.enqueue(a);
		a = new Animal(AnimalType.CAT, "Skipper");
		as.enqueue(a);
		a = new Animal(AnimalType.CAT, "Billi");
		as.enqueue(a);
		a = new Animal(AnimalType.DOG, "Scooby");
		as.enqueue(a);

		// print output of methods dequeueAny(), dequeueCat(), dequeueDog()
		int n = 5;
		Animal t;
		while (n-- != 0) {
			t = as.dequeueAny();
			if (t!=null)
			System.out.println("dequeueAny| AnimalType: " + t.getType() + ", Name: " + t.getName());
			t = as.dequeueCat();
			if (t!=null)
			System.out.println("dequeueCat| AnimalType: " + t.getType() + ", Name: " + t.getName());
			t = as.dequeueDog();
			if (t!=null)
			System.out.println("dequeueDog| AnimalType: " + t.getType() + ", Name: " + t.getName());
		}
	}

}
