//  Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

public class Rectangle{
    private int height;
    private int width;

    public Rectangle(int height, int width)
    {
        this.height = height;
        this.width = width;

    } 

    public void setheight_width(int height,int width)
    {
        this.height = height;
        this.width = width;
    }
    public int getarea()
    {
        return height *width;
    }
}