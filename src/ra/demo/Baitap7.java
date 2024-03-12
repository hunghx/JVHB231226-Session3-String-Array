package ra.demo;

import java.util.Scanner;

public class Baitap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // khai báo 1 biến để nhận giá tr nhập vào
        System.out.println("Hãy nhập vào số hàng của ma tran");
        int col = Integer.parseInt(sc.nextLine());

        // khởi tao mảng 2 chiêu
        int[][] matrix = new int[col][col];

        // duyet mang 2 chieu để nhập các giá tri cho mảng
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("\nNhập giá trị cho phần tử matrix[%d][%d] = ",i,j);
                matrix[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        int sum = 0;
        // hiên thị ra mang
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // tính tong duong cheo chinh
                if(i==j) sum+=matrix[i][i];
                // in các phan tu của mang con trên 1 hàng
                System.out.printf("%-3d ",matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("Tông các phần tử trên đường chéo chính  = "+sum);

    }
}
