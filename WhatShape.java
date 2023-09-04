package ShapeAndSo;

import java.util.Arrays;

public class WhatShape {
    public static void whatShape(Shape sh){
        System.out.println("Sape name: " +sh.name());
        System.out.println("Parameters: " + Arrays.toString(sh.getParam()));
        System.out.println("Square: " + sh.area() + ", perimeter: " + sh.perimeter());
        System.out.println("-------------");
    }
}
