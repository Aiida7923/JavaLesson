package task42;

public class Mouth {

    private double size;
    private String color;

    public Mouth(double size, String color) {
        this.size = size;
        this.color = color;
    }

    public void eat(String food) {
        System.out.println(food + "を食べました。");
    }

    public void speak(String message) {
        System.out.println(message + "と発言しました。");
    }

    public double getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}