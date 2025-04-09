class SuperClass{
    public static void hello(){
        System.out.println("Hello from the Super Class");
    }
    
    public static void echo(String[] arg){
        try {
            System.out.println("You entered: " + arg[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Argument required");
        }
    }
}