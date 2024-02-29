public class Main {
    public static void main(String[] args) {
        System.out.println(HumanBMI.getResult(80, 1.52));
    }
}

class HumanBMI {
    public static String getResult(double weight, double height) {
        double resFactor = weight / (height * height);
        
        if (resFactor < 18.5) return "Deficit";
        if (resFactor >= 18.5 && resFactor < 25) return "Norm";
        if (resFactor >= 25 && resFactor < 30) return "Warning!";

        return "Fat";
    }
}
