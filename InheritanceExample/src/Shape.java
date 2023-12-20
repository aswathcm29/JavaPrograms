public class Shape {
    public Shape(){
        System.out.println("Shape Class constructor invoked");
    }
    static{
        System.out.println("Shape Class Static Block invoked");
    }
    
    {
        System.out.println("Shape Class block invoked");
    }
    
    public void display(){
        System.out.println("Shape Display");
    }
}

