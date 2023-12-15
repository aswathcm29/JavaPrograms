
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VoteCheck {

    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first_name,last_name,email;
        Integer age = null;
        newUser v1 = null;
        int flag = 0;
        do {
            System.out.println("Enter your first_name : ");
            try{
                first_name = br.readLine();
                if(Integer.parseInt(first_name)>0){
                    throw new IOException();
                }
            } catch(IOException e){
                System.out.println("Enter a valid name!");
            }catch(NumberFormatException e){
                flag =1 ;
            }

        } while(flag!=1);
        flag =0;
        do {

            System.out.println("Enter your last_name : ");
            try{
                last_name = br.readLine();
                if(Integer.parseInt(last_name)>0){
                    throw new IOException();
                }
            } catch(IOException e){
                System.out.println("Enter a valid name!");
            }catch(NumberFormatException e){
                flag =1 ;
            }

        } while(flag!=1);
        flag=0;
        do {

            System.out.println("Enter your email : ");
            try{
                email = br.readLine();
                if(Integer.parseInt(email)>0){
                    throw new IOException();
                }
            } catch(IOException e){
                System.out.println("Enter a valid email!");
            }catch(NumberFormatException e){
                flag =1 ;
            }

        } while(flag!=1);
        flag=0;
        do {

            System.out.println("Enter your age : ");
            try{
                age = Integer.parseInt(br.readLine());
                flag = 1;
            } catch(NumberFormatException e){
                System.out.println("Enter a valid age!");
            }

        } while(flag!=1);
        if(age>=18){
            System.out.println("You are eligible for voting!");
        }
        else{
            System.out.println("You are not eligible for voting!");
        }

    }
}