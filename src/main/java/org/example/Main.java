package org.example;


<<<<<<< HEAD
import com.google.gson.Gson;
=======
import com.github.lalyos.jfiglet.FigletFont;
>>>>>>> jfiglet

public class Main {
    public static void main (String[] args){

        Estudiante est = new Estudiante();
        est.setNombre("Aitana");
        est.setEdad(18);
        System.out.println(est);
<<<<<<< HEAD
        String json = new Gson().toJson(est);
=======
        String estudianteAscii = FigletFont.convertOneLine(est.toString());
System.out.println(estudianteAscii);
>>>>>>> jfiglet
    }
}
