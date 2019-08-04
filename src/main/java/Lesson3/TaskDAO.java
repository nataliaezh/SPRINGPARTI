package Lesson3;


import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class TaskDAO extends AbstractDAO {

    public Task findOne(String id) {
        return entityManager.find(Task.class, id);
    }

    public List<Project> findAll() {
        return entityManager.createQuery("SELECT e FROM Task e", Project.class).getResultList();
    }

    public Task getById(final String id) {
        if (id == null || id.isEmpty()) return null;
        return getEntity(entityManager.createQuery("SELECT e FROM Task e WHERE e.id=:id", Task.class)
                .setParameter("id", id)
        );
    }
}