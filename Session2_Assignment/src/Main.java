public class Main {
    public static void main(String[] args) {
        //Task-1
        IVehicle car = new Car();
        IVehicle bike = new Bike();

        System.out.println("\nTask 1 : ");
        car.StartEngine();
        car.StopEngine();
        car.Drive();

        bike.StartEngine();
        bike.StopEngine();
        bike.Drive();

        //Task-2
        Manager manager = new Manager("Karim" , 50000 , 1000);
        Developer developer=new Developer("Tanvir" , 30000 , "Java");

        System.out.println("\nTask 2 : ");
        manager.displayInfo();
        developer.displayInfo();

        //Task-3
        Employee emp1=new Manager("Faraz" , 45000 , 2000);
        Employee emp2=new Developer("Nikita" , 25000 , "C#");

        System.out.println("\nTask 3 : ");
        emp1.Work();
        emp2.Work();

        //Task 4
        ICanCode coder =new Developer("Nikita" , 25000 , "Python");
        System.out.println("\nTask 4 : ");
        coder.writeCode();

    }
}