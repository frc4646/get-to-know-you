
public class Profile {
 
	String name;
	String grade;
	int age;
	boolean activities;
	boolean pets;
	String hobbies;
	String careerInterest;


  //String color;
 
 
 
  public void startEngine() {
    System.out.println("I go by all pronouns.");
  }
 
 
  public Profile(String name, String grade, int age,
  boolean activities, boolean pets, String hobbies, 
  String careerInterest) {
    //color = carColor;
	 name = "Zad";
	 grade = "Freshmen";
	 age = 14;
	 activities = true;
	 pets = true;
	 hobbies = "drawing or writing";
	 careerInterest = "zoology, animating, nature and computer sciences";
	 
	 System.out.println("You can call me " + name + ", I'm " + age + ", a " + grade + ".");
	 System.out.println("Some thing I enjoy doing is " + hobbies + ".");
	 System.out.println("Career wise Im interested in " +  careerInterest + ".");

	 if(activities = true)
	 System.out.println("Im currently participating in XC and Marching Band.");
	 else
	 System.out.println("Im not enrolled in any activities.");

  }
 
   public static void main(String[] args){
    Profile myPet = new Profile("Razzle", "No Answer", 7, false, false, "eating food", "eating more food");
    // Call a method on an object 
    //myPet.startEngine();
    System.out.println("Lastly, I have a cat named Razzle, she's mean.");

   
    
    
  }
}
