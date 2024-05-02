package House;

public class MainApp 
{
    public static void main(String[] args) 
    {
        Person p = new Person("Euvince", new House(120, new Door("Rouge")));
        p.Display();
    }
}
