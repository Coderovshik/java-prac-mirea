import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;

public class Test {
    public static <E> E getElem(E[] A, int i) {
        return A[i];
    }

    public static List<String> getFileList(String directoryPath) {
        List<String> fileList = new ArrayList<>();

        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    fileList.add(file.getName());
                }
            }
        }

        return fileList;
    }

    public static void list5(String directoryPath) {
        List<String> fileList = getFileList(directoryPath);

        // Вывод первых 5 элементов списка
        for (int i = 0; i < Math.min(5, fileList.size()); i++) {
            System.out.println(fileList.get(i));
        }
    }
    
    public static void main(String[] args) {
        Solution<Integer, String, Double> s = new Solution<>();
        ArrayList<Integer> al = s.newArrayList(1, 2, 3, 4, 5, 6);
        HashSet<Integer> hs = s.newHashSet(1, 2, 3, 4, 5);
        String[] keys = {"one", "two", "three"};
        Double[] values = {1.1, 2.2, 3.3};
        HashMap<String, Double> hm = s.newHashMap(keys, values);

        System.out.println(al);
        System.out.println(hs);
        System.out.println(hm);
    }
}
