import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Matrix<T extends Number & Comparable> {
    private ArrayList<ArrayList<T>> values;
    private int w;
    private int h;

    public Matrix(int h, int w, T defaultValue) {
        this.w = w;
        this.h = h;

        this.values = new ArrayList<>(h);
        for (int i = 0; i < h; i++) {
            this.values.add(new ArrayList<>(Collections.nCopies(w, defaultValue)));
        }
    }

    public Matrix(T[][] m) {
        this.h = m.length;
        this.w = m[0].length;

        values = new ArrayList<>(h);
        for (int i = 0; i < h; i++) {
            values.add(i, new ArrayList<>(w));
            T[] row = m[i];
            for (int j = 0; j < row.length; j++) {
                values.get(i).add(row[j]);
            }
        }
    }

    public void set(int r, int c, T val) {
        values.get(r).set(c, val);
    }

    public T get(int r, int c) {
        return values.get(r).get(c);
    }

    public void print() {
        for (ArrayList<T> row : values) {
            for (T col : row) {
                System.out.print(col + " ");
            }
            System.out.print("\n");
        }
    }

    public Matrix<Double> add(Matrix<T> m) {
        if (m.h != this.h || m.w != this.w) {
            return null;
        }

        Matrix<Double> result = new Matrix<>(h, w, 0.0);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                double sum = this.get(i, j).doubleValue() + m.get(i, j).doubleValue();
                result.set(i, j, sum);
            }
        }

        return result;
    }

    public Matrix<Double> sub(Matrix<T> m) {
        if (m.h != this.h || m.w != this.w) {
            return null;
        }

        Matrix<Double> result = new Matrix<>(h, w, 0.0);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                double sum = this.get(i, j).doubleValue() - m.get(i, j).doubleValue();
                result.set(i, j, sum);
            }
        }

        return result;
    }

    public Matrix<Double> mul(Matrix<T> m) {
        int rows1 = h;
        int cols1 = w;
        int cols2 = m.w;

        Matrix<Double> result = new Matrix<>(rows1, cols2, 0.0);

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result.set(i, j, result.get(i, j) + this.get(i, k).doubleValue() * m.get(k, j).doubleValue());
                }
            }
        }

        return result;
    }

    public Matrix<T> tran() {
        int rows = this.h;
        int cols = this.w;

        Matrix<T> result = new Matrix<T>(rows, cols, null);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.set(j, i, this.get(i, j));
            }
        }

        return result;
    }
}