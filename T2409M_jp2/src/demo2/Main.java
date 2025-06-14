package demo2;

import dao.ResultDAO;
import entity.Result;
import factory.DAOFactory;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ResultDAO resultDAO = DAOFactory.getResultDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- QUẢN LÝ KẾT QUẢ THI -----");
            System.out.println("1. Thêm kết quả");
            System.out.println("2. Xem kết quả theo ID");
            System.out.println("3. Cập nhật kết quả");
            System.out.println("4. Xoá kết quả");
            System.out.println("5. Hiển thị tất cả kết quả");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.print("Nhập điểm: ");
                    double mark = Double.parseDouble(scanner.nextLine());
                    System.out.print("Nhập student_id: ");
                    int studentId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập subject_id: ");
                    int subjectId = Integer.parseInt(scanner.nextLine());
                    Result newResult = new Result(mark, studentId, subjectId);
                    boolean created = resultDAO.create(newResult);
                    System.out.println(created ? "✅ Thêm thành công!" : "❌ Thêm thất bại.");
                }

                case 2 -> {
                    System.out.print("Nhập ID kết quả cần xem: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    Result result = resultDAO.read(id);
                    System.out.println(result != null ? result : "❌ Không tìm thấy kết quả.");
                }

                case 3 -> {
                    System.out.print("Nhập ID kết quả cần cập nhật: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    Result existing = resultDAO.read(id);
                    if (existing == null) {
                        System.out.println("❌ Không tìm thấy kết quả.");
                        break;
                    }
                    System.out.print("Điểm mới: ");
                    double mark = Double.parseDouble(scanner.nextLine());
                    System.out.print("Student ID mới: ");
                    int studentId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Subject ID mới: ");
                    int subjectId = Integer.parseInt(scanner.nextLine());
                    Result updated = new Result(id, mark, studentId, subjectId);
                    boolean success = resultDAO.update(updated);
                    System.out.println(success ? "✅ Cập nhật thành công!" : "❌ Cập nhật thất bại.");
                }

                case 4 -> {
                    System.out.print("Nhập ID kết quả cần xoá: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    boolean deleted = resultDAO.delete(id);
                    System.out.println(deleted ? "✅ Xoá thành công!" : "❌ Xoá thất bại.");
                }

                case 5 -> {
                    List<Result> results = resultDAO.getAll();
                    System.out.println("===== DANH SÁCH KẾT QUẢ =====");
                    for (Result r : results) {
                        System.out.println(r);
                    }
                }

                case 0 -> {
                    System.out.println("👋 Thoát chương trình.");
                    return;
                }

                default -> System.out.println("❗ Lựa chọn không hợp lệ.");
            }
        }
    }
}
