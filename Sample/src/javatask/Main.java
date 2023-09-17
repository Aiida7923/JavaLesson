public class Main {

    public static void main(String[] args) {
        // 課題38
        System.out.println("------------課題38------------");
        // (2)の実行
        Address.addressInfo("160-0022", "東京都", "新宿区新宿5-11-1", "ホーメスト新宿ビル9F");
        // (3)の実行
        Address.addressInfo("279-0031", "千葉県", "浦安市舞浜1-1");
        // (4)の実行
        Address.addressInfo();
        System.out.println("------------課題38------------");

        // 課題39
        System.out.println("------------課題39------------");
        // (4)の書き換え後
        // ㈰
        Trapezoid trapezoid1 = new Trapezoid(2.5, 4.0, 3.0);
        // ㈪
        systemOutCulcResult(trapezoid1);
        // ㈫
        trapezoid1.topSide = 5.0;
        // ㈬
        systemOutCulcResult(trapezoid1);
        // ㈭
        Trapezoid trapezoid2 = new Trapezoid(6.75, 3.25, 8.0);
        // ㈮
        systemOutCulcResult(trapezoid2);
        // ㈯
        trapezoid2.height = 4.5;
        // ㉀
        systemOutCulcResult(trapezoid2);
        System.out.println("------------課題39------------");

        // 課題41
        System.out.println("------------課題41------------");
        // ㈰
        Triangle triangle1 = new Triangle(3, 4, 3);
        // ㈪
        System.out.println("内角の和：" + Triangle.getSumInteriorAngle());
        // ㈫
        System.out.println("外角の和：" + Triangle.getSumExteriorAngle());
        // ㈬
        System.out.println("周長：" + triangle1.calcPerimeter());
        // ㈭
        boolean isIsosceles = triangle1.isIsosceles();
        // ㈮
        if (isIsosceles) {
            System.out.println("二等辺三角形：はい");
        } else {
            System.out.println("二等辺三角形：いいえ");
        }
        // ㈯
        boolean isEquilateral = triangle1.isEquilateral();
        // ㉀
        if (isEquilateral) {
            System.out.println("正三角形：はい");
        } else {
            System.out.println("正三角形：いいえ");
        }
        // ㈷
        Triangle triangle2 = new Triangle(4, 3, 3);
        // ㉂
        boolean isCongruent = triangle1.isCongruent(triangle2);
        // ㉃
        if (isCongruent) {
            System.out.println("合同：はい");
        } else {
            System.out.println("合同：いいえ");
        }
        // ㈹
        boolean isLineSymmetric = triangle1.isLineSymmetric();
        // ㈺
        if (isLineSymmetric) {
            System.out.println("線対称：はい");
        } else {
            System.out.println("線対称：いいえ");
        }
        // ㈱
        boolean isPointSymmetric = Triangle.isPointSymmetric();
        // ㈾
        if (isPointSymmetric) {
            System.out.println("点対称：はい");
        } else {
            System.out.println("点対称：いいえ");
        }

        System.out.println("------------課題41------------");
    }

    // 課題39(3)
    private static void systemOutCulcResult(Trapezoid trapezoid) {
        System.out.println("上底が" + trapezoid.topSide + "、下底が" + trapezoid.bottomSide + "、高さが" + trapezoid.height
                + "の台形の面積は" + trapezoid.calculateArea() + "です。");
    }

}