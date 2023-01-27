public class Car {
    // ATTRIBUTES
    String name;
    String color;
    Person owner; 

    // CONSTRUCTOR
    Car (String carName, String carColor, Person ownerName){
         this.name = carName;
         this.color = carColor;
         this.owner = ownerName;
    }

    void showOwner (){
        System.out.println( "I am " + owner.name + ", I own a " + this.color + " " + this.name );
    }
    
}
