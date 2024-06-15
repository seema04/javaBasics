public class Driver {

    static int minAgeForDriving = 18;
    String name; //instance variables;
    String dateOFLicense;
    int age;

    public boolean isAllowedToDrive(){
        return this.age >= minAgeForDriving;
    }

    public static void main(String args[]){


        Car swift = new Car("Red");
        Car thar = new Car();
        //swift.addFuel(6);
        Car carStarted = swift.start();
        carStarted.drive();
        System.out.println(thar.color);


        // to use dateOFLicense(a no static variable), we have to create
        //object of driver class;
//        Driver myDriver = new Driver();
//        myDriver.dateOFLicense = "1/jan/2023";
//        myDriver.name = "Eve";
//        System.out.println(minAgeForDriving);  //static variable so without object being called.
//        System.out.println(myDriver.name);




    }
}
