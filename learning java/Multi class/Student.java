public  class Student{
    public String name;
    public int id;
    public Course [] courses = new Course[5]; //creating course type object array to pass the reference of 
    public int coursecount=0;

    // public Student(String nm, int i)
    // {
    //     name= nm;
    //     id=i;
    //     System.out.println(name);

    // }
    public void addcourse(Course c){
        courses[coursecount]=c;
        coursecount++;  //at i=0 takes c1 and prints it memory. then takes c2 but now i=0 again so prints c1 and c2
        // for(int i=0;i<coursecount;i++)
        // {
        //     System.out.println(courses[i]);
        //     System.out.println(courses[i].code);
        //     System.out.println(courses[i].title);
        // }
    }

    //output
//     Course@251a69d7
// Course@251a69d7
// Course@7344699f

// 2nd output
// Course@251a69d7
// 1112
// MATH1112
// Course@7344699f
// 1234
// cse1122


public void showcourse()
{
    for(int i=0;i<coursecount;i++)
        {
            System.out.println(courses[i]);
            System.out.println(courses[i].code);
            System.out.println(courses[i].title);
        }
}

}  