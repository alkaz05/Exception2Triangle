public class Triangle {
    double a, b, c;

    public Triangle(double a, double b, double c) throws UnnaturalLengthEx, ImpossibleTriangleEx {
        if(a<=0 )
            throw new UnnaturalLengthEx("не положительная длина стороны a", a);
        if(b<=0 )
            throw new UnnaturalLengthEx("не положительная длина стороны b", b);
        if(c<=0 )
            throw new UnnaturalLengthEx("не положительная длина стороны c", c);
        if(a >=b+c || b >= a+c || c>= a+b)
            throw  new ImpossibleTriangleEx("невозможно построить");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getPerimeter(){
        return a+b+c;
    }
}
