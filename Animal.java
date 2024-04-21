public class Animal {
    private String species;
    private String sound;
 
public Animal() {
        this.species = "Unknown";
        this.sound = "Unknown";
    }

 public class Animal {
    private String species;
    private String sound;

    
    public Animal() {
        this.species = "Unknown";
        this.sound = "Unknown";
    }

    
    public Animal(String species, String sound) {
        this.species = species;
        this.sound = sound;
    }

public String getSpecies() {
        return this.species;
    }

    
    public void setSpecies(String species) {
        this.species = species;
    }

    
    public String getSound() {
        return this.sound;
    }

    
    public void setSound(String sound) {
        this.sound = sound;
    }

    public static void main(String[] args) {
  
        Animal myAnimal = new Animal();
        myAnimal.setSpecies("Lion");
        myAnimal.setSound("Roar");

        
        System.out.println("Species: " + myAnimal.getSpecies());
        System.out.println("Sound: " + myAnimal.getSound());
    }
} public Animal(String species, String sound) {
        this.species = species;
        this.sound = sound;
    }

    public String getSpecies() {
        return this.species;
    }


    public void setSpecies(String species) {
        this.species = species;
    }

    
    public String getSound() {
        return this.sound;
    }

    
    public void setSound(String sound) {
        this.sound = sound;
    }

    public static void main(String[] args) {
        
        Animal myAnimal = new Animal();

        myAnimal.setSpecies("Lion");
        myAnimal.setSound("Roar");

        System.out.println("Species: " + myAnimal.getSpecies());
        System.out.println("Sound: " + myAnimal.getSound());
    }
}
