package ru.naumen;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author astarovoyt
 *
 */
@Component
@Deprecated
public class TransactionalSample
{
    /**
     * PMD should find error
     */
    @PreDestroy
    public void foo()
    {
        for (int i = 0; i < 10; i++)
        {
            for (int k = 0; k < 20; i++)
            {
            }
        }
    }

    @Transactional
    protected void doInMarkerTransaction()
    {
    }

    @Transactional(readOnly = true)
    protected void doInNormalTransaction()
    {
    }

    @Transactional(readOnly = true, propagation = Propagation.MANDATORY)
    protected void doInNormalTransactionWithTwoParams()
    {
    }
}
