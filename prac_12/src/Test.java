import java.util.*;

/**
 * Test
 */
public class Test {
    public static <T> void insertionSort(Comparable<T>[] A, int n) {
        for (int i = 1; i < n; i++) {
            Comparable<T> key = A[i];
            int j = i - 1;
            while (j > -1 && A[j].compareTo((T)key) > 0) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }

    private static <T> int partition(T[] A, int l, int r, Comparator<T> comparator) {
        T pivot = A[(int)((l + r) / 2)];
        int i = l;
        int j = r;
        while (true) {
            while (comparator.compare(A[i], pivot) < 0) {
                i++;
            }
            while (comparator.compare(A[j], pivot) > 0) {
                j--;
            }
            if (i >= j) {
                return j;
            }
            T temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }

    public static <T> void quickSort(T[] A, int l, int r, Comparator<T> comparator) {
        if (l < r) {
            int p = partition(A, l, r, comparator);
            quickSort(A, l, p, comparator);
            quickSort(A, p + 1, r, comparator);
        }
    }

    public static <T> void merge(Comparable<T>[] A, int l, int r, int m) {
        int n1 = m - l;
        ArrayList<Comparable<T>> a1 = new ArrayList<Comparable<T>>();
        for (int i = 0; i < n1; i++) {
            a1.add(A[l + i]);
        }

        int n2 = r - m;
        ArrayList<Comparable<T>> a2 = new ArrayList<Comparable<T>>();
        for (int i = 0; i < n2; i++) {
            a2.add(A[m + i]);
        }

        int p1 = 0;
        int p2 = 0;
        int k = l;
        while (p1 < n1 && p2 < n2) {
            if (a1.get(p1).compareTo((T)(a2.get(p2))) < 0) {
                A[k] = a1.get(p1);
                p1++;
            } else {
                A[k] = a2.get(p2);
                p2++;
            }
            k++;
        }

        while (p1 < n1) {
            A[k] = a1.get(p1);
            p1++;
            k++;
        }
        
        while (p2 < n2) {
            A[k] = a2.get(p2);
            p2++;
            k++;
        }
    }

    public static <T> void mergeSort(Comparable<T>[] A, int l, int r) {
        if (2 <= r - l) {
            int m = (l + r) / 2;

            mergeSort(A, l, m);
            mergeSort(A, m, r);
            merge(A, l, r, m);
        }
    }

    public static void main(String[] args) {
        final int size = 10;
        Student[] students = new Student[size];
        for (int i = 0; i < size; i++) {
            students[i] = new Student(size - i, i);
        }

        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
        System.out.println("---------------------------------------");

        // insertionSort(students, size);
        quickSort(students, 0, size - 1, comparator);
        // mergeSort(students, 0, size * 2);

        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
        System.out.print('\n');
    }
}