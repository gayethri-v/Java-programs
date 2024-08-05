public class UserValidation{
    public static void main(String[] args){
       String uname,upass;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter username and Password");
       uname=sc.next();
       upass=sc.next();
       
       if(uname.equalsIgnoreCase("gayethri") && upass.equals("gayu123")){
          System.out.println("Valid User");
        }
        else{
          System.out.println("Invalid user");
        }
   }
}