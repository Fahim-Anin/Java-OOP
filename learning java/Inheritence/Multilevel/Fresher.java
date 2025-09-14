public class Fresher extends  CSE{
    public String floor;
    public Fresher(String name, String section, String floor, int id)
    {
        super(name, id, section);
        this.floor = floor;
    }
    public void showdetails()
    {
        super.showdetails();
        System.out.println(this.floor);
    }
    
}