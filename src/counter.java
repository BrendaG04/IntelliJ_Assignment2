public class counter {

  //first create variable
  public static int objectCounter=0;


  //create constructor which will hold the incrementation
    counter(){
        objectCounter++;
     }

   //Create method to print counter
    public void printObjectCounter(){
        System.out.println("THE OBJECT COUNT IS : "+ objectCounter);
     }


}
