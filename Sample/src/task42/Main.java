package task42;

public class Main {
    public static void main(String[] args) {
        // 1
        Eye rightEye = new Eye(2.7, 1.0, "黒");
        // 2
        Eye leftEye = new Eye(2.6, 0.8, "茶");
        // 3
        Mouth mouth = new Mouth(5.1, "赤");
        // 4
        Face face = new Face(13.8, rightEye, leftEye, mouth);
        // 5
        face.displaySize();
        // 6
        face.getRightEye().see();
        // 7
        face.getLeftEye().see();
        // 8,9
        if (face.getRightEye() == face.getLeftEye()) {
            System.out.println("右目と左目は同じです。");
        } else {
            System.out.println("右目と左目は同じではありません。");
        }
        // 10,11
        if (face.getRightEye().getSize() == face.getLeftEye().getSize()) {
            System.out.println("右目と左目は同じサイズです。");
        } else {
            System.out.println("右目と左目は同じサイズではありません。");
        }
        // 12
        face.setLeftEye(rightEye);
        // 13
        face.displaySize();
        // 14
        face.getRightEye().see();
        // 15
        face.getLeftEye().see();
        // 16,17
        if (face.getRightEye() == face.getLeftEye()) {
            System.out.println("右目と左目は同じです。");
        } else {
            System.out.println("右目と左目は同じではありません。");
        }
        // 18,19
        if (face.getRightEye().getSize() == face.getLeftEye().getSize()) {
            System.out.println("右目と左目は同じサイズです。");
        } else {
            System.out.println("右目と左目は同じサイズではありません。");
        }
    }
}