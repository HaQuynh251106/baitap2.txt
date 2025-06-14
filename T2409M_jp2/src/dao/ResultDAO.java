package dao;

import entity.Result;
import java.util.List;

public interface ResultDAO {

    // Thêm một kết quả mới
    boolean create(Result result);

    // Lấy kết quả theo id
    Result read(int id);

    // Cập nhật thông tin kết quả
    boolean update(Result result);

    // Xóa kết quả theo id
    boolean delete(int id);

    // Lấy tất cả các kết quả
    List<Result> getAll();
}

