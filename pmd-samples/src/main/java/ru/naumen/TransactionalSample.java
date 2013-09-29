package ru.naumen;

import org.springframework.stereotype.Component;


/**
 * @author astarovoyt
 *
 */
@Component
public class TransactionalSample
{
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

    @org.springframework.transaction.annotation.Transactional
    protected void doInTransaction()
    {
        new Exception().printStackTrace();
    }
}
