package fr.cailliaud.learnandshare;

public class AlgorithmUntrainedException extends RuntimeException{

    public AlgorithmUntrainedException(){
        super("Algorithm cannot generate text without training phase");
    }
}
