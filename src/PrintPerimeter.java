public class PrintPerimeter {
    public static void main (String[] args){
        double area = Double.parseDouble(args[0]);
        double square_root = java.lang.Math.sqrt(area);
        double perimeter = square_root * 400;
        perimeter = Math.round(perimeter);
        perimeter = perimeter/100;
        System.out.println(perimeter);
    }
}
