package dao;

import entity.Result;
import database.Connector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ResultDAOImpl implements ResultDAO {

    @Override
    public boolean create(Result result) {
        String sql = "INSERT INTO results(mark, student_id, subject_id) VALUES (?, ?, ?)";
        try {
            PreparedStatement pstm = Connector.getInstance().preparedStatement(sql);
            pstm.setDouble(1, result.getMark());
            pstm.setInt(2, result.getStudentId());
            pstm.setInt(3, result.getSubjectId());
            return pstm.executeUpdate() > 0;
        } catch (Exception e) {
            System.err.println("Create failed: " + e.getMessage());
            return false;
        }
    }

    @Override
    public Result read(int id) {
        String sql = "SELECT * FROM results WHERE id = ?";
        try {
            PreparedStatement pstm = Connector.getInstance().preparedStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                return new Result(
                        rs.getInt("id"),
                        rs.getDouble("mark"),
                        rs.getInt("student_id"),
                        rs.getInt("subject_id")
                );
            }
        } catch (Exception e) {
            System.err.println("Read failed: " + e.getMessage());
        }
        return null;
    }

    @Override
    public boolean update(Result result) {
        String sql = "UPDATE results SET mark = ?, student_id = ?, subject_id = ? WHERE id = ?";
        try {
            PreparedStatement pstm = Connector.getInstance().preparedStatement(sql);
            pstm.setDouble(1, result.getMark());
            pstm.setInt(2, result.getStudentId());
            pstm.setInt(3, result.getSubjectId());
            pstm.setInt(4, result.getId());
            return pstm.executeUpdate() > 0;
        } catch (Exception e) {
            System.err.println("Update failed: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM results WHERE id = ?";
        try {
            PreparedStatement pstm = Connector.getInstance().preparedStatement(sql);
            pstm.setInt(1, id);
            return pstm.executeUpdate() > 0;
        } catch (Exception e) {
            System.err.println("Delete failed: " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<Result> getAll() {
        List<Result> list = new ArrayList<>();
        String sql = "SELECT * FROM results";
        try {
            PreparedStatement pstm = Connector.getInstance().preparedStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Result result = new Result(
                        rs.getInt("id"),
                        rs.getDouble("mark"),
                        rs.getInt("student_id"),
                        rs.getInt("subject_id")
                );
                list.add(result);
            }
        } catch (Exception e) {
            System.err.println("GetAll failed: " + e.getMessage());
        }
        return list;
    }
}
