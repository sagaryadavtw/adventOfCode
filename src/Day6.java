import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day6 {

    public long getNumberOfWaysToBeatRecord(){
        long[][] data = Util.readData("/Users/sagaryadav/Repositories/BootcampProjectGCP/AdventOfCode/src/inputs/Day6");
        long result = 1;
        for(int i = 0; i <4 ; i++) {
            long ways= getNumberOfWaysToBeatRecord(data[0][i], data[1][i]);
            result *= ways > 0? ways : 1;
        }

        return result;

    }

    public long getNumberOfWaysToBeatRecord2(){
        int time = readAndConcatenateValuesFromFile("/Users/sagaryadav/Repositories/BootcampProjectGCP/AdventOfCode/src/inputs/Day6", 0);
        int distance = readAndConcatenateValuesFromFile("/Users/sagaryadav/Repositories/BootcampProjectGCP/AdventOfCode/src/inputs/Day6", 1);

        return  getNumberOfWaysToBeatRecord(56977793, 499221010971440L);
    }

    public static int readAndConcatenateValuesFromFile(String filePath, int row) {
        int concatenatedValue = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read the specified row from the file
            for (int i = 0; i <= row; i++) {
                line = br.readLine();
                if (line == null) {
                    // Handle if there are fewer rows than expected
                    return 0;
                }
                if (i == row) {
                    // Remove spaces and concatenate the values
                    String[] values = line.split("\\s+");
                    for (String value : values) {
                        concatenatedValue = concatenatedValue * 100 + Integer.parseInt(value);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception as appropriate for your application
        }

        return concatenatedValue;
    }
    private long getNumberOfWaysToBeatRecord(long time, long distance){
        int result = 0;
            for(long j= 1 ; j < time ; j++){
                if((time - j) * j > distance)
                    result ++;
            }
            return result;
        }

}
