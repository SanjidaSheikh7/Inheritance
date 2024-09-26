public class Car implements IVehicle{
    @Override
    public void StartEngine() {
        System.out.println("Car Engine Starts");
    }

    @Override
    public void StopEngine() {
        System.out.println("Car Engine Stops");
    }

    @Override
    public void Drive() {
        System.out.println("Car is Driving");
    }
}
