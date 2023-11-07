package services;

import java.util.Scanner;

public class Prompter {
    Scanner scanner = new Scanner(System.in);
    //Look into abstract class to ask questions until all are answered
    public String promptQuestion(String question)
    {
        System.out.println(question + ": ");
        return scanner.nextLine();
    }
}
