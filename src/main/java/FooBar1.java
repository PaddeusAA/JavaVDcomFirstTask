import java.util.Scanner;

public class FooBar1 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number greater than zero: ");
        number = scanner.nextInt();
        ExceptionCheck(number);

        //вывод чисел от 1 до number
        for (int i = 1; i < number + 1; i++) {
            System.out.println(i);
        }
        System.out.println("----------multiplicity check----------");

        new FooBar1().multiplicityMethods(number);
    }

    public String multiplicityMethods(int value){
        String result = "";

        if (value % 5 == 0 && value % 3 == 0) {
            result = "FooBar";
        } else if (value % 3 == 0) {
            result = "Foo";
        } else if (value % 5 == 0) {
            result = "Bar";
        } else {
            printNumber(value);
        }
        System.out.println(result);
        return result;
    }

    void printNumber(int value){
        System.out.println(value);
    }

    private static void ExceptionCheck(int value){
        if(value<=0){
            try {
                throw new FooBar1.NumberException();
            } catch (FooBar1.NumberException e) {
                System.out.println("\t Error 1: Incorrectly entered number");
                throw new RuntimeException(e);
            }
        }
    }

    //Exception класс для выброса ошибки при некорректно введеном числе
    static class NumberException extends Exception{
        public NumberException() {}
    }
}
