package by.it.pozdeev.jd01_05;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        double a=756.13;
        double x=0.3;
        double z=cos(pow(x*x+PI/6,5));
        z=z-sqrt(x*pow(a,3));
        z=z-log(abs((a-1.12*x)/4));
        System.out.println("Result z="+z);
    }
}
