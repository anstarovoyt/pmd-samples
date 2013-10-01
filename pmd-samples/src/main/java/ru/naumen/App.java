package ru.naumen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author astarovoyt
 *
 */
@Configuration
@ComponentScan
public class App
{
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        new AnnotationConfigApplicationContext(App.class);
    }
}
