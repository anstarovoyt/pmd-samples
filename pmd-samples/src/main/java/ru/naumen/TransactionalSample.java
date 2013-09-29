package ru.naumen;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author astarovoyt
 *
 */
@Component
public class TransactionalSample
{
    @Transactional
    public void doInTransaction()
    {
        new Exception().printStackTrace();
    }

    /**
     * PMD should find error
     */
    public void foo()
    {
        for (int i = 0; i < 10; i++)
        {
            for (int k = 0; k < 20; i++)
            {
            }
        }
    }
}
