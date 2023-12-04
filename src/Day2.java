import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Day2 {

    public static void main(String[] args) {
        HashMap<String, Integer> inputMap = new HashMap<>();
        inputMap.put("red", 12);
        inputMap.put("green", 13);
        inputMap.put("blue", 14);
        InputDay2 inputDay2 = new InputDay2();
        List<String> inputString = Arrays.stream(inputDay2.input.split("\\n")).collect(Collectors.toList());

        int result = 0;
        // Iterate through matches and print number-color pairs
        //int gameNumber = 0;
        /*for (String input:inputString) {
            gameNumber ++;
            if(correctGameProblem1(input,inputMap)){
                result += gameNumber;
            }
        }*/

        for (String input : inputString) {
            result += correctGameProblem2(input);
        }
        System.out.println(result);
    }


    private static boolean correctGameProblem1(String colorString, HashMap<String, Integer> inputMap) {

        Pattern pattern = Pattern.compile("(\\d+)\\s+(\\w+)");

        // Create a matcher to find number-color pairs in the string
        Matcher matcher = pattern.matcher(colorString);

        // Iterate through matches and print number-color pairs
        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group(1));
            String color = matcher.group(2);
            if (inputMap.get(color) < number) {
                return false;
            }
        }
        return true;
    }

    private static int correctGameProblem2(String colorString) {

        Pattern pattern = Pattern.compile("(\\d+)\\s+(\\w+)");

        // Create a matcher to find number-color pairs in the string
        Matcher matcher = pattern.matcher(colorString);
        HashMap<String, Integer> resultMap = new HashMap<>();
        resultMap.put("red", Integer.MIN_VALUE);
        resultMap.put("green", Integer.MIN_VALUE);
        resultMap.put("blue", Integer.MIN_VALUE);


        // Iterate through matches and print number-color pairs
        while (matcher.find()) {

            int number = Integer.parseInt(matcher.group(1));
            String color = matcher.group(2);
            if (resultMap.get(color) < number) {
                resultMap.put(color, number);
            }
        }

        return resultMap.values().stream().
                reduce(1, (accumulator, value) -> accumulator * value);
    }

}
