import java.io.*;
public class Colour {
    public double red;
    public double green;
    public double blue;
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

    Colour( int[] redGreenBlue){
        this.red = redGreenBlue[0];
        this.green = redGreenBlue[1];
        this.blue = redGreenBlue[2];
    }

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






