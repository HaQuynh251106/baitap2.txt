package factory;

import dao.ResultDAO;
import dao.ResultDAOImpl;

public class DAOFactory {

    public static ResultDAO getResultDAO() {
        return new ResultDAOImpl();
    }

    // Nếu sau này có nhiều DAO khác, bạn có thể mở rộng thêm ở đây
    // Ví dụ:
    // public static StudentDAO getStudentDAO() { return new StudentDAOImpl(); }
    // public static SubjectDAO getSubjectDAO() { return new SubjectDAOImpl(); }

}
