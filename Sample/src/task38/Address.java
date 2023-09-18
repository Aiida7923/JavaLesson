public class Address {

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("住所が正しく入力されていません。");
            return;
        }
        System.out.println("郵便番号：" + args[0]);
        System.out.println("都道府県：" + args[1]);
        System.out.println("市区町村番地：" + args[2]);

        if (args.length >= 4) {
            System.out.println("ビル名等：" + args[3]);
        }
    }

}
