public class User {
    Integer userId;
    String userName;
    
    public User(Integer userId,String userName){
        this.userId = userId;
        this.userName = userName;
    }
    
   /* @Override
    public int compare(User u1,User u2){
        return u1.userId.compareTo(u2.userId);
    }
    
    @Override
    public int compareTo(User u){
        return this.userId.compareTo(u.userId);
    }*/
    
    @Override
    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
    public boolean equals(Object o){
        User u = (User)o;
        return this.userId.equals(u.userId);
    } 
    
    @Override
    public int hashCode(){
        return this.userId;
    }
    
   @Override
    public String toString(){
        return "User ID : "+this.userId+" User Name : "+this.userName;
    }
    
}
