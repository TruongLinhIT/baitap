package oopexe3;

public class exe32Polynomial {
	private double[] coeffs;

    // Constructor sử dụng varargs
    public exe32Polynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    // Trả về bậc của đa thức
    public int getDegree() {
        return coeffs.length - 1;
    }

    // Chuyển đa thức thành chuỗi có định dạng dễ đọc
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int degree = getDegree();
        for (int i = degree; i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (sb.length() > 0) {
                    sb.append(" + ");
                }
                sb.append(coeffs[i]);
                if (i > 0) {
                    sb.append("x");
                    if (i > 1) {
                        sb.append("^").append(i);
                    }
                }
            }
        }
        return sb.toString();
    }

    // Tính giá trị của đa thức tại một điểm x
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    // Cộng hai đa thức
    public exe32Polynomial add(exe32Polynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            double a = (i <= this.getDegree()) ? this.coeffs[i] : 0;
            double b = (i <= right.getDegree()) ? right.coeffs[i] : 0;
            newCoeffs[i] = a + b;
        }
        return new exe32Polynomial(newCoeffs);
    }

    // Nhân hai đa thức
    public exe32Polynomial multiply(exe32Polynomial right) {
        int newDegree = this.getDegree() + right.getDegree();
        double[] newCoeffs = new double[newDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                newCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new exe32Polynomial(newCoeffs);
    }
    public static void main(String[] args) {
    	// Test program
    	// Can invoke with a variable number of arguments
    	exe32Polynomial p1 = new exe32Polynomial(1.1, 2.2, 3.3);
    	exe32Polynomial p2 = new exe32Polynomial(1.1, 2.2, 3.3, 4.4, 5.5);
    	// Can also invoke with an array
    	double[] coeffs = {1.2, 3.4, 5.6, 7.8};
    	exe32Polynomial p3 = new exe32Polynomial(coeffs);
	}
}
