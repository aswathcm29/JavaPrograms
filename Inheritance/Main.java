import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        User userArr[] = new User[size];
        String name,mailid,mobileNo;
        for(int i=0;i<size;i++){
            System.out.println("Enter the"+(i+1)+"user details:");
            System.out.println("Name:");
            name = br.readLine();
            System.out.println("Mailid");
            mailid = br.readLine();
            System.out.println("MobileNo");
            mobileNo = br.readLine();
            User user = new User(name,mobileNo,mailid);
            /*user.setName(name);
            user.setMailid(mailid);
            user.setMobileNo(mobileNo);*/
            userArr[i] = user;
            
        }
        for(User u:userArr){
            /*System.out.println("Name :"+u.getName());
            System.out.println("Mailid :"+u.getMailid());
            System.out.println("MObileNo :"+u.getMobileNo);*/
            System.out.println(u.toString());
        }
    }
}
