package oopexe2;

public class exe29MyTriangle {
	private exe26MyPoint v1, v2, v3;

    // Constructor với tọa độ
    public exe29MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new exe26MyPoint(x1, y1);
        this.v2 = new exe26MyPoint(x2, y2);
        this.v3 = new exe26MyPoint(x3, y3);
    }

    // Constructor với MyPoint
    public exe29MyTriangle(exe26MyPoint v1, exe26MyPoint v2, exe26MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    // Tính chu vi tam giác
    public double getPerimeter() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
        return side1 + side2 + side3;
    }

    // Xác định loại tam giác
    public String getType() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);

        if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    // Phương thức toString()
    @Override
    public String toString() {
        return "MyTriangle[v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
    }
    public static void main(String[] args) {
    	
            // Tạo các đối tượng MyTriangle
    		exe29MyTriangle t1 = new exe29MyTriangle(0, 0, 3, 0, 3, 4);
    		exe29MyTriangle t2 = new exe29MyTriangle(new exe26MyPoint(0, 0), new exe26MyPoint(2, 2), new exe26MyPoint(4, 0));
    		exe29MyTriangle t3 = new exe29MyTriangle(new exe26MyPoint(1, 1), new exe26MyPoint(3, 1), new exe26MyPoint(2, 3));

            // Kiểm tra toString()
            System.out.println("Triangle 1: " + t1);
            System.out.println("Triangle 2: " + t2);
            System.out.println("Triangle 3: " + t3);

            // Kiểm tra chu vi
            System.out.println("Perimeter of Triangle 1: " + t1.getPerimeter());
            System.out.println("Perimeter of Triangle 2: " + t2.getPerimeter());
            System.out.println("Perimeter of Triangle 3: " + t3.getPerimeter());

            // Kiểm tra loại tam giác
            System.out.println("Triangle 1 is: " + t1.getType());
            System.out.println("Triangle 2 is: " + t2.getType());
            System.out.println("Triangle 3 is: " + t3.getType());
        }
	
}
