package org.example;


import com.github.lalyos.jfiglet.FigletFont;

public class Main {
    public static void main (String[] args){

        Estudiante est = new Estudiante();
        est.setNombre("aitana");
        est.setEdad(18);
        System.out.println(est);
        String estudianteAscii = FigletFont.convertOneLine(est.toString());
System.out.println(estudianteAscii);
    }
}
