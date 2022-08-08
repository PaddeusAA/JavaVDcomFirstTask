import java.util.Scanner;

public class FooBar3 {
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

        MultiplicityClass multiplicityClass = new MultiplicityClass();

        multiplicityClass.isMultipleOfThreeAndFive(number);
        multiplicityClass.isMultipleOfThree(number);
        multiplicityClass.isMultipleOfFive(number);
        multiplicityClass.printNumber(number);
    }

    public static class MultiplicityClass{
        boolean isMultiplicity = false;

        public boolean isMultipleOfThree(int value) {
            if(value %3 == 0 && !isMultiplicity){
                System.out.println("Foo");
                isMultiplicity = true;
            }
            return isMultiplicity;
        }

        public boolean isMultipleOfFive(int value) {
            if(value %5 == 0 && !isMultiplicity){
                System.out.println("Bar");
                isMultiplicity = true;
            }
            return isMultiplicity;
        }

        public boolean isMultipleOfThreeAndFive(int value) {
            if(value %5 == 0 && value %3 == 0 && !isMultiplicity){
                System.out.println("FooBar");
                isMultiplicity = true;
            }
            return isMultiplicity;
        }

        public void printNumber(int value){
            if(!isMultiplicity){
                System.out.println(value);
            }
        }
    }

    private static void ExceptionCheck(int value){
        if(value<=0){
            try {
                throw new FooBar3.NumberException();
            } catch (FooBar3.NumberException e) {
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
