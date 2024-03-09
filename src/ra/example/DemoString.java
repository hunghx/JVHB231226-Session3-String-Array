package ra.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoString {
    public static void main(String[] args) {
        // kiểu dữ liệu chuỗi
        // Lớp String
        // khới tạo string literal
        String string1 = "Nguyễn Văn A";
        // khởi tạo bằng phương thuc khơi tạo
        String name = new String("Nguyễn Văn B");

//        String str1 ="Rikkei";
//        String str3 ="RikkEi";
//        String str6 ="Rikkei";
//        String str2 ="Academy";
//        String str4 = new String("Rikkei academy");
//        String str5 = new String("Rikkei academy");
//        System.out.println("str1 : "+System.identityHashCode(str1));
//        System.out.println("str2 : "+System.identityHashCode(str2));
//        System.out.println("str3 : "+System.identityHashCode(str3));
//        System.out.println("str4 : "+System.identityHashCode(str4));
//        System.out.println("str5 : "+System.identityHashCode(str5));
//        System.out.println("str6 : "+System.identityHashCode(str6));
//
//        // các phương thưc lam viec vơi chuoi
//        System.out.println(str4.equals(str5));// true
//        System.out.println(str4==str5);// false
//        System.out.println(str1.equalsIgnoreCase(str3));
//
//        // hiê 2 chuỗi
//        System.out.println("Rikkei".compareTo("Academy")); // 82-65 = 17

        String s1 = "Welcome to JAVA";
        String s2 = "Programming is fun";
        String s3 = new String("Welcome to JAVA");
        System.out.println(s1 == s2); //false
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals(s3));// true
        System.out.println(s1.compareTo(s2));  // 7
        System.out.println(s1.compareTo(s3));  // 0
        System.out.println(s1.charAt(1));  // e
        System.out.println(s1.indexOf('j'));  // -1
        System.out.println(s2.indexOf('f') ); //  15
        System.out.println(s1.lastIndexOf('o')); // 9

        // cắt bỏ khoảng trắng hai đâu
        System.out.println("     \t \n       hùng hx \n          ".replaceAll("\\s+","")); // hùng hx
        // StringBuilder và StringBuffer
        StringBuilder stringBuilder = new StringBuilder("Rikkei"); // tham số là 1 String
        StringBuffer stringBuffer = new StringBuffer("Rikkei"); // tham số là 1 String

        // nối chuỗi
        stringBuilder.append(" academy");
        System.out.println(stringBuilder);
        // chèn tại vị trí bất kì
        stringBuilder.insert(6,1000);
        System.out.println(stringBuilder);
        // xóa chuỗi
        stringBuilder.delete(4,15);
        System.out.println(stringBuilder);

        // đao ngườc
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        // so khớp dữ lieu thông qua lớp Pattern , Matcher
        // ví dụ so khop email : co ki tu @
        Scanner sc= new Scanner(System.in);
        System.out.println("Hãy nhạp email cua ban");
        String email = sc.nextLine();
        String regex = "^.+@.+$";
        Pattern pattern = Pattern.compile(regex); // tạo ra mẫu so khớp
        Matcher matcher = pattern.matcher(email);  // so khop với input truền vào
        boolean check  = matcher.matches();
        System.out.println(check);

//        boolean check1 = Pattern.matches(regex,email);
////        boolean check = Pattern.compile(regex).matcher(email).matches();
//        boolean check2 = email.matches(regex);

        // nhập số điên thoại định dạng Việt Nam
        // nhập sai thi hiển thị lỗi đỏ và yêu cầu nhập lai
        // nhập đúng thì hiển thị kết quả ra màn hình và ket thuc chương trinh
        final String PHONE_REGEX = "^((^(\\+84|84|0|0084){1})(3|5|7|8|9))+([0-9]{8})$";
        while (true){
            System.out.println("Hãy nhạp sdt cua ban");
            String phone = sc.nextLine();
            if (phone.matches(PHONE_REGEX)){
                System.out.println("phone : "+phone);
                break;
            }
            System.err.println("Bạn nhap chưa dung sdt viet nam");
        }

    }


}
