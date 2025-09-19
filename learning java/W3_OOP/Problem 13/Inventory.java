public class Inventory{
    public Product[] inv = new Product[5];
    public int inventory_count =0;

    public void addinv(Product a)
    {
          inv[inventory_count]=a;
          inventory_count++;
    }

    public void showinvdetails(){
        for(int i =0;i<inventory_count;i++)
        {
            System.out.println(inv[i].component  + " " + "and piece is:" + inv[i].piece);
        }
    }
}