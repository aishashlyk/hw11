import java.util.Scanner;

public class Main {
    //1
    static void findSquareRoot(double num){
        if(num<0){
            throw new ArithmeticException(
                    "The square root of a negative number " +
                            "is not defined in real numbers."
            );
        }
        else{
            double root = Math.sqrt(num);
            System.out.println(
                    "The square root of " + num + " is " + root + "."
            );
        }
    }
    //2
    static void divide(int x, int y){
        if(y == 0){
            throw new ArithmeticException("Can't divide by 0");
        }
        else{
            double division = (double)x / y;
            System.out.println(x + " divided by "+ y + " is " + division);
        }
    }
    //3
    static void calculateNumInString(String arr){
        if(arr.trim().isEmpty()){
            System.out.println("Введена пустая строка. Попробуйте снова.");
            return;
        }
        String[] tokens = arr.split("\\s+");

        int sum = 0;

        for (String token : tokens) {
            try {
                int number = Integer.parseInt(token);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("\"" + token + "\" не является целым числом и будет пропущено.");
            }
        }

        System.out.println("Сумма целых чисел в строке равна " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
        System.out.println(1);
        System.out.print("Enter a number: ");
        try{
            double num = sc.nextDouble();
            findSquareRoot(num);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Invalid input. Please enter a valid number.");
        }
        //2
        System.out.println(2);
        System.out.print("Enter a dividend: ");
        int x = sc.nextInt();
        System.out.print("Enter a divisor: ");
        int y = sc.nextInt();
        divide(x, y);
        //3
        Scanner sc1 = new Scanner(System.in);
        System.out.println(3);
        System.out.print("Введите строку с целыми числами и/или другими значениями: ");
        String arr = sc1.nextLine();
        calculateNumInString(arr);
    }
}