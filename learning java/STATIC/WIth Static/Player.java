public class Player{
    public int run =0;
    public static int teamrun=0;
     
    public void six()
    {
        run+=6;
        teamrun+=6;  
        System.out.println(teamrun);
    }
     public void four()
    {
        run+=4;
        teamrun+=4;
        System.out.println(teamrun);
    }
    
}

// //Output
// 6
// 12
// 16