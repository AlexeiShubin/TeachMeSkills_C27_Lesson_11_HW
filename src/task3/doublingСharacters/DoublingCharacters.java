package task3.doublingСharacters;

/**
 * method for doubling characters in a string
 */
public class DoublingCharacters {

    public static void doublingCharacters(String str){
        char[]symbols=str.toCharArray();
        StringBuilder resStr=new StringBuilder();
        for(char s:symbols){
            resStr.append(s).append(s);
        }
        System.out.print("итоговая строка: "+resStr);
    }
}
