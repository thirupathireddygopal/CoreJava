package day3.three;

class Animal{
	int i;
	static String name;

	// SIB static Initializer block
	static {
		name = "Animal Kingdom";
		System.out.println("static block executed SIB : "+name);
	}

	// IIB-Instance Initializer Block
	{
		System.out.println("instance block1 is executed IIB");
		i = 1;
		System.out.println("i value animal IIB : " + i);
	}

	//default constructor
	Animal(){
		System.out.println("default constructor - animal");
	}

	void eat(){
		System.out.println("animal is eating");
	}
}

// single inheritance
class Dog extends Animal{
	int i = 3;

	// SIB static Initializer block
	static {
		name = "Dog Kingdom";
		System.out.println("static block executed : "+name);
	}
	// IIB
	{
		System.out.println("instance block2 is executed");
		System.out.println("i value dog IIB : " + i);
	}

	// default constructor
	Dog(){
		System.out.println("default constructor - dog");
	}

	void bark() {
		System.out.println("dog is barking");
	}
}

// multilevel inheritance

class BabyDog extends Dog{

	// SIB static Initializer block
	static {
		name = "Babydog Kingdom";
		System.out.println("static block executed : "+name);
	}
	// IIB
	{
		System.out.println("instance block3 is executed");
		i = 5;
		System.out.println("i value babydog IIB : " + i);
	}
	// default constructor
	BabyDog(){
		System.out.println("default constructor - babydog");
	}
	void weep() {
		System.out.println("baby dog is weeping");
	}
}

// hierarchical inheritance
class Cat extends Animal{
	// IIB
	{
		System.out.println("instance block-cat is executed");
		System.out.println("i value cat IIB : " + i);
	}
	//default constructor
	Cat(){
		System.out.println("default constructor - cat");
	}
	void meow() {
		System.out.println("cat is meowing");
	}
}

public class InheritanceD1 {

	public static void main(String[] args) {
		// hierarchical  inheritance
		BabyDog bg = new BabyDog();
		bg.eat();
		bg.bark();
		bg.weep();
		System.out.println("retriving non-static(instance-variable) : " + bg.i);
		System.out.println("retriving static variable : " + bg.name);
		System.out.println("------------------------");
		// single inheritance
		Cat cat = new Cat();
		cat.eat();
		cat.meow();
		System.out.println("cat-name value : " + cat.name);
		System.out.println("------------------------");
		
		Animal animal = new Dog();
		System.out.println("i value : " + animal.i);
		System.out.println("name value : " + animal.name);
		System.out.println("invoking static members : " + Dog.name);

	}

}
