package task1.method;

/**
 * there are many text processing methods in this class
 */
public class Method {

    private static String[]splitWords(String str){
        return str.split("-");
    }

    public static void methodOne(String str) {
        String[]str1=splitWords(str);
        System.out.println("1) "+ str1[0]+str1[2]);
    }

    public static void methodTwo(String str){
        String[]str1=splitWords(str);
        str1[1]="***";
        str1[3]="***";
        StringBuilder strBuilder = new StringBuilder(str1[0]);
        for(byte i = 1; i< str1.length; i++){
            strBuilder.append("-").append(str1[i]);
        }
        str = strBuilder.toString();
        System.out.println("2) "+ str);
    }

    public  static void methodThree(String str){
        String str1=str.toLowerCase();
        String[]string=Method.splitWords(str1);
        char[]symbol=string[4].toCharArray();
        System.out.print("3) Letters: ");
        System.out.println(string[1]+"/"+string[3]+"/"+symbol[1]+"/"+symbol[3]);
    }

    public static void methodFour(String str){
        //Этот метод подходит для любых подобных строк
        System.out.print("4) Letters: ");
        String str1= str.toUpperCase();
        String[]str2=Method.splitWords(str1);
        StringBuilder resStr=new StringBuilder();
        for(String s:str2){
            boolean isLetter=false;
            char[] symbol=s.toCharArray();
            for(char s1:symbol){
                if(Character.isLetter(s1)){
                    resStr.append(s1);
                    isLetter=true;
                }else{
                    isLetter=false;
                    break;
                }
            }
            for (char s1:symbol){
                if(!isLetter){
                    if (Character.isLetter(s1)) {
                        resStr.append(s1).append("/");
                    }
                }
            }
            if(isLetter){
                resStr.append("/");
            }
        }
        String resStr2=resStr.substring(0,resStr.length()-1);
        System.out.println(resStr2);
    }

    public static void MethodFive(String str){
        String str1=str.toLowerCase();
        System.out.print("5) ");
        if(str1.contains("abc")){
            System.out.println("есть");
        }else {
            System.out.println("нет");
        }
    }

    public static void MethodSix(String str){
        int index=str.indexOf("555");
        System.out.print("6) ");
        if(index==0){
            System.out.println("строка начинается с 555");
        }else {
            System.out.println("строка начинается с других символов");
        }
    }

    public  static void MethodSeven(String str){
        int index=str.indexOf("1a2b");
        System.out.print("7) ");
        if(index==str.length()-4){
            System.out.println("строка заканчивается 1a2b");
        }else{
            System.out.println("строка заканчивается другими символами");
        }
    }
}
