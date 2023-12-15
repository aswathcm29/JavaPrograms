//package Set;
//
//import java.util.*;
//
//public class Main {
//    Set<Integer>number=new HashSet<Integer>();
//    Set<String>name=new LinkedHashSet<String>();
//    public static <T extends Integer> T add(T nu, T bu){
//            return (T) Integer.valueOf(nu.intValue() + bu.intValue());
//    }
//
//    public static void main(String[] args) {
//        System.out.println(add(8, 7));
//        List<Integer> a = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            a.add(i);
//        }
//    }
//}

import java.util.*;
import java.io.BufferedReader;

class Main{
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> hs = new HashSet<Integer>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
    }
}