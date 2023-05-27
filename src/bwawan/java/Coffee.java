package bwawan.java;

public class Coffee {
    public int beans;
    public String roast;

    public String brew() {
        return "Brewing coffee by object...";
    }

    public static String brew(String roast, int beans) {
        return "Brewing " + beans + " Beans of " + roast + " Roast Coffee";
    }
}
