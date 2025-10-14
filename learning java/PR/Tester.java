public class Tester{
    public static void main(String[] args) {
        reverse newlist = new reverse();
        newlist.push(30);
        newlist.push(20);
        newlist.push(10);

        newlist.reverse();
        newlist.print();
    }
}