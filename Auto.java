package Core.java.examples;

public class Auto extends Vehicle
{
    public int getnoofwheels()


    {
        return 3;

    }


    public static void main(String[] args)
    {
        Auto auto=new Auto();
        Car car=new Car();


        System.out.println(auto.getnoofwheels());
        System.out.println(car.getnoofwheels());




    }

}
