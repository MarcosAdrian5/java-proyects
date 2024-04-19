package mx.com.session26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.com.session26.model.entity.Teacher;

@Repository
public class TeacherDaoImpl implements ITeacherDao{
     //Entity Manager y contexto de persistencia
    //Guarda internamente todas las entidades y 
    //utiliza como una cache datos de BD
    @Autowired
    
    private EntityManager em; 

    @Override
    public List<Teacher> list() {
        return em.createQuery("from Teacher").getResultList();
    }

    @Override
    public void save(Teacher teacher) {
        if (teacher.getId() != null && teacher.getId()>0){
            //Actualizo teacher 
            em.merge(teacher);
        }else{
            //Creamos nuevo teacher en la base
            em.persist(teacher);
        }
    }

    @Override
    public Teacher getById(Long id) {
        return em.find(Teacher.class, id);
    }

    @Override
    public void delete(Long id) {
        Teacher teacher = getById(id);
        em.remove(teacher);
    }
}
