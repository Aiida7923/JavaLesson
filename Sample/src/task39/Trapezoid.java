package task39;

public class Trapezoid {

    public double topSide;
    public double bottomSide;
    public double height;

    public Trapezoid(double topSide, double bottomSide, double height) {
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
        System.out.println("上底が" + topSide + "、下底が" + bottomSide + "、高さが" + height + "の台形を作成しました。");
    }

    public double calculateArea() {
        return 0.5 * (topSide + bottomSide) * height;
    }

}
