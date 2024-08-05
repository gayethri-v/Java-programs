public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String str2 = "Java Programming";

        // Length of the string
        System.out.println("Length of str: " + str.length());

        // Character at a specific index
        System.out.println("Character at index 1: " + str.charAt(1));

        // Substring
        System.out.println("Substring from index 7: " + str.substring(7));

        // Concatenation
        System.out.println("Concatenation: " + str.concat(" Welcome!"));

        // Replace
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // Equals
        System.out.println("str equals str2: " + str.equals(str2));

        // Equals ignoring case
        System.out.println("str equalsIgnoreCase 'hello, world!': " + str.equalsIgnoreCase("hello, world!"));

        // CompareTo
        System.out.println("Compare str to str2: " + str.compareTo(str2));

        // Contains
        System.out.println("str contains 'World': " + str.contains("World"));

        // Split
        String[] parts = str.split(", ");
        System.out.println("Split str by ', ': ");
        for (String part : parts) {
            System.out.println(part);
        }

        // Trim
        String str3 = "   Hello   ";
        System.out.println("Trimmed str3: '" + str3.trim() + "'");

        // To Upper Case
        System.out.println("str to upper case: " + str.toUpperCase());

        // To Lower Case
        System.out.println("str to lower case: " + str.toLowerCase());

        // Value of
        int number = 100;
        System.out.println("Value of number: " + String.valueOf(number));
    }
}
