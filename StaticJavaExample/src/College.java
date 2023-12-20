
public class College {
    static{
        System.out.println("Static block inside College Class");
    }
    static String uniName = "Anna";
    String name;
    public College(){}//Cololege c = new College();
    public College(String name){
        this.name = name;
    }
    public static void setUniName(String name){
        uniName = name;
        
    }
    public void setDetails(String name){
        this.name = name;
        
    }
    
    public void Display(){
        System.out.println("University Name "+uniName);
        System.out.println("College Name "+this.name);
    }
    
    
}
