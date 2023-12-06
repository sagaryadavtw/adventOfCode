import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Util {

    public static long[][] readData(String filePath) {

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Assuming each line contains space-separated integers
            String line;
            int numRows = 0;
            int numCols = 0;

            // First, count the number of rows and columns in the file
            while ((line = br.readLine()) != null) {
                numRows++;
                String[] values = line.split(" ");
                numCols = Math.max(numCols, values.length);
            }

            // Reset the file reader
            br.close();
            BufferedReader br1 = new BufferedReader(new FileReader(filePath));
            br1 = new BufferedReader(new FileReader(filePath));

            // Create a 2D array
            long[][] array = new long[numRows][numCols];

            // Read data into the 2D array
            int row = 0;
            while ((line = br1.readLine()) != null) {
                String[] values = line.split(" ");
                for (int col = 0; col < values.length; col++) {
                    array[row][col] = Long.parseLong(values[col]);
                }
                row++;
            }

            return array;

        } catch (IOException e) {
            e.printStackTrace();
            return null; // or handle the exception as appropriate for your application
        }
    }
}
