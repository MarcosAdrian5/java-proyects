package mx.com.session26.model.dao;

import java.util.List;


import mx.com.session26.model.entity.Teacher;

public interface ITeacherDao {
    List<Teacher>list();
    void save(Teacher teacher);
    Teacher getById(Long id);
    void delete(Long id);
}
