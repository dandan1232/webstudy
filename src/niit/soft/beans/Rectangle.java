package niit.soft.beans;

public class Rectangle {
    private double height;
    private double width;

    public double Area(double height,double width){
        return height*width;
    }

    public Rectangle() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

}
