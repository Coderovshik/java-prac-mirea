import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Integer[][] a1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        Matrix<Integer> m1 = new Matrix<>(a1);
        Matrix<Integer> m2 = new Matrix<>(4, 3, 1);
        Matrix<Integer> m3 = new Matrix<>(4, 3, 3);
        m2.add(m3).print();
        m2.sub(m3).print();
        m1.mul(m2).print();
    }
}
