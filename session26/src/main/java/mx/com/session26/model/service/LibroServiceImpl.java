package mx.com.session26.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.session26.model.dao.ILibroDao;
import mx.com.session26.model.entity.Libro;

/*
 * Una clase service, esta basada en el patrón de diseño fachada
 * Es un único punto de acceso hacia los DAOs. Dentro de la clase
 * service, podemos operar con distintas clases DAO
 */
@Service
public class LibroServiceImpl implements ILibroService{

    //Inyectamos la interfaz para utilizar los métodos de CRUD
    // C-Create, R-Read Retrieve, U-Update, D-Delete
    @Autowired
    private ILibroDao dao;

    @Transactional(readOnly = true)
    @Override
    public List<Libro> list() {
        return dao.list();
    }

    @Transactional
    @Override
    public void save(Libro libro) {
        dao.save(libro);
    }   

    @Transactional(readOnly = true)
    @Override
    public Libro getById(Long id) {
        return dao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

}
