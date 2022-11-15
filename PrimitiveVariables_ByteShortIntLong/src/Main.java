public class Main {
    public static void main(String[] args){
        System.out.println("Udemy: java Programming Masterclass");
        System.out.println("Primitive Variables Byte Short Int Long");

        //int myValue = 10_000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntvalue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value:  " + myMinIntValue);
        System.out.println("Integer Maximum Value:  " + myMaxIntvalue);
        System.out.println("Busted Max value = " + (myMaxIntvalue + 1)); //Overflow
        System.out.println("Busted Min value = " + (myMinIntValue - 1)); //Underflow

    }
}