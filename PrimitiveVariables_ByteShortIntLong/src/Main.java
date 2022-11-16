public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: java Programming Masterclass");
        System.out.println("Primitive Variables Byte Short Int Long");

        //Integer Data Type
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntvalue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value:  " + myMinIntValue);
        System.out.println("Integer Maximum Value:  " + myMaxIntvalue);
        System.out.println("Busted Max value = " + (myMaxIntvalue + 1)); //Overflow
        System.out.println("Busted Min value = " + (myMinIntValue - 1)); //Underflow


        //Byte Data Type
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value: " + myMinByteValue);
        System.out.println("Byte Max Value: " + myMaxByteValue);


        //Short Data Type
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value: " + myMinShortValue);
        System.out.println("Short Max Value: " + myMaxShortValue);

        //Long
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        long myLongValue = 100;
        System.out.println("Long Min Value: " + myMinLongValue);
        System.out.println("Long Max Value: " + myMaxLongValue);
        System.out.println("myLongValue: " + myLongValue);

        short bigShortLiteralValue = 32767;
        System.out.println(bigShortLiteralValue);

    }
}