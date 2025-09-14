public class CSE extends Student{
    public int id;
    public String section;
    //public String floor;
    public CSE(String name, int id, String section)
    {
        super(name);
        this.id=id;
        this.section = section;

    }
    public void showdetails()
    {   
        System.out.print(name+ " " + "ID IS: "+  " " +id+ " " +"Section is: " +this.section+ " ");
     
    }
  
}