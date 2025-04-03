package Manipulating_data;

public class Random {
    public static void main(String[] args) {
        
        float random = (float)Math.random();
        System.out.println("Random number " + random);

        float multiplied = random * 10;
        System.out.println("Multiplied numbert " + multiplied);

        int randomint = (int)Math.ceil(multiplied);
        System.out.println("Random Integer: " + randomint);

    }

}
