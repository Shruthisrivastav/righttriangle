
public class righttriangle {

    public static void main(String[] args) {
        int rows = 5; // Number of rows in the triangle (you can change this value)

        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print the star
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
