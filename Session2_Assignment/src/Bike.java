public class Bike implements IVehicle{
    @Override
    public void StartEngine() {
        System.out.println("Bike Engine Starts.");
    }

    @Override
    public void StopEngine() {
        System.out.println("Bike Engine Stops.");
    }

    @Override
    public void Drive() {
       System.out.println("Bike is driving.");
    }
}
