/*
  Реализовал без if-else
  (метод ExceptionCheck() не в счет)
*/

import java.util.Scanner;
import java.util.stream.*;

public class FooBar2 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number greater than zero: ");
        number = scanner.nextInt();
        ExceptionCheck(number);

        //вывод чисел от 1 до number
        IntStream intStream = IntStream.range(1, number+1);
        intStream.forEach(System.out::println);
        System.out.println("----------multiplicity check----------");

        new FooBar2().startFunction(number);

    }

    public void startFunction(int value){
        isMultipleOfThreeAndFive(value);
    }

    //region методы на проверку кратности

    //определяет кратность числу 3
    public String isMultipleOfThree (int value){
        String print = "";
        int result= value %3;
        switch (result){
            case 0:
                print = "Foo";
                break;
        }
        System.out.println(print);
        return print;
    }

    // определяет кратность числу 5, если не кратно
    // вызывается метод printValue()
    public String isMultipleOfFive (int value){
        String print = "";
        int result= value %5;
        switch (result){
            case 0:
                print = "Bar";
                break;

            default: printNumber(value);
        }
        System.out.println(print);
        return print;
    }

    //определяет кратность числам 3 и 5
    public String isMultipleOfThreeAndFive (int value){
        String print = "";
        int result= value %3 ;

        /*
       если число кратно 3 то попадаем в case 0 первого switch'а,
       (в противном случает попадаем в default блок
       где вызывается isMultipleOfFive() )
       где проверяется кратность на 5 и при успехе
       попадаем в case 0 второго switch'а и производится вывод текста
       (если нет, то вызываем метод isMultipleOfFive() из блока default )
        */
        switch (result){
            case 0:
                int tempResult = value %5;

                switch (tempResult){
                    case 0:
                        print = "FooBar";
                        break;
                    default: isMultipleOfThree(value);
                }

                break;
            default: isMultipleOfFive(value);
        }
        System.out.println(print);
        return print;
    }

    //выводит в консоль value если оно не кратно 3 или 5
    public void printNumber(int value){
        System.out.println(value);
    }

    //endregion

    //метод проверяющий ошибочный ввод
    private static void ExceptionCheck(int value){
        if(value<=0){
            try {
                throw new NumberException();
            } catch (NumberException e) {
                System.out.println("\t Error 1: Incorrectly entered number");
                throw new RuntimeException(e);
            }
        }
    }

    //Exception класс для выброса ошибки при некорректно введеном числе
    private static class NumberException extends Exception{
        public NumberException() {}
    }
}
