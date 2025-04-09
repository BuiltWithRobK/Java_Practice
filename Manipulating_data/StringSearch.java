
// Exercise on page 92-93. Allowed VS code to enhance for loop and adjust sting contains for 
// future reference

public class StringSearch{
    public static void main(String[] args) {
        String[] books = {
            "Java in easy steps", "XML in easy steps", "SQL in easy steps", 
            "CSS in easy steps", "Gone With the Wind", "Drop the Defense"
        };

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;

        for (String book : books) {
            System.out.print(book.substring(0, 4) + " | ");
            if (book.endsWith("in easy steps")) {
                counter1++;
            }
            if (book.startsWith("Java")) {
                counter2++;
            }
            if (!book.contains("easy")) {
                counter3++;
            }
        }

        System.out.println("\nFound " + counter1 + " titles from this series");
        System.out.println("Found " + counter2 + " Java titles");
        System.out.println("Found " + counter3 + " other titles");
    }
}