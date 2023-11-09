package spring5.ch04_pjt_01.ems.member.service;

import spring5.ch04_pjt_01.ems.member.Student;
import spring5.ch04_pjt_01.ems.member.dao.StudentDao;

import java.util.Map;

public class StudentAllSelectService {
    private StudentDao studentDao;

    public StudentAllSelectService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Map<String, Student> allSelect() {
        return studentDao.getStudentDB();
    }
}
