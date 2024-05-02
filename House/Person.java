package House;

public class Person 
{
    private String mName;
    private House mHouse;

    public String getMName () {
        return this.mName;
    }

     public House getMHouse () {
        return this.mHouse;
    }

    public String setMName (String name) {
        return this.mName = name;
    }

    public House setMHouse (House house) {
        return this.mHouse = house;
    }

    public Person (String name, House house) 
    {
        this.mName = name;
        this.mHouse = house;
    }

    public void Display () {
        System.out.println(
            "Je suis : " + this.mName +
            " et je vis dans une maison ayant une surface de : " + 
            this.mHouse.getMSurface() + "m2" + 
            ". La porte de ma maison a une couleur : " + 
            this.mHouse.mDoor.getMColor()
        );
    }

}
