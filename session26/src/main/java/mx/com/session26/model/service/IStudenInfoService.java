package mx.com.session26.model.service;



import java.util.List;

import mx.com.session26.model.entity.StudentInfo;

public interface IStudenInfoService {
    List<StudentInfo>list();
    void save(StudentInfo studentInfo);
    StudentInfo getById(Long id);
    void delete(Long id);    
}
