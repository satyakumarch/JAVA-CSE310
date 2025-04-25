public class Car{
    //instance variable
    int noofWheels;
    String color;
    float maxspeed;
    float currentfuelliter;
    int noofseat;

    public void drive()
    //instance methos
    {
        if(currentfuelliter==0){
            System.out.println("car is out if fuel");
        }else if(currentfuelliter<=5){
            System.out.println("car is in reversed mode please fuel it.");

        }else{
            System.out.println("car is driving:");
            currentfuelliter--;
        }
        
    }
    public void addFuel(float fuel){
        currentfuelliter +=fuel;
    }

    public float getCurrentFuelLevel(){
        return currentfuelliter;
    }

    public static void main(String[]args)
    {
        // Car mycar=new Car();
        // mycar.addFuel(6);
        // mycar.drive();
        // mycar.drive();
        // mycar.drive();
        // System.out.println(mycar.getCurrentFuelLevel());

        Car swift=new Car();
        swift.addFuel(6);
        swift.start();
        swift.drive();
    }

}