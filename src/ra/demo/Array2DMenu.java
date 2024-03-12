package ra.demo;

import java.util.Scanner;

public class Array2DMenu {
    public static void main(String[] args) {
        int[][] array = new int[0][0];
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("***************************MENU****************************** \n" +
                    "1. Nhập giá trị các phần tử của mảng \n" +
                    "2. In giá trị các phần tử mảng theo ma trận \n" +
                    "3. Tính tổng các phần tử trên đường biên \n" +
                    "4. In giá trị phần tử có chỉ số dòng bằng chỉ số cột \n" +
                    "5. Thoát\n");
            // yêu câu người cung chon chuc năng
            System.out.println("Nhạp chuc năng");
            byte choice = Byte.parseByte(sc.nextLine());
            // điều hướng theo lựa chọn
            switch (choice){
                case 1:
                    // nhap gia tri cac phan tu mang
                    System.out.println("Nhap kich thươc mang n x m");
                    System.out.println("n = ");
                    int n = Integer.parseInt(sc.nextLine());
                    System.out.println("m = ");
                    int m = Integer.parseInt(sc.nextLine());
                    array = new int[n][m];
                    // nhap gia tri cho cac phan tu
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            System.out.printf("\nNhập giá trị cho phần tử array[%d][%d] = ",i,j);
                            array[i][j] = Integer.parseInt(sc.nextLine());
                        }
                    }
                    break;
                case 2:
                    // hiển thị mảng
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            // in các phan tu của mang con trên 1 hàng
                            System.out.printf("%-3d ",array[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    // tínhtoognr cac gia trị trên biên
                     int sum = 0;
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            // tính tong của cac ptu thoa man dk : i =0,j=0,i=n-1,j=m-1
                            if (i==0 || j==0 || i== array.length-1 || j == array[i].length-1){
                                sum+= array[i][j];
                            }
                        }
                    }
                    System.out.println("Tong cac ptu tren bien là : "+sum);
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Thoát");
                    return;
                default:
                    System.err.println("Lua chon  khong hop le");
            }
        }
    }
}
