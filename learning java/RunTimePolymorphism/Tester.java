public class Tester{
    public static  void displayinfo(Animal a)  // Animal is checked at compile time
        {   
            // Animal a = d1 //upcasting 
            // Animal a = c1 //upcasting
            // checks in compile time that in Animal the methods are exist in Animal(parent class) or not
            
            //a.makesound();  //So whose makesound will be executed is decided at run time 
            //a.bark();  // it is not executed because there is no method bark in parent class
          

            //Downcasting
            if(a instanceof Dog)
            {Dog d2 = (Dog)a;
            d2.makesound();
            d2.bark();
            //dOG sOUND
            // dOG IS BARKING

            }
            else {
               //this now take cat or makesound is override the cat method
                a.makesound();
                
                //OUTPUT --->>>
            //     Cat Sound
            //     Animal Sound
            // }
        
        
        
        }
        }
        public static void main(String[] args) {
        //Animal a1 = new Animal();
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        Animal a1 = new Animal();
        //d1.makesound();

        //run time polymorphism
        //reference_type var = new Object() 
        //here reference is called at compile time to check the method is exist in parent class or not
        //Animal a1 = new Dog();

        // or 
        // Animal a2 = (Animal)d1;  this also upcasting 
        displayinfo(d1);  //this function should be static because this function is called from static function
        System.out.println(d1 instanceof Dog);
        displayinfo(c1);
        displayinfo(a1);

        

    }
}