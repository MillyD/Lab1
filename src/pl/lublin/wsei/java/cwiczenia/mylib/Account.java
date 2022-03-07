package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;


public class Account {
    public String name;
    final private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    final private static String[] translitRepl = {"a", "b", "v", "g", "d", "e", "je", "zh", "z", "y", "i", "ji", "j",
            "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "h", "c", "ch", "sh", "shh", "'", "ju", "ja"};

    public void setName(String name) {
        this.name = capitalize(translit(name));
    }

    private static String capitalize(String name) {
        String[] tokens = StringUtils.split(name);
        for (int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i].toLowerCase());
        return StringUtils.join(tokens, ' ');
    }

    private static String translit(String arg) {
        String argLowerCase = arg.toLowerCase();
        String[] part = StringUtils.split(argLowerCase);
        String[] result = {"",""};
        int indx;
        for(int i = 0 ; i < part.length; i++) {
            for (int j = 0; j < part[i].length(); j++) {
                indx = StringUtils.indexOf(ukrAlphabet, part[i].charAt(j));
                if (indx == -1) {
                    result[i] += (part[i].charAt(j));
                } else {
                    result[i] += (translitRepl[indx]);
                }
            }
        }
        return StringUtils.join(result,' ');
    }

    public String getName() {
        return name;
    }

}