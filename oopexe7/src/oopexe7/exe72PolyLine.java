package oopexe7;

import java.util.ArrayList;

public class exe72PolyLine {
	private ArrayList<exe72Point> points;

    // Default constructor
    public exe72PolyLine() {
        points = new ArrayList<>();
    }

    // Constructor with initial points
    public exe72PolyLine(exe72Point[] points) {
        this.points = new ArrayList<>();
        for (exe72Point p : points) {
            this.points.add(p);
        }
    }

    // Append a point to the end
    public void appendPoint(int x, int y) {
        points.add(new exe72Point(x, y));
    }

    // Append a point object to the end
    public void appendPoint(exe72Point point) {
        points.add(point);
    }

    // Override toString() to return polyline representation
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < points.size(); i++) {
            sb.append(points.get(i).toString());
            if (i < points.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    // Calculate total length of the polyline
    public double getLength() {
        double length = 0.0;
        for (int i = 1; i < points.size(); i++) {
            int dx = points.get(i).getX() - points.get(i - 1).getX();
            int dy = points.get(i).getY() - points.get(i - 1).getY();
            length += Math.sqrt(dx * dx + dy * dy);
        }
        return length;
    }
    public static void main(String[] args) {
        exe72PolyLine polyline = new exe72PolyLine();
        polyline.appendPoint(1, 1);
        polyline.appendPoint(2, 3);
        polyline.appendPoint(4, 5);
        System.out.println(polyline.toString());  // {(1,1),(2,3),(4,5)}

        exe72Point p1 = new exe72Point(6, 7);
        polyline.appendPoint(p1);
        System.out.println(polyline.toString());  // {(1,1),(2,3),(4,5),(6,7)}

        System.out.println("Length: " + polyline.getLength());
    }
}
