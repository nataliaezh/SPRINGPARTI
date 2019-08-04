package Lesson3;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class AbstractDAO {
    @PersistenceContext
    protected EntityManager entityManager;

    public <T> T getEntity(TypedQuery<T> query){
        final List<T> resultList = query.getResultList();
        if(resultList.isEmpty()){
            return null;
        }
        return resultList.get(0);
    }
}
