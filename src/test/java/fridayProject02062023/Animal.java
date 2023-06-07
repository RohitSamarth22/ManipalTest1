package fridayProject02062023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Animal {
	public String name;
	public int age;
	
	public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public abstract void makeSound();

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The lion roars!");
    }

	@Override
	protected String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}

class Tiger extends Animal {
    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The tiger growls!");
    }

	@Override
	protected String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The elephant trumpets!");
    }

	@Override
	protected String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listAnimals() {
        for (Animal animal : animals) {
            animal.showInfo();
        }
    }

    public void interactWithAnimals() {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        String input = "";
        while (!input.equalsIgnoreCase("quit")) {
            System.out.print("Enter the name of an animal (or 'quit' to exit): ");
            input = sc.nextLine();
            if (!input.equalsIgnoreCase("quit")) {
                boolean found = false;
                for (Animal animal : animals) {
                    if (animal.getName().equalsIgnoreCase(input)) {
                        animal.makeSound();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Animal not found!");
                }
            }
        }
    }
}