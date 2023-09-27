package br.com.project.notes;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.METHOD})
public @interface IPrimeiraAnotacao {

    String value();
    String[] produto();
    int id();
    int valores() default 10;
}
