package ra.example;

import java.util.Scanner;

public class BaitapArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // khai báo mảng 2 chiều
        String[][] students = new String[5][2];
        for (int i = 0; i < students.length; i++) {
            // nhập thông tin cho sinh vieenn thức i
            System.out.println("Hãy nhap thông tin cho sc thứ "+(i+1));
            System.out.println("Nhập mã sv");
            students[i][0] = sc.nextLine();
            System.out.println("Nhap tên sinh viên");
            students[i][1] = sc.nextLine();
        }

        // hiển thị
        for (String[] element : students){
            StringBuilder string = new StringBuilder();
            for (String value : element){
                string.append(value+"   ");
            }
            System.out.println(string);
        }
    }
}
