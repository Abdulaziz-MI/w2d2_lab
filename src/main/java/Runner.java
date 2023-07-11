import java.awt.*;

public class Runner {

    public static void main(String[] args) {
        rectangleDemo();
        computerDemo();
        shoppingTrolleyDemo();
    }

    public static void rectangleDemo(){
        System.out.println("----------");
        System.out.println("Running rectangle tasks...");

        // 1. Create a new rectangle object
//        Rectangle rectangle = <INSTANTIATE A NEW RECTANGLE OBJECT HERE>
        Rectangle rectangle = new Rectangle(10,20);

        // 2. Calculate the rectangle's area and store it in a variable
//        int area = <CALL YOUR METHOD HERE>;
//        System.out.println("The rectangle has an area of " + area);
        rectangle.getArea();
        System.out.println("#1 " +rectangle.area);
        // 3. Check if your rectangle is actually a square
        rectangle.verifyIfRectangle();
        System.out.println("#2  Object is a square (true/false): " + rectangle.isRectangle);

    }

    public static void computerDemo(){
        System.out.println("----------");
        System.out.println("Running computer tasks...");

        // 1. Create a new computer object
//        Computer computer = <INSTANTIATE A NEW COMPUTER OBJECT HERE>
Computer computer = new Computer(190, "N/A");
        // 2. Use a getter to find out how much storage the computer has

        int currentStorage = computer.getStorage();
        System.out.println("#2 Computer has " + currentStorage + "GB storage");

        // 3. Add more storage to the computer
        computer.addStorage(20);
        // We use the getter again to check that the amount of storage has been updated
        int newStorage = computer.getStorage();
        System.out.println("#3 Computer now has " + newStorage + "GB storage");

        // 4. Use a setter to update the computer's printer property
            computer.setPrinterModel("HP");
        // Write a getter and use it below to check that the setter worked
        String currentPrinter = computer.getPrinterModel();
        System.out.println("#4 Computer currently has a " + currentPrinter + " printer connected.");

//         5. Write a method to print a message.
//         To test this works *without* a printer too you can comment out the code for question 4
//        computer.printMessage("Hello World!");
        computer.print("#5 Hello, Hi, This is a printMsg :)");
    }

    public static void shoppingTrolleyDemo(){
        System.out.println("----------");
        System.out.println("Running shopping trolley tasks...");

        // 1. Create a new shopping trolley
        ShoppingTrolley trolley = new ShoppingTrolley();

        // 2. Add an item to the trolley
        trolley.addItem("circle");
        trolley.addItem("square");
        trolley.addItem("triangle");
        trolley.addItem("rectangle");
        // 3. Count items in the trolley
        int itemCount = trolley.countItems();
        System.out.println("#3 The trolley contains " + itemCount + " items.");

        // 4. Check if an item is in the trolley
        boolean itemInTrolley = trolley.verifyIfItemInTrolley("square");
        System.out.println("#4 Object is a square (true/false): " + itemInTrolley);


    }


}
