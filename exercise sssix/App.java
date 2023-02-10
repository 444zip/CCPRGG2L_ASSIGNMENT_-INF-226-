public class App {
    public static void main(String[] args) throws Exception {
      
        // item in a form of diaper 
        // Polymorphic variable
        GroceryItem item1 = new Diaper();
        item1.name = "Pampers";
        item1.showItemName();
        item1.price = 100;

        // item in a form of softdrinks
        GroceryItem item2 = new Softdrinks();
        item2.name = "Pepsi";
        item2.showItemName();
        item2.price = 50;

        // Cashier object
        Cashier c1 = new Cashier();

        // polymorphic parameter
        c1.checkOut(item1);
        c1.checkOut(item2);

        c1.showItemPrice(item1);
        c1.showItemPrice(item2);

        // Polymorphic array
        GroceryItem[] itemArray = new GroceryItem[2];

        itemArray[0] = item1;
        itemArray[1] = item2;


        double totalAmount = 0.00;
        for ( int i = 0; i < itemArray.length; i++ ) {
            itemArray[i].showItemName();
            System.out.println( itemArray[i].price);

            totalAmount = totalAmount + itemArray[i].price;
            // totalAmount += itemArray[i].price;

        }

        System.out.println("The total cost of your purchase is: " + totalAmount);


       // di pwede kasi abstract Pet mypet = new Pet();

       Cat mycat = new Cat();
       mycat.eat();
    }
}
