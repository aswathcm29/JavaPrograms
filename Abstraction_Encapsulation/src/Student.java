
public class Student extends User implements MarkDetails{
    private String rollNo;
    private String batch;
    
    public Student(String name,String mobileNo,String mailId,String rollNo,String batch){
        super(name,mobileNo,mailId);
        this.rollNo = rollNo;
        this.batch = batch;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
    
    @Override
    public void displayUserDetails(){
        System.out.println("Student Details:");
        super.display();
        System.out.println("Roll no :"+this.rollNo);
        System.out.println("Batch : "+this.batch);
                
    }

    @Override
    public int getSSLCMark() {
        return 996;
    }

    @Override
    public int getHSCMark() {
        return 1010;
    }

    @Override
    public int getCGPA() {
       return 2343;
    }
    
    
    
}
