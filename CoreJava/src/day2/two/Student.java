package day2.two;

/*
Constructor:- A constructor is a special method which automatically invokes when an object is created.
--------------Constructor is used to initialize the properties of object.
There are 2 types of constructors
1) Default Constructor / Zero Parameterized constructor :-
  ------------------------------------------------------
  A constructor without parameters is called as default or zero parameterized  
  constructor. It is created by the compiler itself , but if we create
  parameterized constructor then we must declare default constructor.
  
2) Parameterized Constructor:- If a constructor has parameters then it is
 ---------------------------called as parameterized constructor.

Rules:-
-----
1) A constructor name must be the same as it's class name
2) It does not return any value not even void.
*/

class Student{
	private int id;
	private String firstName;
	private String lastName;
	private double fee;
	
	/* default constructor is written when we use parameterized constructor.
	 * A default constructor is called when we create an instance to class.
	*/
	public Student() {
		System.out.println("This is a default constructor");
	}

	// parameterized constructor.
	public Student(int id, String firstName, String lastName, double fee) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fee = fee;
	}
	
	/*
	 * generating setters and getters methods.
	 * 1)Setters are used to change in individual property value where as
	 * 2)Getters are used to retrieve an individual property value.
	 */
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	// it automatically called when we use the object in sysout()
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", fee=" + fee + "]";
	}
	
	
	
}