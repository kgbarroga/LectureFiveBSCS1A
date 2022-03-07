public class Test {
    private String name;
    /**
     * Java Constructors
     */
    Test(){
        // constructor body

        System.out.println("Constructor happened");
        name = "Marco";
    }
    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println("New name = " + obj.name);
    }
}
