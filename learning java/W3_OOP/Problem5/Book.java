

public class Book{
    private String title;
    private String Author;
    private int ISBN;
   
    public static Book[] bookcollection = new Book[5];
    public static int  bookcount=0; 
    public Book(String title, String Author, int ISBN)
    {
        this.title = title;
        this.Author = Author;
        this.ISBN = ISBN;
    }
    public static void addbook(Book objfromtester)
    {
       bookcollection[bookcount] = objfromtester;
       bookcount++;
    }
    public static void showbookcollection()
    {
        for(int i =0; i<bookcount;i++)
        {
            System.out.println(bookcollection[i].title+  bookcollection[i].Author+  bookcollection[i].ISBN);
        }
    }
    public static void deletebook(int removebook)
    {
        for(int i =removebook; i<bookcount-1;i++)
        {   
            bookcollection[i]= bookcollection[i+1]; //left shift
          
        } 
        //need to reduce the bookcount so that showdetailes will now count the loop by decreased 1.
        bookcount--;
        // still have that duplicate b3 at the end. That's why the final cleanup step, bookCollection[bookCount] = null; (which becomes bookCollection[2] = null;
        bookcollection[bookcount]=null;  // b1 b2 null null null
    }

}