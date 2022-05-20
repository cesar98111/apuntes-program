package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> mi_lista = new ArrayList<String>();
        mi_lista.add("Hola");
        mi_lista.add( "como");
        mi_lista.add("estas");

        for (int i = 0; i < mi_lista.size(); i++) {
            System.out.print(""+mi_lista.get(i)+" ");
        }

        ArrayList<String> mi_lista2 = new ArrayList<String>();
        mi_lista2.add(0,"Hola");
        mi_lista2.add( 0,"como");
        mi_lista2.add(0,"estas");
        for (String cadena:mi_lista2) {
            System.out.print(cadena+" ");
        }
        ArrayList<Persona> listaPersona = new ArrayList<Persona>();

        listaPersona.add(new Persona("Jhon","Doe",49));
        listaPersona.add(new Persona("alex","garcia",20));
        listaPersona.add(new Persona("pedro","cabrera",19));
        listaPersona.add(1,new Persona("Jhon","Doe",49));

        Iterator<Persona> it = listaPersona.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
