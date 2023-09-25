package task40;

public class Task40 {

  void method(String arg1, int arg2) {
    for (int i = 0; i < 10; i++) {
      String str2 = "de";

      if (i < 3) {
        System.out.println(str2);
      } else if (i < 7) {
        System.out.println(arg2);
      } else {
        String str3 = "fghij";
        System.out.println(str3);
        System.out.println(str2 + str3);
      }
    }

    if (arg2 > 0) {
      String str1 = "abc";
      String str4 = "klm";
      System.out.println(str1 + str4);

      int num = 10;
      if (num < 20) {
        System.out.println(str1);
      }
    }
  }
}
