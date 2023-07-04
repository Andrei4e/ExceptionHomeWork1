import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Task1();
        Task2();
        Task3();
        Task4();
    }

    //Задание1
    public static void Task1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        float name;
        try {
            name = Float.parseFloat(in.nextLine());
        } catch (Exception e) {
            System.out.println("Введенное значение нельзя реобразовать в дробное число");
            Task1();
        }
    }

    //Задание2
    public static void Task2() {
        try {
            int d = 0;
            int[] intArray = new int[] {1,2};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }         
    }

    //Задание3
    public static void Task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }             
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
     }
     
    //Задание3
    public static void Task4() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите непустую строку: ");
        String name = in.nextLine();
        if (name.isEmpty())
            throw new Exception("Нельзя вводить устую строку");       
    }
 
}

