public class Overload{
    public static void main(String[] args) {
        System.out.println( write(12));
        System.out.println( write("Twelve"));
        System.out.println( write(4,16));
    }

    public static String write(int num){
        return ("integer passed is " + num);
    }

    public static String write(String num){
        return ("String passed is " + num);
    }

    public static String write(int num1, int num2){
        return ("Sum total is " + (num1 * num2));
    }
}