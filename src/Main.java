public class Main {
    public static void main(String[] args) {

        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68 in = " + convertToCentimeters(68) + "cm");

    }

    public static double convertToCentimeters(int totalHeightInInches){
        double inchesToCentimeters = totalHeightInInches * 2.54;
        return inchesToCentimeters;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches){
        double value1 = (heightInFeet + ((double) remainingHeightInInches / 10)) * 12;
        //System.out.println(value1);
        int totalInInches = (int) (value1);
        //System.out.println(totalInInches);
        double centimeters = convertToCentimeters(totalInInches);
        //System.out.println(centimeters);
        return centimeters;
    }

}