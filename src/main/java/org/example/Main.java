package org.example;


import com.google.gson.Gson;

public class Main {
    public static void main (String[] args){

        Estudiante est = new Estudiante();
        est.setNombre("Aitana");
        est.setEdad(18);
        System.out.println(est);
        String json = new Gson().toJson(est);
    }
}
