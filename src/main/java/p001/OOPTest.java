package p001;

import java.util.Arrays;

public class OOPTest {
    public static void main(String... args) {
        // int it = 65;
        // float fl = 65.0f;
        // System.out.println("65和65.0f是否相等？" + (it == fl)); // false
        // char ch1 = 'A'; char ch2 = 12;
        // System.out.println("65和'A'是否相等？" + (it == ch1));//true
        // System.out.println("12和ch2是否相等？" + (12 == ch2));//true
        // String str1 = new String("hello");
        // String str2 = new String("hello");
        // System.out.println("str1和str2是否相等？"+ (str1 == str2));//false
        // System.out.println("str1是否equals str2？"+(str1.equals(str2)));//true
        Rectangle r1 = new Rectangle();
        r1.print(1234, 8, 0);
    }

}

class Rectangle {
    int length;
    int width;

    public void print(int... numbers) {
        System.out.println("1111");
        System.out.println(Arrays.toString(numbers));
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (this.length + this.width);
    }

    public void print(char sign) {
        for (int i = 1; i <= this.width; i++) {
            for (int j = 1; j <= this.length; j++) {
                System.out.print(sign);
            }
            System.out.println();
        }
    }

    public String getInfo() {
        return "长：" + this.length + "，宽：" + this.width + "，面积：" + this.area() + "，周长：" + this.perimeter();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.getInfo();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
}
