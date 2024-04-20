package w2act;
public class Person 
{
	    private String name;
	    private int age;
	    private String gender;

	    public Person(String name, int age, String gender) {
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	    }

	    public String getName() {
	        return name;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }

	    
	    public int getAge() {
	        return age;
	    }

	    
	    public void setAge(int age) {
	        this.age = age;
	    }

	   
	    public String getGender() {
	        return gender;
	    }

	    
	    public void setGender(String gender) {
	        this.gender = gender;
	    }

	   
	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Gender: " + gender);
	    }

	    public static void main(String[] args) {
	        
	        Person person = new Person("joe",28,"Male");

	        System.out.println("Name: " + person.getName());
	        System.out.println("Age: " + person.getAge());
	        System.out.println("Gender: " + person.getGender());

	       
	        person.setName("elisa");
	        person.setAge(25);
	        person.setGender("Female");

	        
	        System.out.println("\nUpdated Information:");
	        person.displayInfo();
	    }
	}

