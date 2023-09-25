package BT2;

public class StaticMethod {
    public static void CalCircleArea(double r) {
        System.out.println("Diện tích hình tròn là : " + (Math.PI * Math.pow(r, 2)));
    }
    public static void CalRectangleArea(double width, double height) {
        System.out.println("Diện tích hình chữ nhật : " + (width * height));
    }
    public static void CalTriangleArea(double a, double b, double c){
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Diện tích hình tam giác : " + area);
    }
    public void G(){
    }
}
