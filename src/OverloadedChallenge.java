public class OverloadedChallenge {

    public static void main(String[] args) {

        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68 in = " + convertToCentimeters(68) + "cm");

        System.out.println("1mi, 1yd = " + NewConvertToMeters(1, 1) + "mt");
        System.out.println("5mi, 1yd = " + NewConvertToMeters(5, 1) + "mt");


    }

    public static double convertToCentimeters(double inches){
        return inches * 2.54;

    }

    public static double convertToCentimeters(int feet, int inches){
        return convertToCentimeters((feet * 12) +  inches);

    }

    public static double convertToMeters(int feet, int inches){
        return ((feet * 12) + inches) / 39.37;

    }

    public static double NewConvertToMeters(int yard) {
        return yard / 1.0936;
    }

    public static double NewConvertToMeters(int mile, int yard){
        return NewConvertToMeters((mile * 1760) + yard);
    }

}