import java.util.*;
import java.text.*;

void main() {
/*
*       this works with java 7
*  Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale INDIA = new Locale("en", "IN");

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(INDIA).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
     */
    Scanner scn = new Scanner(System.in);
    double payment = scn.nextDouble();
    scn.close();

    NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

    Locale indiaLocale = new Locale("en", "IN");
    NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);

    DecimalFormat india = (DecimalFormat) indiaFormat;
    DecimalFormatSymbols symbols = india.getDecimalFormatSymbols();
    symbols.setCurrencySymbol("Rs.");
    india.setDecimalFormatSymbols(symbols);

    System.out.println("US: " + us.format(payment));
    System.out.println("India: " + indiaFormat.format(payment));
    System.out.println("China: " + china.format(payment));
    System.out.println("France: " + france.format(payment));
}



