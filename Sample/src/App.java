import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class App {
    // 変数宣言
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> listInteger = new ArrayList<>();
        listInteger.add(73);
        listInteger.add(4);
        listInteger.add(1);
        getMaxInt(listInteger);


        ArrayList<List<String>> listString = new ArrayList<>();
        ArrayList<String> listStrings = new ArrayList<>();
        listStrings.add("test");
        listString.add(listStrings);
        getList(listString);
    }

    private static void getMaxInt(ArrayList<Integer> list) {
        int maxInt = 0;
        for (int i: list) {
            if (maxInt < i) {
                maxInt = i;
            }
        }
        System.out.println(maxInt);
    }
    
    private static void getList(ArrayList<List<String>> list) {
        for (List<String> i: list) {
            if (i != null) {
                for (String str: i) {
                    System.out.println(str);
                }
            }
        }
    }

    


}
