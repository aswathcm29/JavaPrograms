
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character,Integer> hm = new TreeMap<Character,Integer>(Collections.reverseOrder());
        for(Character c : str.toCharArray()){
            if(hm.containsKey(c)){
                //int v = hm.get(c);
                hm.put(c,hm.get(c)+1);
            } else {
                hm.put(c,1);
            }
        }
        System.out.println("Using Key Set");
        for(Character c:hm.keySet()){
            System.out.println(c+" "+hm.get(c));
        }
        System.out.println("Using Map Entry Set");
        for(Map.Entry mp:hm.entrySet()){
            System.out.println(mp.getKey()+" "+mp.getValue());
        }
    }
    
}
