package ro.fasttrackit.curs18;

public class Recursiv {

    public int lenght(String word) {
        if (word == null) throw new IllegalArgumentException();
        if (word.equalsIgnoreCase("")) {
            return 0;
        } else {
            return 1 + lenght(word.substring(1));
        }
    }
}
