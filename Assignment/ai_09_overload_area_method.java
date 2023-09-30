class Area{
    public static double area(double r){
        return r*r*3.14;
    }
    public static int area(int side){
        return side*side;
    }
    public static int area(int len,int width){
        return len*width;
    }
    public static double area(double base,double perpendicularHight){
        return (0.5*base*perpendicularHight);
    }
}
public class ai_09_overload_area_method {
    public static void main(String[] args) {
        Area a=new Area();
        System.out.println("Area of circle : "+a.area(4d));
        System.out.println("Area of square : "+a.area(5));
        System.out.println("Area of rectangle : "+a.area(4,6));
        System.out.println("Area of triangle : "+a.area(5d,4.2d));


        System.out.println("Area of circle : "+area(4d));
        System.out.println("Area of square : "+area(5));
        System.out.println("Area of rectangle : "+area(4,6));
        System.out.println("Area of triangle : "+area(5d,4.2d));
    }
    public static double area(double r){
    return r*r*3.14;
    }
    public static int area(int side){
        return side*side;
    }
    public static int area(int len,int width){
        return len*width;
    }
    public static double area(double base,double perpendicularHight){
        return (0.5*base*perpendicularHight);
    }
}
