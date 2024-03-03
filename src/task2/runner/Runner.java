package task2.runner;

import task2.findWord.FindWord;

import java.util.Scanner;

public class Runner {

    public static void main(String[]args){
        System.out.print("Введите строку: ");
        Scanner scanner=new Scanner(System.in);
        String str= scanner.nextLine();
        scanner.close();

        FindWord.theSmallestWord(str);
        FindWord.theBiggestWord(str);
    }
}
