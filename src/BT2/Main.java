package BT2;

public class Main {
    public static void main(String[] args) {
        StaticMethod.CalCircleArea(3.5);
//        Hình tròn có bán kính lần lượt là 3.5 và 6.
//
//Hình tam giác có các cạnh là (3, 4, 5), (4.5, 7, 6).
        StaticMethod.CalTriangleArea(3, 4, 5);
//
//Hình chữ nhật có kích thước (2.5, 6) và (4, 7)
        StaticMethod.CalRectangleArea(2.5, 6);
    }
    public void h(){
        StaticMethod.CalRectangleArea(3,5);
    }
}
