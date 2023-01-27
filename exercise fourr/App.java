public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        // PERSON OBJECT
        Person Me = new Person("Mika", 101);
        // fRIEND OBJECT
        Person Friend = new Person( "Anna", 99);

        Me.addFriend(Friend);

        //PET OBJECT
        Pet Dog = new Pet("Jorduh", 5, Me);
        Dog.showOwner();

        // CLASSMATE OBJECT
        Person Classmate1 = new Person ( "Niel", 99);
        Person Classmate2 = new Person ( "Aica", 99);
        Person Classmate3 = new Person ( "Erica", 99);

        Me.addClassmate(Classmate1);
        Me.addClassmate(Classmate2);
        Me.addClassmate(Classmate3);


        //CAR OBJECT
        Car Vintagecar = new Car("Mustang", "Black", Me);
        Vintagecar.showOwner();

        
    }
}
