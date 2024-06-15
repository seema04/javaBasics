
public class Car {
    static int noOfCarsSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLitres;
    int noOfSeats;

    static{
        noOfCarsSold = 0;
        System.out.println("I'm in static block");
    }
    {
        noOfCarsSold++;
        System.out.println("I'm in init block");
    }



//    Car(){   //default constructor
//        noOfWheels = 4;
//        color= "Black";
//        maxSpeed= 150;
//        currentFuelInLitres = 2;
//        noOfSeats = 5;
//
//    }

    //Parameterized constructor

    Car(String color){
        noOfWheels = 4;
        maxSpeed = 160;
        currentFuelInLitres = 4;
        noOfSeats = 5;
        this.color = color;
    }
// we can have more than one constructor also.
    Car(){
        //we can see here we are having repetition, so to avoid this,
        //constructor can call itself by using this keyword.
         // this(color:"Black");

        noOfWheels = 4;
        maxSpeed = 160;
        currentFuelInLitres = 4;
        noOfSeats = 4;
        color = "black";




    }


    public Car start(){
        if(currentFuelInLitres == 0){
            System.out.println("Sorry car is out of fuel");
        }else if(currentFuelInLitres <=5 ){
            System.out.println("Car is in reserved mode, please refuel");
            currentFuelInLitres--;
        }else {
            System.out.println("Car has started");
            currentFuelInLitres--;
        }
        return this;
    }

    public void drive(){
            System.out.println("Car is driving");
            currentFuelInLitres--;
        }


    public void addFuel(float currentFuelInLitres){
       this.currentFuelInLitres += currentFuelInLitres;
    }

    public float getCurrentFuel(){
        return currentFuelInLitres;
    }



}
