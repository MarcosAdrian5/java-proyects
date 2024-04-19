package mx.com.session26.model.service;



import java.util.List;

import mx.com.session26.model.entity.Teacher;

public interface ITeacherService {
    List<Teacher>list();
    void save(Teacher teacher);
    Teacher getById(Long id);
    void delete(Long id);    
}
