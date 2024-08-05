public class IndexOfMethod{
   public static void main(String[] args){

    //String s ="Hello";
              // 01234
     //System.out.println(s.indexOf('l'));//left to right
     //System.out.println(s.lastIndexOf('l'));//right to left;


        String s="Mahathma Karamchand Gandhi";
	System.out.print(s.charAt(0)+".");
	int i =s.indexOf(' ');
	System.out.print(s.charAt(i+1)+".");
	int j =s.lastIndexOf(' ');
	System.out.print(s.substring(j+1));
   } 
}


   