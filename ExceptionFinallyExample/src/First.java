import java.util.Scanner;
public class First {
    public void getDetails(Scanner sc,User u)throws Exception{
        Second s = new Second();
       /* try{
            s.getDetails(sc, u);
        } catch(Exception e){
            System.out.println("Exception Handled in First Class");
        }
        */
       
       s.getDetails(sc, u);
    }
    
}
