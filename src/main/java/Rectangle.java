
public class Rectangle {

    int height;
    int width;
    int area;
    boolean isRectangle;

    //Property constructor must be public
    public Rectangle(int height, int width) {
        // Property assignment
        this.height = height;
        this.width = width;
    }

    int getArea() {
        return this.area = this.height * this.width;
    }

    boolean verifyIfRectangle(){
        isRectangle =this.height == this.width;
        return isRectangle;
    }
}
