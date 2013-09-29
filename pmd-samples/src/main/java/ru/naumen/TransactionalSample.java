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
}
