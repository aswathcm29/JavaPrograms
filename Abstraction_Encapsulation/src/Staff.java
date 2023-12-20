
public class Staff extends User implements MarkDetails{
    private String rollNo;

    public Staff(String rollNo) {
        this.rollNo = rollNo;
    }

    public Staff( String name, String mobileNo, String mailId,String rollNo) {
        super(name, mobileNo, mailId);
        this.rollNo = rollNo;
    }
    
    

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    
    public void displayUserDetails(){
        System.out.println("Staff Details:");
        super.display();
        System.out.println("Roll no :"+this.rollNo);
        
                
    }

    @Override
    public int getSSLCMark() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getHSCMark() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getCGPA() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
