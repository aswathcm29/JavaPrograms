public abstract class User {
    private String name;
    private String mobileNo;
    private String mailId;
    
    public User(){  
        
    }
    
    public User(String name){
        this.name = name;
    }
    
    public User(String name,String mobileNo){
        this.name = name;
        this.mobileNo = mobileNo;
    }
    
    public User(String name,String mobileNo,String mailId){
        this.name = name;
        this.mobileNo = mobileNo;
        this.mailId = mailId;
    }
   
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setMobileNo(String mobileNo){
        this.mobileNo = mobileNo;
    }
    
    public String getMobileNo(){
        return this.mobileNo;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }
    
    @Override
    public String toString(){
        return "User : "+this.hashCode()+"\nName : "+this.name+"\nMobile No : "+this.mobileNo+"\nMail ID : "+this.mailId;
    }
    public void display(){
          System.out.println("Name : "+this.getName());
            System.out.println("Mobile No: "+this.getMobileNo());
            System.out.println("Mail Id : "+this.getMailId());
    }
    
    
    public abstract void displayUserDetails();
    
}
