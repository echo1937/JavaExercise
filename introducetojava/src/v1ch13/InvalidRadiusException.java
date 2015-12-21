package v1ch13;

/**
 * Created by Eric on 12/21/2015.
 */
public class InvalidRadiusException extends Exception {
    private double radius;

    /**
     * Construct an exception
     */
    public InvalidRadiusException(double radius) {
        super("Invalid radius " + radius);
        this.radius = radius;
    }

    /**
     * Return the radius
     */
    public double getRadius() {
        return radius;
    }
}

