package mx.com.session26.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.com.session26.model.entity.Libro;

/*
 * Crear clase repositorio o dao, utilizare la anotacion @Repository
 */

 @Repository
public class LibroDaoImpl implements ILibroDao {

    //Entity Manager y contexto de persistencia
    //Guarda internamente todas las entidades y 
    //utiliza como una cache datos de BD
    @Autowired
    
    private EntityManager em; 

    @Override
    public List<Libro> list() {
        return em.createQuery("from Libro").getResultList();
    }

    @Override
    public void save(Libro libro) {
        if (libro.getId() != null && libro.getId()>0){
            //Actualizo libro
            em.merge(libro);
        }else{
            //Creamos nuevo libro en la base
            em.persist(libro);
        }
    }

    @Override
    public Libro getById(Long id) {
        return em.find(Libro.class, id);
    }

    @Override
    public void delete(Long id) {
        Libro libro = getById(id);
        em.remove(libro);
    }
    
}
