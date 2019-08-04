package Lesson3;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class ProjectDAO extends AbstractDAO {
    public void persist(final Project project) {
        entityManager.persist(project);
    }

    public Project findOne(String id) {
        return entityManager.find(Project.class, id);

    }

    public Project getById(final String id) {
        if (id == null || id.isEmpty()) return null;
        return getEntity(entityManager.createQuery("SELECT e FROM Task e WHERE e.id=:id", Project.class)
                .setParameter("id", id)
                .setMaxResults(1)
        );
    }


    public List<Project> findAll() {
        return entityManager.createQuery("SELECT e FROM Project e", Project.class).getResultList();
    }

    public Project removeById(final String id) {
        final Project project = findOne(id);
        entityManager.remove(project);
        return project;
    }

    public void removeAll() {
        entityManager.createQuery("DELETE FROM Project e").executeUpdate();
    }
}