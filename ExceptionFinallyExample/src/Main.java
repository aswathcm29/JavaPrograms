import java.util.Scanner;
public class Main {
    
    public static void main(String args[]){
      /*  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer num1 = null;
        //String str1;
        int flag = 1;
        do{
            try{
                System.out.println("Enter the num value");
                num1 = Integer.valueOf(br.readLine());
                flag = 2;
            } catch(NumberFormatException nfe){
                System.out.println("Numbet Formate Error occured");
                flag =1;
            } catch(Exception e){
                System.out.println("Exception Occured");
                flag = 1;
            } finally{
                System.out.println("Num1 = "+num1);
                System.out.println("Finally Block Occured");
            }
        } while(flag == 1);
        */
      Scanner sc = new Scanner(System.in);
      First f = new First();
      //Second s = new Second();
      User u = new User();
      try{
          f.getDetails(sc, u);
      } catch (NameFormateException e){
          System.out.println(e);
      } catch (Exception e){
          System.out.println(e+"Exception Handled in Main Class");
      }
      
      
    

    }     
      
    
}
