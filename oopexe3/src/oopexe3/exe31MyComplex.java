package oopexe3;

public class exe31MyComplex {
	private double real;
    private double imag;

    // Constructor mặc định
    public exe31MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    // Constructor với tham số
    public exe31MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Getter và Setter
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Kiểm tra số phức có phải số thực không
    public boolean isReal() {
        return imag == 0;
    }

    // Kiểm tra số phức có phần ảo không
    public boolean isImaginary() {
        return imag != 0;
    }

    // So sánh 2 số phức
    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(exe31MyComplex another) {
        return this.real == another.real && this.imag == another.imag;
    }

    // Độ lớn của số phức
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    // Pha (góc) của số phức
    public double argument() {
        return Math.atan2(imag, real);
    }

    // Phép cộng số phức (trả về đối tượng mới)
    public exe31MyComplex addNew(exe31MyComplex right) {
        return new exe31MyComplex(this.real + right.real, this.imag + right.imag);
    }

    // Phép trừ số phức (trả về đối tượng mới)
    public exe31MyComplex subtractNew(exe31MyComplex right) {
        return new exe31MyComplex(this.real - right.real, this.imag - right.imag);
    }

    // Phép nhân số phức
    public exe31MyComplex multiply(exe31MyComplex right) {
        double newReal = this.real * right.real - this.imag * right.imag;
        double newImag = this.real * right.imag + this.imag * right.real;
        return new exe31MyComplex(newReal, newImag);
    }

    // Phép chia số phức
    public exe31MyComplex divide(exe31MyComplex right) {
        double denominator = right.real * right.real + right.imag * right.imag;
        double newReal = (this.real * right.real + this.imag * right.imag) / denominator;
        double newImag = (this.imag * right.real - this.real * right.imag) / denominator;
        return new exe31MyComplex(newReal, newImag);
    }

    // Chuyển số phức sang chuỗi
    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }
    public static void main(String[] args) {
    	exe31MyComplex c1 = new exe31MyComplex(3, 4);
    	exe31MyComplex c2 = new exe31MyComplex(1, -2);
        
        // Hiển thị số phức
        System.out.println("Complex number 1: " + c1);
        System.out.println("Complex number 2: " + c2);
        
        // Kiểm tra số thực và số ảo
        System.out.println("Is c1 real? " + c1.isReal());
        System.out.println("Is c1 imaginary? " + c1.isImaginary());

        // Kiểm tra độ lớn và pha
        System.out.println("Magnitude of c1: " + c1.magnitude());
        System.out.println("Argument of c1: " + c1.argument());

        // Kiểm tra phép cộng và trừ
        System.out.println("c1 + c2 = " + c1.addNew(c2));
        System.out.println("c1 - c2 = " + c1.subtractNew(c2));

        // Kiểm tra phép nhân và chia
        System.out.println("c1 * c2 = " + c1.multiply(c2));
        System.out.println("c1 / c2 = " + c1.divide(c2));
    
	}
}
