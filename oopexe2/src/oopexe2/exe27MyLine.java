package oopexe2;

public class exe27MyLine {
	
	    private exe26MyPoint begin;
	    private exe26MyPoint end;

	    // Constructors
	    public exe27MyLine(int x1, int y1, int x2, int y2) {
	        this.begin = new exe26MyPoint(x1, y1);
	        this.end = new exe26MyPoint(x2, y2);
	    }

	    public exe27MyLine(exe26MyPoint begin, exe26MyPoint end) {
	        this.begin = begin;
	        this.end = end;
	    }

	    // Getters and Setters
	    public exe26MyPoint getBegin() {
	        return begin;
	    }

	    public void setBegin(exe26MyPoint begin) {
	        this.begin = begin;
	    }

	    public exe26MyPoint getEnd() {
	        return end;
	    }

	    public void setEnd(exe26MyPoint end) {
	        this.end = end;
	    }

	    public int getBeginX() {
	        return begin.getX();
	    }

	    public void setBeginX(int x) {
	        begin.setX(x);
	    }

	    public int getBeginY() {
	        return begin.getY();
	    }

	    public void setBeginY(int y) {
	        begin.setY(y);
	    }

	    public int getEndX() {
	        return end.getX();
	    }

	    public void setEndX(int x) {
	        end.setX(x);
	    }

	    public int getEndY() {
	        return end.getY();
	    }

	    public void setEndY(int y) {
	        end.setY(y);
	    }

	    public int[] getBeginXY() {
	        return begin.getXY();
	    }

	    public void setBeginXY(int x, int y) {
	        begin.setXY(x, y);
	    }

	    public int[] getEndXY() {
	        return end.getXY();
	    }

	    public void setEndXY(int x, int y) {
	        end.setXY(x, y);
	    }

	    // Calculate length using MyPoint's distance()
	    public double getLength() {
	        return begin.distance(end);
	    }

	    // Calculate gradient using Math.atan2
	    public double getGradient() {
	        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
	    }

	    @Override
	    public String toString() {
	        return "MyLine[begin=" + begin + ", end=" + end + "]";
	    
	}
	    public static void main(String[] args) {
	    	
	    	        // Tạo đối tượng MyLine
	    			exe27MyLine line1 = new exe27MyLine(1, 2, 4, 6);
	    			exe27MyLine line2 = new exe27MyLine(new exe26MyPoint(0, 0), new exe26MyPoint(3, 4));

	    	        // Kiểm tra toString()
	    	        System.out.println("Line 1: " + line1);
	    	        System.out.println("Line 2: " + line2);

	    	        // Kiểm tra getters
	    	        System.out.println("Line 1 begin point: " + line1.getBegin());
	    	        System.out.println("Line 1 end point: " + line1.getEnd());

	    	        // Kiểm tra setters
	    	        line1.setBeginXY(2, 3);
	    	        line1.setEndXY(5, 7);
	    	        System.out.println("Line 1 after modifying points: " + line1);

	    	        // Kiểm tra độ dài
	    	        System.out.println("Line 1 length: " + line1.getLength());
	    	        System.out.println("Line 2 length: " + line2.getLength());

	    	        // Kiểm tra độ dốc (gradient)
	    	        System.out.println("Line 1 gradient: " + line1.getGradient());
	    	        System.out.println("Line 2 gradient: " + line2.getGradient());
	    	    
	    	

		}

}
