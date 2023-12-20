import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int flag =1;
        System.out.println(num1-num2);        
        do{
            System.out.println("into label do");
           try{
                System.out.println(num1/num2);
                flag =2;
            } catch(ArithmeticException e){
                //e.printStackTrace();
                System.out.println("Enter the num2");
                num2 = sc.nextInt();
                flag = 1;
            } catch (NullPointerException e){
                
            } catch (ArrayIndexOutOfBoundsException e){
                
            } catch (Exception e){
                
            }
        }while(flag ==1);
        
        System.out.println(num1*num2);
        
        System.out.println(num1+num2);
    }
    
}
