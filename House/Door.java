package House;

public class Door 
{
    private String mColor;

    public String getMColor () {
        return this.mColor;
    }

    public String setMColor (String color) {
        return this.mColor = color;
    }

    public Door (String color) 
    {
        this.mColor = color;
    }

    public void Display () {
        System.out.println("Je suis une porte, ma couleur est : " + this.mColor);
    }

}
