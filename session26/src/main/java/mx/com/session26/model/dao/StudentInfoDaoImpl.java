package mx.com.session26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.com.session26.model.entity.StudentInfo;

/*
 * Crear clase repositorio o dao, utilizare la anotacion @Repository
 */

 @Repository
public class StudentInfoDaoImpl implements IStudentInfoDao{

    //Entity Manager y contexto de persistencia
    //Guarda internamente todas las entidades y 
    //utiliza como una cache datos de BD
    @Autowired
    
    private EntityManager em; 

    @Override
    public List<StudentInfo> list() {
        return em.createQuery("from StudentInfo").getResultList();
    }

    @Override
    public void save(StudentInfo studentInfo) {
        if (studentInfo.getId() != null && studentInfo.getId()>0){
            //Actualizo studentInfo 
            em.merge(studentInfo);
        }else{
            //Creamos nuevo studentInfo en la base
            em.persist(studentInfo);
        }
    }

    @Override
    public StudentInfo getById(Long id) {
        return em.find(StudentInfo.class, id);
    }

    @Override
    public void delete(Long id) {
        StudentInfo studentInfo = getById(id);
        em.remove(studentInfo);
    }
    
}
