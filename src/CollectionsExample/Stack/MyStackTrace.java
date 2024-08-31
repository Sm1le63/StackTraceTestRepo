package CollectionsExample.Stack;

public class MyStackTrace {
    public static void main(String[] args) {
        test();

    }
    public void foo(){
        foo();
    }

    public static void test() {
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();

        for (var info : methods)
            System.out.println(info); // просто выводим весь стэктрейс по элементно в цикле for-each

        for (StackTraceElement method : methods) {
            System.out.println(method.getLineNumber()); // выводим номера строк каждого элемента стектрейса
        }
    }
}