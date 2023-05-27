package bwawan.java;

public class Tea {
    public String herb;
    public int leaves;

    public  String steep() {
        return "Steeping " + leaves + " leaves of this " + herb + " tea";
    }

    public static String steep(String herb, int leaves) {
        return "Steeping " + leaves + " leaves of " + herb + " statically.";
    }
}