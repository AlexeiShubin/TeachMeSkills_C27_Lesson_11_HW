package task2.findWord;

/**
 * in this class there is a method for finding the largest word and a method for finding the smallest one
 */
public class FindWord {

    public static void theSmallestWord(String str){
        String[] words=str.split(" ");
        String theSmallestWord=words[0];
        for (String word : words) {
            if (theSmallestWord.length()>=word.length()){
                theSmallestWord=word;
            }
        }
        System.out.println("Самое маленькое слово: "+theSmallestWord);
    }

    public static void theBiggestWord(String str){
        String[] words=str.split(" ");
        String theBiggestWord=words[0];
        for (String word : words) {
            if (theBiggestWord.length()<=word.length()){
                theBiggestWord=word;
            }
        }
        System.out.println("Самое большое слово: "+theBiggestWord);
    }
}
