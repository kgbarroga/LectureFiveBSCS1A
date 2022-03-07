public class App {
    /***
     * Lecture Coverage:
     *  Java Methods
     *  Method Declarations
     *  Calling a Method
     *  Method Return Type
     *  Method Parameters
     *  Java Constructors
     * @param args
     * @throws Exception
     */
    /**
     * Sample task
     * Create a method called square()
     * Takes a parameter of integer, and returns the square of a number
     * 
     * 
     * 
     */
    /**
     * Complete syntax
     * modifier static returnType nameOfMethod (param1, param2 ...){
     *  // method body
     * }
     */
    // create square method
    public int square(int num1){
        // code segment
        return num1 * num1;
    }
    // create a Method
    public int addNumbers (int x, int y){
        // int sum = x + y;
        // return sum;
        System.out.println("Currently adding numbers");
        return x + y;
    }
    // void method
    public void multiplyNumbers(int x, int y){
        System.out.println("Result of multiplication is " + x*y);
    }
    
    public static void main(String[] args) throws Exception {
        // sqrt()->static (belongs to the Math Class)
        
        // Math.sqrt()
        /**
         * Methods -> code segments/block of code that performs a specific task
         * e.g. draw a circle, color a circle
         *
         */
        /**
         * Methods
         * -User Defined
         * -Standard Library Methods
         */
        /**
         * Syntax for a method
         * returnType methodName(){
         *  // code goes here
         * }
         */
        /**
         * Complete syntax
         * modifier static returnType nameOfMethod (param1, param2 ...){
         *  // method body
         * }
         */

        int num1 = 20;
        int num2 = 50;
        // create an object App
        // App obj = new App();
        
        // obj.multiplyNumbers(num1, num2);
        // call our addNumbers method
        // int result = obj.addNumbers(num1, num2);
        // System.out.println("The result is " + result);
        // int result = obj.square(num1);
        // System.out.println("the square is "+ result);
        // Test t = new Test();

        
        
    }
}
