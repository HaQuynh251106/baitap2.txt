package baitap3;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();

        pb.insertPhone("Đức", "0912345678");
        pb.insertPhone("Công", "0901122334");
        pb.insertPhone("Đức", "0333444555"); // Thêm số khác cho An
        pb.insertPhone("Đức", "0912345678"); // Trùng số

        pb.showAll();

        pb.searchPhone("Đức");

        pb.updatePhone("Công", "0999888777");
        pb.removePhone("Đức");

        pb.insertPhone("Cường", "0123456789");
        pb.sort();
        pb.showAll();
    }
}
