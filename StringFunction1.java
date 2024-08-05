public class StringFunction1{
  public static void main(String[] args){
     String s="Edubridge";
     for(int i=s.length()-1;i>=0;i--){
        System.out.println(s.substring(0,(i+1)));
     }
  }
}
