package br.com.project.notes;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainReflection {
    public static void main(String[] args) {

        try {
            String classe = "ClasseAnnotation";
            Class<?> ClasseComAnotacao = Class.forName("br.com.project.notes.ClasseComAnotacao"); // carrega
            // classe
            Object obj = ClasseComAnotacao.newInstance();
            Field listaCampo[] = ClasseComAnotacao.getDeclaredFields(); // array que pega os
            // campos

            for (Field fld : listaCampo) {
                Annotation[] annotations = fld.getAnnotations();

                for (Annotation a : annotations) {

                    System.out.println("Annotation utilizada: " + a);

                    for (Method m : a.annotationType().getDeclaredMethods()) {
                        System.out.println();

                    }


                }

            }

        } catch (Throwable e) {

            System.err.println(e);

        }



    }
}
