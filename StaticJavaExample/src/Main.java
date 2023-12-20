public class Main {
    static{
        System.out.println("First Static Block");
    }
    public static void main(String args[]){
        System.out.println("Main Block");
        College.uniName = "ANNA";
        College sece = new College("SECE");
        sece.Display();
        College pit = new College("PIT");
        pit.Display();
        College.setUniName("Karpagam");
        College srec = new College("SREC");
        srec.Display();
        sece.Display();
        pit.Display();
    }
    
    static {
        System.out.println("Second Static Block");
    }
}
