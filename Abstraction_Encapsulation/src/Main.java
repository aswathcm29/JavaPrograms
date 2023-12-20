import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        User [] userArr = new User[size];
        String name,mailid,mobileNo;
        User user;
        for(int i=0;i<size;i++){
            System.out.println("Enter the Type of the User");
            System.out.println("1.Student\n2.Staff");
            int choice = Integer.parseInt(br.readLine());
            System.out.println("Enter the "+(i+1)+"user details:");
            System.out.println("Name:");
            name = br.readLine();
            System.out.println("Mailid:");
            mailid = br.readLine();
            System.out.println("MobileNo:");
            mobileNo = br.readLine();
            if(choice == 1){
                System.out.println("Roll No:");
                String rollno = br.readLine();
                System.out.println("Batch:");
                String batch = br.readLine();
                user = new Student(name, mobileNo, mailid, rollno, batch);
            } else {
                System.out.println("RollNo:");
                String rollNo = br.readLine();
                user = new Staff(name, mobileNo, mailid, rollNo);
            }
            /*user.setName(name);
            user.setMobileNo(mobileNo);
            user.setMailId(mailid);*/
            userArr[i] = user;                     
        }
        for(User u:userArr){
            /*System.out.println("Name : "+u.getName());
            System.out.println("Mobile No: "+u.getMobileNo());
            System.out.println("Mail Id : "+u.getMailId());*/
           u.displayUserDetails();
        }
        
    }
    
}
