package mx.com.session26.model.service;

import java.util.List;

import mx.com.session26.model.entity.Libro;

public interface ILibroService {
    List<Libro>list();
    void save(Libro libro);
    Libro getById(Long id);
    void delete(Long id);    
}
