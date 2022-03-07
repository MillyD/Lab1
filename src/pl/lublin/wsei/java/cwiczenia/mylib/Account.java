package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;


public class Account {
    public String name;

    public void setName(String name) {
        this.name = capitalize(name);
    }
    public static String capitalize(String name) {
        String[] tokens = StringUtils.split(name);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i].toLowerCase());
        return StringUtils.join(tokens,' ');
    }

    public String getName() {
        return name;
    }

}