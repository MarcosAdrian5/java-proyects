package mx.com.session26.model.dao;

import java.util.List;
import mx.com.session26.model.entity.StudentInfo;

public interface IStudentInfoDao {
    List<StudentInfo>list();
    void save(StudentInfo studentInfo);
    StudentInfo getById(Long id);
    void delete(Long id);
    
}
