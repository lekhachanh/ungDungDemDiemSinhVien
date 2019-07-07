import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int arr[];
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("vuot qua size cua mang!");
            }
        } while (size > 30);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap vao diem sinh vien thu " + (i + 1));
            arr[i] = sc.nextInt();
        }
        int count = 0;
        System.out.println("Danh sach diem sinh vien: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] >= 5 && arr[i] <= 10)
                count++;
        }
        System.out.println("so sinh vien vuot qua ky thi la " + count);
    }
}
