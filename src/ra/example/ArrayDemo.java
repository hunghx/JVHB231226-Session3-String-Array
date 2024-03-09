package ra.example;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // Mảng 1 chiều
        // khới tạo
        // cách 1
        String[] arrayString = new String[10];
        int[] arrInt = new int[20];
        System.out.println(Arrays.toString(arrInt));

        //  cach 2
//        int[] numbers = new int[]{1,2,3,4,5};
        int[] numbers = {1,2,3,4,5}; // vết rút gọn
        System.out.println(Arrays.toString(numbers));

        // giá trị (element) , chỉ mục (index)
        // truy xuất phần tử, giá trị
        int element_1 = numbers[1]; // giá trị của phần ử tại vị trí index= 1 trong mảng
        // thay đổi giá trị
        numbers[1] = 100;
        System.out.println("element 1 = "+ numbers[1]);

        // duyệt mảng 1 chiều
        // c1 : for
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            System.out.printf("Giá trị tại index  = %d là %d \n",i,element);
        }

        // cú pháp forEach
        for (int element : numbers){
            System.out.println("Giá trị : "+element);
        }

        // mảng 2 chiều
        // khởi tạo
        int [][] arr2D ={{1,2,3,6},{4,5,6},{7,8,9}}; // 3*3
        int [][] array2D = new int[3][4];


        // truy xuất và thay ổi gi trị
        array2D[1][1] = 1000;
        array2D[1][2] = 10;
        System.out.println(array2D[1][2]);

        for (int i = 0; i < array2D.length; i++) {
            int[] element = array2D[i];
            // duyệt mảng trong
            for (int j = 0; j < element.length; j++) {
                System.out.print(element[j]+" ");
            }
            System.out.println(); // xuống dòng
        }

    }
}
