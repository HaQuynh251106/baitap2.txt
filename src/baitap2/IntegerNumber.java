package baitap2;

public class IntegerNumber extends MyNumber {
    int value;
    int number;

    @Override
    MyNumber add(MyNumber Other) {
        IntegerNumber total = new IntegerNumber();//tạo ra 1 object để tính tổng
        IntegerNumber o = (IntegerNumber)Other;// ép kiểu tham số về dạng số nguyên
        total.value = this.value + o.value;//tính tổng
        return total;// trả về kết quả
    }

    @Override
    MyNumber subtract(MyNumber Other) {
        IntegerNumber result = new IntegerNumber();
        IntegerNumber o = (IntegerNumber)Other;
        result.value = this.value - o.value;
        return result;
    }

    @Override
    MyNumber multiply(MyNumber Other) {
        IntegerNumber result = new IntegerNumber();
        IntegerNumber o = (IntegerNumber)Other;
        result.value = this.value * o.value;
        return result;
    }

    @Override
    MyNumber divide(MyNumber Other) {
        IntegerNumber result = new IntegerNumber();
        IntegerNumber o = (IntegerNumber)Other;
        result.value = this.value / o.value;
        return result;
    }

    @Override
    public String toString() {
        return this.value+"";
    }
}
