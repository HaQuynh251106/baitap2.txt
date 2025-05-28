package baitap3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class PhoneBook extends Phone {
    ArrayList<PhoneNumber> phoneList = new ArrayList<>();

    @Override
    void insertPhone(String name, String phone) {
        for (PhoneNumber entry : phoneList) {
            if (entry.name.equalsIgnoreCase(name)) {
                if (!entry.phone.contains(phone)) {
                    entry.phone.add(phone);
                    System.out.println("Đã thêm số mới cho " + name);
                } else {
                    System.out.println("Số đã tồn tại cho " + name);
                }
                return;
            }
        }
        phoneList.add(new PhoneNumber(name, phone));
        System.out.println("Đã thêm người dùng mới: " + name);
    }

    @Override
    void removePhone(String name) {
        for (int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).name.equalsIgnoreCase(name)) {
                phoneList.remove(i);
                System.out.println("Đã xoá người dùng: " + name);
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng để xoá: " + name);
    }

    @Override
    void updatePhone(String name, String newphone) {
        for (PhoneNumber entry : phoneList) {
            if (entry.name.equalsIgnoreCase(name)) {
                entry.phone.clear();
                entry.phone.add(newphone);
                System.out.println("Đã cập nhật số mới cho " + name);
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng để cập nhật: " + name);
    }

    @Override
    void searchPhone(String name) {
        for (PhoneNumber entry : phoneList) {
            if (entry.name.equalsIgnoreCase(name)) {
                System.out.println("Tìm thấy: " + entry);
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng: " + name);
    }

    @Override
    void sort() {
        Collections.sort(phoneList, Comparator.comparing(entry -> entry.name.toLowerCase()));
        System.out.println("Đã sắp xếp danh bạ theo tên.");
    }

    // Hàm hiển thị toàn bộ danh sách (bổ sung tiện ích)
    void showAll() {
        for (PhoneNumber entry : phoneList) {
            System.out.println(entry);
        }
    }
}
