import java.io.IOException;
import java.util.Scanner;
public class Second {
    public void getDetails(Scanner sc,User u)throws  Exception {
        System.out.println("Enter the name");
        String name = sc.nextLine();
        if(Integer.parseInt(name)>0){
            throw new NameFormateException("Name Formate Exception Occured");
        }
    }
}
