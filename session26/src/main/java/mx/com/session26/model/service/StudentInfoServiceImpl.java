package mx.com.session26.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.com.session26.model.dao.IStudentInfoDao;
import mx.com.session26.model.entity.StudentInfo;

/*
 * Una clase service, esta basada en el patrón de diseño fachada
 * Es un único punto de acceso hacia los DAOs. Dentro de la clase
 * service, podemos operar con distintas clases DAO
 */
@Service
public class StudentInfoServiceImpl implements IStudenInfoService{

    //Inyectamos la interfaz para utilizar los métodos de CRUD
    // C-Create, R-Read Retrieve, U-Update, D-Delete
    @Autowired
    private IStudentInfoDao dao;

    @Transactional(readOnly = true)
    @Override
    public List<StudentInfo> list() {
        return dao.list();
    }

    @Transactional
    @Override
    public void save(StudentInfo studentInfo) {
        dao.save(studentInfo);
    }   

    @Transactional(readOnly = true)
    @Override
    public StudentInfo getById(Long id) {
        return dao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

}
