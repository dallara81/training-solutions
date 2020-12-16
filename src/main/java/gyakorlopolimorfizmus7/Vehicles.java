package gyakorlopolimorfizmus7;

class Vehicles
{
    public void detailsOfVehicle()
    {
        System.out.println("This is generic class of vehicles and each vehicle has some speed, power etc");
    }
}
class Swift extends Vehicles
{
    @Override
    public void detailsOfVehicle()
    {
        System.out.println("Its top speed it 200km");
        System.out.println("Its power speed it 1200cc");
    }
}
class HondaCity extends Vehicles
{
    @Override
    public void detailsOfVehicle()
    {
        System.out.println("Its top speed it 300km");
        System.out.println("Its power speed it 1800cc");
    }
}
class MainClass
{
    public static void main(String arg[])
    {
        // Creating a object of Swift class call and assign to refernce variables of
        // vehicles.
        Vehicles vehicles = new Swift();
        vehicles.detailsOfVehicle();

        // Creating a object of HondaCity call and assign to refernce variables of
        // vehicles.
        vehicles = new HondaCity();
        vehicles.detailsOfVehicle();

    }
}