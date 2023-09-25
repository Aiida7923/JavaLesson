package task41;

public class Main {

  public static void main(String[] args) {
    // (1)
    Triangle triangle1 = new Triangle(3, 4, 3);
    // (2)
    System.out.println("内角の和：" + Triangle.getSumInteriorAngle());
    // (3)
    System.out.println("外角の和：" + Triangle.getSumExteriorAngle());
    // (4)
    System.out.println("周長：" + triangle1.calcPerimeter());
    // (5)
    boolean isIsosceles = triangle1.isIsosceles();
    // (6)
    if (isIsosceles) {
      System.out.println("二等辺三角形：はい");
    } else {
      System.out.println("二等辺三角形：いいえ");
    }
    // (7)
    boolean isEquilateral = triangle1.isEquilateral();
    // (8)
    if (isEquilateral) {
      System.out.println("正三角形：はい");
    } else {
      System.out.println("正三角形：いいえ");
    }
    // (9)
    Triangle triangle2 = new Triangle(4, 3, 3);
    // (10)
    boolean isCongruent = triangle1.isCongruent(triangle2);
    // (11)
    if (isCongruent) {
      System.out.println("合同：はい");
    } else {
      System.out.println("合同：いいえ");
    }
    // (12)
    boolean isLineSymmetric = triangle1.isLineSymmetric();
    // (13)
    if (isLineSymmetric) {
      System.out.println("線対称：はい");
    } else {
      System.out.println("線対称：いいえ");
    }
    // (14)
    boolean isPointSymmetric = Triangle.isPointSymmetric();
    // (15)
    if (isPointSymmetric) {
      System.out.println("点対称：はい");
    } else {
      System.out.println("点対称：いいえ");
    }
  }
}
