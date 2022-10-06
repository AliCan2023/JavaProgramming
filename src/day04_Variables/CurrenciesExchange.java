package day04_Variables;

public class CurrenciesExchange {
    public static void main(String[] args) {

        // I've gto $1000 in my pocket and want some local currencies;

        int dollar = 1000;
        double turkishLira = dollar * 18.25;
        double euro = dollar * 1.0005;
        // jpy, pound, cadUsd, chinesYuan
        double JPY = dollar * 144.5;
        double pound = dollar *  0.8673;
        double cad = dollar * 1.31;
        System.out.println("dollar = " + dollar);
        System.out.println("turkishLira = " + turkishLira);
        System.out.println("euro = " + euro);
        System.out.println("jpy = " + JPY);
        System.out.println("pound = " + pound);
        System.out.println("cad = " + cad);


    }
}
