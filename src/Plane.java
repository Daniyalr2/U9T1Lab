public class Plane extends Vehicle
{
    private int engines;
    private int wings;

    public Plane (String name, int wheels, int wings, int engines)
    {
        super(name, wheels);
        this.wings = wings;
        this.engines = engines;
    }

    public int getWings()
    {
        return wings;
    }

    public int getEngines()
    {
        return engines;
    }

    public void flyUp(int degrees)
    {
        System.out.println("The plane flew up " + degrees + " degrees!");
    }
}
