import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Day1 {


    public static void main(String[] args) {
        HashMap<String, String> numMap = new HashMap<>();
        numMap.put("one", "o1ne");
        numMap.put("two", "t2wo");
        numMap.put("three", "t3hree");
        numMap.put("four", "f4our");
        numMap.put("five", "f5ive");
        numMap.put("six", "s6ix");
        numMap.put("seven", "s7even");
        numMap.put("eight", "e8ight");
        numMap.put("nine", "n9ine");

        InputDay1 inputDay1 = new InputDay1();
        int sum = 0;

        List<String> s = Arrays.stream(inputDay1.input.split("\\n")).collect(Collectors.toList());
        for (String s1 : s) {
            String newS = s1;
            for (String key : numMap.keySet()) {
                if (s1.contains(key)) {
                    newS = newS.replace(key, numMap.get(key));
                }
            }
            int num = extractTwoDigitNumber(newS);
            sum += num;
        }
        System.out.println(sum);
    }

    private static int extractTwoDigitNumber(String input) {
        boolean foundFirstDigit = false;
        int firstDigit = -1;
        int lastDigit = -1;

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                if (!foundFirstDigit) {
                    firstDigit = digit;
                    foundFirstDigit = true;
                }
                //int start = 0;
                lastDigit = digit;
            }
        }

        // Combine the first and last digit to form a two-digit number
        if (foundFirstDigit) {
            return (firstDigit * 10) + lastDigit;
        } else {
            // Return -1 if no two-digit numeric value is found
            return -1;
        }
    }
}
