class SubClass extends SuperClass {
    public static void main(String[] args) {
       hello();
       SuperClass.hello();
       
       try {
            echo(args);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Argument required");
        } 
    }

    public static void hello(){
        System.out.println("Hello from the Sub Class");
    }
}