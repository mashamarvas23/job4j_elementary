package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(870);
        System.out.println("870 rubles are " + dollar + " dollar.");

        float inputForEuroConvertation = 140;
        float expectedForEuroConvertation = 2;
        float outputForEuroConvertation = Converter.rubleToEuro(inputForEuroConvertation);
        boolean passedForEuroConvertation = expectedForEuroConvertation == outputForEuroConvertation;
        System.out.println("140 rubles are 2. Test result : " + passedForEuroConvertation);

        float inputForDollarConvertation = 360;
        float expectedForDollarConvertation = 6;
        float outputForDollarConvertation = Converter.rubleToDollar(inputForDollarConvertation);
        boolean passedForDollarConvertation = expectedForDollarConvertation == outputForDollarConvertation;
        System.out.println("360 rubles are 6. Test result : " + passedForDollarConvertation);
    }
}
