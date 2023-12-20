
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<User> hs = new HashSet<User>();
        User u;
        Integer userId;
        String userName;
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
           System.out.println("Entert user Id");
           userId = Integer.parseInt(br.readLine());
           System.out.println("Enter user name");
           userName = br.readLine();
           u = new User(userId,userName);
           hs.add(u);
        }
       /* System.out.println("Using Iterator");
        for(Iterator it = hs.iterator();it.hasNext();){
            System.out.println(it.next());
            
        }*/
        System.out.println("Using Advanced For Each / For Each");
        for(User x:hs){
            System.out.println(x);
        }
       /* System.out.println("Using Foreach Method / Stream");
        hs.forEach(x->System.out.println(x));*/
    }
    
}
