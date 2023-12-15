 public class User {
    private String name;
    private String mailid;
    private String mobileNo;
    
    public User(){
        
    }
    
    public User(String name){
        this.name=name;
    }
    
    public User(String name,String mobileNo){
        this.name=name;
        this.mobileNo=mobileNo;
    }
    
    public User(String name,String mobileNo,String mailid){
        this.name=name;
        this.mobileNo=mobileNo;
        this.mailid=mailid;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getMailid(){
        return mailid;
    }
    
    public void setMailid(String mailid){
        this.mailid=mailid;
    }
    
    public String getMobileNo(){
        return mobileNo;
    }
    
    public void setMobileNo(String mobileNo){
        this.mobileNo=mobileNo;
    }
    
    @Override
    public String toString(){
        return "User : "+this.hashCode()+"\nName : "+this.name+"\nMobileNo : "+this.mobileNo+"\nMailid : "+this.mailid;
    }
    
    public void display(){
         System.out.println("Name :"+this.getName());
         System.out.println("Mailid :"+this.getMailid());
         System.out.println("MObileNo :"+this.getMobileNo());
    }
    
 } 
