package Lesson3;

import java.util.List;

public class UserDAO extends AbstractDAO {
    public void persist(User user){
        entityManager.persist(user);//insert
    }

    public void merge(User user) {
        entityManager.merge(user);//select/insert
    }
    public User find(String id){
        return entityManager.find(User.class,id);
    }

    public void remove(String id){
        entityManager.remove(find(id));
    }
    public List<User> findAll(){
        return entityManager.createQuery("SELECT e FROM User e", User.class)
                .getResultList();
    }

    public void removeAll(){
        entityManager.createQuery("DELETE FROM User e").executeUpdate();
    }
}
