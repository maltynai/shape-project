public class Triangle extends Shape{
    private double s1,s2,s3;
    double p;
    public Triangle(String name, double s1, double s2, double s3){
        super("Triangle");
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;

    }
    public double getS3() {
        return s3;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getS1() {
        return s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }



    public double getArea(){
        p = (s1+s2+s3)/2;
        return Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));

    }
    public double getPerimeter(){
        return s1+s2+s3;
    }
}
