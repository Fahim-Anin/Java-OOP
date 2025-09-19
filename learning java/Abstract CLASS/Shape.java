public abstract class  Shape{
    public int a;
    public int b;

    public Shape(int a, int b)
{
    this.a = a;
    this.b= b;
    System.out.println(a*b);
}

    public abstract void area();


}