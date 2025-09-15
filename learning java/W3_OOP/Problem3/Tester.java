public class Tester{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,4);
        System.out.println(r1.getarea());

        r1.setheight_width(6, 3);
        System.out.println(r1.getarea());
        
    }
}