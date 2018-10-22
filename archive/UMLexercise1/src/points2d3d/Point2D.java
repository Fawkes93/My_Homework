
package points2d3d;

import java.util.Arrays;

public class Point2D {
    float x = 0.0f;
    float y = 0.0f;
    float[] XY;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }
    
    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }
    
    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
       float[] test = {getX(),getY()};
       return test;
    }

     public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return getX() + " " + getY();
    }
    
    
}
