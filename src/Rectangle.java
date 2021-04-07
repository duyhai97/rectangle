public class Rectangle {
    double width ;
    double height;

    public Rectangle(double width, double height){

        this.width = width;
        this.height = height;
    }
    public  double Aria(){
        return this.width*this.height;
    }
    public double Chuvi(){
        return 2*(this.height + this.height);
    }

    public static void main(String[] args) {

    }
}