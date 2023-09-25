package task39;

public class Main {

  public static void main(String[] args) {
    // (2-1)
    Trapezoid trapezoid1 = new Trapezoid(2.5, 4.0, 3.0);
    // (2-2)
    calculateResult(trapezoid1);
    // (2-3)
    trapezoid1.topSide = 5.0;
    // (2-4)
    calculateResult(trapezoid1);
    // (2-5)
    Trapezoid trapezoid2 = new Trapezoid(6.75, 3.25, 8.0);
    // (2-6)
    calculateResult(trapezoid2);
    // (2-7)
    trapezoid2.height = 4.5;
    // (2-8)
    calculateResult(trapezoid2);
  }

  private static void calculateResult(Trapezoid trapezoid) {
    System.out.println(
      "上底が" +
      trapezoid.topSide +
      "、下底が" +
      trapezoid.bottomSide +
      "、高さが" +
      trapezoid.height +
      "の台形の面積は" +
      trapezoid.calculateArea() +
      "です。"
    );
  }
}
