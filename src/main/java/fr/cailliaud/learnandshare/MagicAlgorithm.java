package fr.cailliaud.learnandshare;

import java.util.Collections;
import java.util.Map;

public class MagicAlgorithm {

    private MagicAlgorithm(){}

    public static MagicAlgorithm create(){
        return new MagicAlgorithm();
    }

    public void train(String text){
        // DO NOTHING
    }

    public Map<String,Double> nextWords(String word){
        return Collections.emptyMap();
    }

    public String generate(String firstWord, int numberOfWords){
        return " ";
    }

}
