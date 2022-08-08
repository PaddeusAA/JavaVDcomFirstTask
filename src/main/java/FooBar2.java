/*
  ���������� ��� if-else
  (����� ExceptionCheck() �� � ����)
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

        //����� ����� �� 1 �� number
        IntStream intStream = IntStream.range(1, number+1);
        intStream.forEach(System.out::println);
        System.out.println("----------multiplicity check----------");

        new FooBar2().startFunction(number);

    }

    public void startFunction(int value){
        isMultipleOfThreeAndFive(value);
    }

    //region ������ �� �������� ���������

    //���������� ��������� ����� 3
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

    // ���������� ��������� ����� 5, ���� �� ������
    // ���������� ����� printValue()
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

    //���������� ��������� ������ 3 � 5
    public String isMultipleOfThreeAndFive (int value){
        String print = "";
        int result= value %3 ;

        /*
       ���� ����� ������ 3 �� �������� � case 0 ������� switch'�,
       (� ��������� ������� �������� � default ����
       ��� ���������� isMultipleOfFive() )
       ��� ����������� ��������� �� 5 � ��� ������
       �������� � case 0 ������� switch'� � ������������ ����� ������
       (���� ���, �� �������� ����� isMultipleOfFive() �� ����� default )
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

    //������� � ������� value ���� ��� �� ������ 3 ��� 5
    public void printNumber(int value){
        System.out.println(value);
    }

    //endregion

    //����� ����������� ��������� ����
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

    //Exception ����� ��� ������� ������ ��� ����������� �������� �����
    private static class NumberException extends Exception{
        public NumberException() {}
    }
}
