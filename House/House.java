package House;

public class House 
{
    protected Door mDoor;
    protected double mSurface;

    public Door getMDoor () {
        return this.mDoor;
    }

    public double getMSurface () {
        return this.mSurface;
    }

    public Door setMDoor (Door door) {
        return this.mDoor = door;
    }

    public double setMSurface (double surface) {
        return this.mSurface = surface;
    }

    public House (double surface, Door door) 
    {
        this.mDoor = door;
        this.mSurface = surface;
    }

    public void Display () {
        System.out.println("Je suis une maison, ma surface est de : " + this.mSurface + "m2");
    }



}
