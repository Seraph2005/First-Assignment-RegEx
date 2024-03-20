import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {

    /*
    implement the method below so that it extracts a URL from a String
    I will write the basics for this one method, you will have to implement the other two methods from scratch
    */

    public static String extractURL(String text) {
        String regex = "(https:\\/\\/www\\.|http:\\/\\/www\\.|https:\\/\\/|http:\\/\\/)(.{2,}\\.)+([\\w]{2,})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        }
        else{
            return null;
        }
    }

    /*
    implement the method below to validate an email address
     */

    public static boolean validateEmail(String email) {
        String regex = ".{2,}@.{2,}\\..{3,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.find()) {
            return true;
        }
        else{
            return false;
        }
    }

    /*
    implement the method below so that it returns a list of words with repeated letters
    */

    public static List<String> findWordsWithRepeatLetters(String input) {
        String regex = "\\b(\\w*(\\w)\\w*\\2\\w*)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> wordsWithRepeatLetters = new ArrayList<>();

        while(matcher.find()){
                wordsWithRepeatLetters.add(matcher.group());
        }
        return wordsWithRepeatLetters;
    }

    /*
    Bonus Problem ;)
    implement the method below so that it returns a list of words that are repeated twice accidentally in a string
    for example: "appleapple orange pearpear pineapple" -> ["appleapple", "pearpear"]
    */

    public static List<String> findReapetdWords(String input) {
        String regex = "\\b(\\w{2,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> wordsWithRepeatLetters = new ArrayList<>();

        while(matcher.find()){
            wordsWithRepeatLetters.add(matcher.group());
        }
        return wordsWithRepeatLetters;
    }

    public static void main(String[] args) {
        // test your code here!

    }
}