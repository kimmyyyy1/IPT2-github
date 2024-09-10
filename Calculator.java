public class Calculator{
    
    public static int addition(int a, int b){
        return a + b;
    }

    public static int subtraction(int a, int b){
        return a - b;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }

    public static double division(int a, int b){
        if (b !=0){
            return (double) a / b;
        
        }else{
            throw new ArithmeticException("Division by zero");
        }
    }
            
            public static int modulus(int a, int b){
                return a % b;
            }

                public static void main(String[]args){
                    System.out.printIn("Addition: " + addition(5,3));
                    System.out.printIn("Substraction: " + subtraction(5,3));
                    System.out.printIn("Multiplicaiton: " + multiplication(5,3));
                    System.out.printIn("Division: " + division(5,3));
                    System.out.printIn("Modulus: " + modulus(5,3));
                }
            }