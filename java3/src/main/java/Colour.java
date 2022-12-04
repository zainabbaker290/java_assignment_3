import java.io.*;

/**
 * the colour class allows for you to create a colour object
 */
public class Colour {
    public double red;
    public double green;
    public double blue;

    /**
     * Colour constructor
     * @param r = value of red colour
     * @param g = value of green colour
     * @param b = value of blue colour
     */
    public Colour(double r, double g, double b){
        if (r > 1 || r < 0){
            throw new IllegalArgumentException("value out of range");
        }
        this.red = r;
        if (g > 1 || g< 0){
            throw new IllegalArgumentException("value out of range");
        }
        this.green = g;
        if (b > 1 || b < 0){
            throw new IllegalArgumentException("value out of range");
        }
        this.blue = b;
    }

    /**
     * Another colour constructor
     * @param redGreenBlue = an array that takes in the hex values of the red,blue and green amounts in a colour
     */
    public Colour( int[] redGreenBlue){
        this.red = redGreenBlue[0];
        this.green = redGreenBlue[1];
        this.blue = redGreenBlue[2];
    }

    /**
     * a method to see if teo instances of a class are equal to each other
     * overriding the equals method
     * @param obj = the new object we are comparing the other object to
     * @return a boolean, true if two class instances are equal to each other, false if otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        Colour colour1 = (Colour)obj;
        return this.equals(colour1.red) && this.equals(colour1.green) && this.equals(colour1.blue);
    }
}






