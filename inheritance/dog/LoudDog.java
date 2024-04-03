public class LoudDog extends Dog
{
   
   public LoudDog(String name){
       super(name);
   }
   
   public String speak(){
       return "BARK!";
   }
   
   public String toString(){
       return super.getName() + " is loud and likes to " + speak();
   }
   //Override the toString here.
   //Remember, you can access the name using super.getName()
}

