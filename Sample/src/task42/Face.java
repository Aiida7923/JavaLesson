package task42;

public class Face {

    private double size;
    private Eye rightEye;
    private Eye leftEye;
    private Mouth mouth;

    public Face(double size, Eye rightEye, Eye leftEye, Mouth mouth) {
        this.size = size;
        this.rightEye = rightEye;
        this.leftEye = leftEye;
        this.mouth = mouth;
    }

    public void displaySize() {
        System.out.println("顔：" + size + "cm");
        System.out.println("右目：" + rightEye.getSize() + "cm");
        System.out.println("左目：" + leftEye.getSize() + "cm");
        System.out.println("口：" + mouth.getSize() + "cm");
    }

    public double getSize() {
        return size;
    }

    public Eye getRightEye() {
        return rightEye;
    }

    public Eye getLeftEye() {
        return leftEye;
    }

    public Mouth getMouth() {
        return mouth;
    }

    public void setLeftEye(Eye leftEye) {
        this.leftEye = leftEye;
    }
}
