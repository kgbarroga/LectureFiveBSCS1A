public class Test {
    
    
    /**
     * Java Constructors-> methods called when an object is initialized
     * ->no-arg
     * ->parameterized->accepts one or more parameters
     * ->default constructor
     */

    //  this constructor has no parameters
    // Test(){
    //     // constructor body
    //     System.out.println("Constructor happened");
    //     name = "Marco";
    // }
    /**
     * Create a Constructor that receives a String parameter
     * The constructor should display the String Parameter Received
     */
    
    /*
    Test(){
        // name = "John doe";
        System.out.println("Constructor is called!");
    }
    */
    /*
    Jose
     
    
    */
    /*
    Earnest
    Test(String st){
        System.out.println(st);
    }
    */
    // Test(String st){
    //     System.out.println(st);
    // }
    private String name;
    int a;
    boolean b;
    /**
     * parameterized constructor -> receives a parameter
     * @param args
     */
    // Test(String inputName){
    //     name = inputName;
    //     System.out.println(name);
    // }
    public static void main(String[] args) {
        Test testObj = new Test();
        /**
         * Default constructor-> values for instance variables
         * have initial values
         */
        System.out.println("Integer value a = " + testObj.a);
        System.out.println("Boolean value = " + testObj.b);
        // Test obj = new Test("Java");
        // Test obj2 = new Test("Python");
        // System.out.println("The new name value = " + obj2.name);
        
    }
}
