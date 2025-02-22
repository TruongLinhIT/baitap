package oopexe3;

public class exe37Ball {
	    private float x, y, z; // Tọa độ 3D của quả bóng

	    public exe37Ball(float x, float y, float z) {
	        this.x = x;
	        this.y = y;
	        this.z = z;
	    }

	    // Getter methods
	    public float getX() { return x; }
	    public float getY() { return y; }
	    public float getZ() { return z; }

	    // Setter method
	    public void setXYZ(float x, float y, float z) {
	        this.x = x;
	        this.y = y;
	        this.z = z;
	    }

	    @Override
	    public String toString() {
	        return "(" + x + ", " + y + ", " + z + ")";
	    }
	

}
