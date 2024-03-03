package task3.runner;

import task3.doublingСharacters.DoublingCharacters;

import java.util.Scanner;

public class Runner {
    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str=scanner.next();
        scanner.close();
        DoublingCharacters.doublingCharacters(str);
    }
}
