package assignment2;

//Task 1- Create a class name as “Trainer” which will have 4 fields 
// name, department ,  email, id. Trainer can teach Selenium, DevOps, Web Development.
//Note- use method, constructor 
//Trainer details are 
//Trainer 1 – “Mukesh” ,”Testing”,mukesh@gmail.com, 1
//Trainer 2 – “Hitesh” ,”Dev”,mukesh@gmail.com, 2
//Trainer 1 – “Mukesh” ,”DevOps”,mukesh@gmail.com, 3
// Trainer 1 can teach Selenium, Trainer 2 can teach Web Development, Trainer 3 can teach DevOps.


public class Trainer {
	
	String name;
	String department;
	String emailId;
	String teach;
	
	
	public static void main(String[] args) {
		
		Trainer trainer1=new Trainer("Mukesh","Testing","mukesh@gmail.com","Selenium");
		
		Trainer trainer2=new Trainer("Hitesh","Dev","mukesh@gmail.com","Web Development");
		
		Trainer trainer3=new Trainer("Mukesh","DevOps","mukesh@gmail.com","DevOps");

		trainer1.trainerDetails();
		trainer2.trainerDetails();
		trainer3.trainerDetails();
	}
	
	public void trainerDetails() {
		
		System.out.println("Trainer name :"+name);
		System.out.println("Trainer department :"+department);
		System.out.println("Trainer email Id :"+emailId);
		System.out.println("Trainer can teach :"+teach);
		System.out.println("**************");
		
	}
				
	public Trainer(String empName, String empDept, String empEmail, String teacher)
	{
		System.out.println("Constructor called");
		
		name=empName;
		department=empDept;
		emailId=empEmail;
		teach=teacher;
		
	}
		
}