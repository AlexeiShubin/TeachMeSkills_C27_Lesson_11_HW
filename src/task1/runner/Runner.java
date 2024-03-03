package task1.runner;

import task1.method.Method;

public class Runner {

    public static void main(String[]args){

        String str="5552-AbC-3673-wSa-1a2b";

        System.out.println(str);
        Method.methodOne(str);
        Method.methodTwo(str);
        Method.methodThree(str);
        Method.methodFour(str);
        Method.MethodFive(str);
        Method.MethodSix(str);
        Method.MethodSeven(str);
    }
}
