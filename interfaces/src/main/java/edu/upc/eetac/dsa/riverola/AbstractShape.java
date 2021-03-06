package edu.upc.eetac.dsa.riverola;

/**
 * Created by Guillermo on 02/10/2015.
 */
public abstract class AbstractShape implements Shape {
    private String type;

    public AbstractShape(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "I'm a " + type;
    }
}
