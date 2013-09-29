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
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        TransactionalSample sample = context.getBean(TransactionalSample.class);
        sample.doInTransaction();
    }
}
