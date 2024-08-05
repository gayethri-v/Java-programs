public class MainAppStrfnc{
   public static void main(String[] args){
       String s=null;
       if(s==null){
         System.out.println(s);
	}
       else{
 	 System.out.println("not a null value");
	}
        String s1="hjhi";
        System.out.println(s1.length());
        String s2=" ";
        System.out.println(s2.length());
        System.out.println(s1.isBlank());
        System.out.println(s2.isBlank());//true is string contains only blank space
        String s3="";
        System.out.println(s3.length());
        System.out.println(s3.isEmpty());// if string length is zero 
        System.out.println(s.length());
   }
}