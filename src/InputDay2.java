public class InputDay2 {

    String input = "18 red, 8 green, 7 blue; 15 red, 4 blue, 1 green; 2 green, 17 red, 6 blue; 5 green, 1 blue, 11 red; 18 red, 1 green, 14 blue; 8 blue\n" +
            "16 blue, 12 green, 3 red; 13 blue, 2 red, 8 green; 15 green, 3 red, 16 blue\n" +
            "6 green, 15 red; 1 green, 4 red, 7 blue; 9 blue, 7 red, 8 green\n" +
            "8 red, 2 blue; 11 red, 5 blue, 1 green; 12 red, 1 green, 5 blue; 1 blue; 2 blue, 9 red\n" +
            "9 blue, 3 red, 12 green; 3 green, 4 red, 17 blue; 15 blue, 2 green, 5 red; 3 blue, 5 green, 6 red; 6 red, 4 blue, 7 green; 3 green, 10 blue\n" +
            "11 red, 2 blue, 6 green; 2 blue, 9 red, 4 green; 3 blue, 12 red, 8 green; 5 red, 11 green, 4 blue; 2 blue, 9 red, 13 green; 15 red, 3 blue, 7 green\n" +
            "2 red, 9 green, 12 blue; 14 blue, 1 green, 6 red; 7 blue, 9 green; 9 green, 8 red, 4 blue; 5 red, 3 green, 16 blue; 4 red, 8 green\n" +
            "11 red, 12 green, 1 blue; 4 red, 7 green; 11 red, 6 green; 17 green; 15 green, 1 red\n" +
            "1 red, 1 green, 12 blue; 3 green, 12 red, 6 blue; 14 red, 1 blue; 9 blue, 1 red, 3 green\n" +
            "1 red, 4 blue; 3 blue, 4 green; 3 green, 3 red, 8 blue; 2 blue, 3 red; 3 green, 4 red, 3 blue\n" +
            "8 blue, 1 red; 8 green, 1 red, 1 blue; 13 green, 9 red, 6 blue\n" +
            "2 red, 2 blue, 1 green; 3 red, 1 green; 1 blue, 3 green\n" +
            "12 green, 4 blue; 2 red, 2 blue, 8 green; 6 green, 3 red; 3 red, 5 green; 9 green, 7 blue, 1 red\n" +
            "1 red, 7 green; 5 green, 12 red, 10 blue; 9 red, 11 blue, 7 green; 7 blue, 3 red, 9 green\n" +
            "7 green, 1 blue; 1 red, 2 green, 1 blue; 7 green\n" +
            "1 green, 1 blue; 2 blue, 4 green, 2 red; 2 green, 2 blue\n" +
            "6 red, 11 green, 7 blue; 1 blue, 13 green, 4 red; 4 green, 6 blue, 7 red\n" +
            "2 red, 8 blue; 7 red, 11 blue; 1 green, 16 blue, 7 red; 18 blue, 1 green, 14 red\n" +
            "2 red, 2 blue; 1 green, 6 red; 1 green, 3 red, 2 blue\n" +
            "6 red, 2 blue, 5 green; 4 red, 1 blue, 9 green; 3 blue, 2 red, 9 green; 8 red, 12 green, 5 blue\n" +
            "6 red, 7 blue; 3 blue, 16 red, 2 green; 2 blue, 13 red; 3 blue, 11 red, 3 green; 1 green, 18 red, 6 blue; 12 red, 5 blue, 2 green\n" +
            "9 red, 6 blue, 14 green; 1 blue, 5 green, 13 red; 6 red; 18 red, 4 green; 2 blue, 10 green, 16 red; 1 red, 18 green, 1 blue\n" +
            "6 green, 4 red, 3 blue; 1 blue, 2 red, 9 green; 5 green, 1 red, 3 blue; 5 blue, 4 red, 4 green\n" +
            "1 red, 5 green, 2 blue; 4 red, 7 green, 9 blue; 9 blue, 7 green; 7 green, 13 blue; 4 blue, 1 green, 4 red\n" +
            "13 blue, 10 red, 11 green; 10 green, 1 blue, 3 red; 15 red, 5 green, 8 blue; 19 red, 10 green, 13 blue; 12 blue, 4 green, 16 red; 7 red, 5 green, 9 blue\n" +
            "20 red, 6 blue, 12 green; 15 blue, 17 red, 9 green; 19 red, 6 green, 3 blue; 8 green, 1 red, 15 blue; 10 green, 8 red, 5 blue; 4 green, 20 red, 18 blue\n" +
            "2 blue, 3 green, 7 red; 2 blue, 4 red; 5 blue, 5 green; 8 blue, 6 green, 2 red\n" +
            "1 green, 6 red; 3 red, 3 blue; 1 green, 4 red; 1 red, 2 blue; 2 red\n" +
            "8 blue, 1 green; 7 blue, 1 red; 6 red, 2 blue; 2 red, 3 green; 3 red, 6 green, 5 blue\n" +
            "11 blue, 17 green, 10 red; 9 blue, 12 green, 14 red; 16 green, 2 red, 8 blue; 18 green, 1 red, 1 blue; 5 blue, 7 red, 18 green; 9 green, 3 blue, 11 red\n" +
            "5 blue, 13 green; 2 green, 3 red, 4 blue; 3 red, 15 green, 2 blue; 5 blue, 19 green; 5 blue, 18 green; 3 green, 7 blue, 3 red\n" +
            "12 red, 2 green, 3 blue; 2 green, 16 red, 1 blue; 13 red, 4 green, 6 blue\n" +
            "18 green, 8 blue, 3 red; 15 green, 2 blue, 4 red; 14 blue, 3 red, 6 green; 20 green, 13 blue; 1 red, 19 green\n" +
            "1 green, 7 blue, 2 red; 8 green, 10 blue, 2 red; 3 blue, 1 green, 1 red; 6 green, 13 blue, 1 red; 1 green, 4 blue, 2 red; 1 red, 5 green, 7 blue\n" +
            "7 blue, 8 red; 2 blue, 3 red; 4 blue, 3 red; 7 red, 4 blue; 1 blue, 1 green, 3 red\n" +
            "1 red, 8 green; 1 red, 6 green; 3 green, 8 red; 1 blue, 2 red, 1 green\n" +
            "3 blue, 13 red; 2 blue, 7 red; 5 red, 1 green; 3 red, 3 blue; 1 blue, 12 red, 1 green; 14 red, 3 blue\n" +
            "7 blue, 18 red, 12 green; 11 red, 6 green, 1 blue; 9 green, 1 red; 9 green, 13 blue, 16 red\n" +
            "12 red, 3 green, 2 blue; 3 blue, 3 green, 10 red; 2 blue, 5 red; 2 blue, 1 green; 5 blue, 4 green, 7 red; 2 green, 1 red\n" +
            "1 red, 7 blue, 5 green; 1 red, 4 blue, 8 green; 3 red, 5 blue, 14 green; 10 green, 2 blue, 1 red; 11 blue, 7 green, 1 red; 14 green, 2 blue\n" +
            "8 green, 5 red, 3 blue; 5 red, 4 blue, 12 green; 10 green, 6 blue; 13 green, 7 blue; 1 red, 2 green, 15 blue\n" +
            "17 red, 1 blue, 5 green; 9 green, 16 red; 1 blue, 15 green, 2 red; 1 blue, 12 red, 12 green\n" +
            "12 green, 5 blue; 3 red, 8 blue, 10 green; 8 blue, 2 green, 1 red\n" +
            "1 green, 7 red, 2 blue; 1 blue, 10 red; 4 green, 3 blue, 19 red; 1 blue, 3 green, 1 red; 1 blue; 4 red, 2 green, 3 blue\n" +
            "16 red, 12 blue, 1 green; 13 blue, 16 red, 9 green; 7 green, 3 red, 8 blue\n" +
            "1 red, 17 green, 6 blue; 6 blue, 1 red, 3 green; 12 green, 1 blue; 4 blue, 2 green\n" +
            "2 green, 12 red, 15 blue; 9 blue, 2 green, 2 red; 3 green, 6 blue, 2 red; 11 blue, 3 green, 5 red; 6 green, 9 red, 17 blue\n" +
            "5 blue, 6 red; 7 green, 14 red, 4 blue; 2 green, 5 blue, 2 red; 11 blue, 5 red, 5 green\n" +
            "7 green, 7 blue, 4 red; 11 green, 12 blue, 2 red; 12 blue, 4 red, 9 green; 3 red, 8 blue, 17 green; 16 green, 3 red, 14 blue\n" +
            "5 green, 4 red, 10 blue; 7 green, 14 red, 5 blue; 12 red, 18 blue, 14 green\n" +
            "12 green, 3 blue; 10 green, 4 blue, 2 red; 3 green, 5 blue\n" +
            "12 green, 6 red, 7 blue; 20 green, 6 red, 18 blue; 1 green, 5 blue, 11 red; 2 green, 15 blue, 6 red\n" +
            "6 red, 2 green, 5 blue; 13 green, 1 blue, 14 red; 7 green, 1 blue; 3 green, 4 blue, 6 red; 10 red, 6 green, 4 blue\n" +
            "4 blue, 1 red; 1 red, 1 blue, 9 green; 3 red, 2 blue, 4 green; 3 green, 2 red, 5 blue; 9 blue, 2 red, 7 green\n" +
            "7 blue; 6 blue, 1 red; 4 red, 7 blue; 3 red, 3 blue, 1 green\n" +
            "2 green, 7 blue; 3 red, 10 blue; 1 green, 2 red; 3 red, 8 blue, 4 green; 1 green, 11 blue, 3 red; 2 green, 8 blue\n" +
            "3 red, 1 green; 1 green, 1 red, 1 blue; 1 red, 4 green, 15 blue; 9 blue, 2 red, 1 green\n" +
            "12 blue, 13 red, 5 green; 2 blue, 6 green; 12 red, 15 green, 7 blue; 5 red, 4 green, 14 blue; 15 red, 2 green, 9 blue\n" +
            "5 green, 5 blue; 4 red, 6 blue, 2 green; 5 blue, 3 green, 6 red; 3 red, 6 green, 4 blue; 3 blue, 7 green, 10 red\n" +
            "1 red, 1 blue, 3 green; 1 red; 3 green, 6 blue; 6 blue\n" +
            "7 green, 1 red, 1 blue; 4 red, 3 green, 1 blue; 7 blue, 7 green; 11 blue, 2 green, 5 red; 5 red, 4 green, 5 blue\n" +
            "17 green, 2 red, 3 blue; 1 red, 3 blue, 2 green; 1 green, 3 blue, 2 red; 1 red, 17 green; 2 red, 15 green, 4 blue; 5 green\n" +
            "2 green, 4 red, 3 blue; 9 blue, 10 red; 1 green, 13 blue, 2 red; 2 green, 1 blue, 5 red\n" +
            "6 red, 8 blue; 3 red, 6 blue, 5 green; 13 red, 11 blue, 8 green; 11 red, 3 blue, 1 green\n" +
            "4 green, 1 blue, 2 red; 3 blue, 3 green, 11 red; 6 green, 3 blue, 3 red; 5 red, 4 blue; 8 red, 5 blue, 2 green\n" +
            "10 green, 13 red; 1 blue, 2 red, 4 green; 7 red, 7 green; 19 green, 9 red, 1 blue; 16 green, 16 red, 2 blue; 10 red, 11 green\n" +
            "3 blue, 4 green, 2 red; 6 blue, 19 red; 4 blue, 2 red, 5 green; 4 green, 5 blue, 1 red\n" +
            "13 blue, 15 red, 7 green; 5 blue, 20 red; 6 green, 12 blue, 8 red; 5 blue, 8 green\n" +
            "13 red, 13 green; 13 green, 3 red, 1 blue; 8 green; 9 green, 9 red\n" +
            "8 blue, 11 red, 2 green; 12 red, 2 blue; 13 red, 6 blue, 3 green; 7 blue, 3 green, 5 red; 15 red, 1 blue, 3 green\n" +
            "7 red, 9 green; 4 blue, 9 green, 7 red; 4 blue, 2 green; 6 blue, 2 red, 9 green\n" +
            "14 blue, 1 green; 4 red, 1 green, 9 blue; 6 blue, 8 red, 2 green\n" +
            "17 green; 10 blue, 2 red, 9 green; 1 green, 10 blue, 2 red; 8 blue, 1 red; 5 blue, 16 green\n" +
            "12 green, 6 red, 5 blue; 2 red, 4 blue, 10 green; 3 green, 4 blue, 2 red; 8 green, 2 red, 5 blue; 5 red, 2 blue, 2 green; 6 green, 1 red, 1 blue\n" +
            "4 blue, 19 green; 15 blue, 7 green; 18 blue, 5 green, 7 red; 16 green, 15 blue; 7 red, 4 green, 13 blue; 9 green, 13 blue\n" +
            "1 red, 2 green, 7 blue; 13 blue, 7 green, 1 red; 13 blue, 5 red\n" +
            "3 red, 10 blue, 6 green; 1 green, 2 red, 10 blue; 7 green, 1 red\n" +
            "11 green, 2 blue; 6 blue, 8 red, 5 green; 10 red, 6 green, 4 blue; 6 blue, 3 green, 10 red; 5 green, 6 red\n" +
            "4 red, 6 blue, 1 green; 1 red; 2 green, 3 blue, 4 red; 4 red, 1 green, 2 blue; 2 green, 1 red\n" +
            "2 red, 1 green; 1 red, 1 green; 7 red, 1 green; 1 blue, 7 red, 3 green\n" +
            "1 blue, 15 red, 4 green; 2 green, 12 red; 4 green, 13 red; 1 blue, 3 green, 13 red; 12 red, 2 green, 1 blue; 3 green, 8 red, 1 blue\n" +
            "18 red, 4 green, 1 blue; 14 red, 1 green, 2 blue; 10 red, 2 blue, 7 green; 13 red; 3 red, 7 green, 1 blue; 5 red, 4 green\n" +
            "4 red, 10 green, 5 blue; 2 red, 12 blue, 13 green; 19 blue, 9 green, 1 red; 2 red, 14 blue, 3 green; 13 green, 8 blue, 5 red\n" +
            "12 blue, 7 red, 9 green; 1 blue, 1 green, 14 red; 1 green, 8 red, 11 blue; 11 blue, 12 red, 3 green; 11 blue, 8 green, 13 red; 7 green, 7 red, 10 blue\n" +
            "10 red, 2 blue; 11 green, 9 red, 4 blue; 3 red, 5 blue, 13 green; 5 red, 5 green; 5 red, 2 blue, 4 green; 11 green, 4 blue, 19 red\n" +
            "1 blue, 6 green, 2 red; 1 red, 1 blue, 8 green; 3 red, 1 blue, 4 green; 1 green, 4 red; 9 green, 2 red; 6 green, 7 red, 1 blue\n" +
            "8 green, 8 blue, 4 red; 5 red, 2 blue, 10 green; 3 red, 13 green; 1 red, 3 blue, 4 green\n" +
            "3 blue, 9 green, 3 red; 2 blue, 15 green; 2 red, 9 green\n" +
            "9 red, 6 green, 15 blue; 10 blue, 7 red, 2 green; 7 green, 16 blue, 4 red\n" +
            "1 red, 1 blue, 7 green; 7 green, 1 blue, 8 red; 3 red, 1 blue, 1 green\n" +
            "1 green, 2 red, 6 blue; 4 green, 4 red, 3 blue; 4 red, 11 green, 4 blue; 3 blue, 5 red; 8 green, 2 red, 8 blue\n" +
            "2 red, 3 blue; 3 blue, 2 green, 2 red; 9 red, 3 green\n" +
            "2 blue, 5 green; 2 green, 5 blue, 3 red; 2 green, 5 blue, 1 red; 7 blue, 4 red, 9 green\n" +
            "1 red, 9 blue, 14 green; 6 green; 2 blue, 11 green; 4 blue, 16 green, 1 red\n" +
            "10 green, 2 blue, 7 red; 4 blue, 4 red, 6 green; 3 red, 2 blue, 3 green\n" +
            "12 red; 3 green, 10 red; 6 blue, 14 red, 2 green; 7 green, 15 red; 3 green, 3 red, 1 blue; 5 blue, 1 red\n" +
            "3 red, 1 green, 1 blue; 1 green, 3 red; 4 red, 1 green\n" +
            "4 red, 5 green, 6 blue; 2 red, 9 green, 6 blue; 2 blue, 11 red, 14 green; 6 green, 4 blue; 11 blue, 11 red, 8 green\n" +
            "2 green, 20 blue; 12 blue; 3 red, 12 blue; 7 blue; 3 green, 10 blue, 2 red; 3 red, 2 green\n" +
            "2 blue, 8 green, 12 red; 2 green, 13 red; 2 red, 4 green; 2 green, 7 red; 10 green, 5 red, 1 blue\n";
}
