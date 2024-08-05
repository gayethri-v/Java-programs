 public class StringNumberOfWords { 
     public static void main(String[] args) { 
         String s="I am doing java full stack course at edubridge"; 
         int count = 0; 
         for (int i = 0; i < s.length(); i++) { 
              if (s.charAt(i) == ' ') { 
                   count++; 
              } 
         } 
         System.out.println("Number of words:"+(count+1)); 
      } 
   }
