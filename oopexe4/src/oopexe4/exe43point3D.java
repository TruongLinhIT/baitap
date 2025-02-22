package oopexe4;

public class exe43point3D extends exe43Point2D {
	private float z = 0.0f;

    public exe43point3D() {}

    public exe43point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() { return z; }
    public void setZ(float z) { this.z = z; }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
    public static void main(String[] args) {
        // Kiểm thử Point2D
        exe43Point2D p2d = new exe43Point2D(3.5f, 5.5f);
        System.out.println("Point2D: " + p2d);
        p2d.setXY(1.0f, 2.0f);
        System.out.println("Updated Point2D: " + p2d);

        // Kiểm thử Point3D
        exe43point3D p3d = new exe43point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D: " + p3d);
        p3d.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println("Updated Point3D: " + p3d);
    }
}
