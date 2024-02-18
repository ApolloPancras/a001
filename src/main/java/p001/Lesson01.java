package p001;
public class Lesson01 {
    public static void main(String[] args) throws Exception {
        findPrime();
        // User u1 = new User("张三", 36);
        // System.out.println(u1);
    }

    static void findPrime() {
        Prime np = new Prime(2, 10000);
        // 获取开始时间
        long start = System.currentTimeMillis();
        np.findPrime();
        // 获取结束时间
        long duration = System.currentTimeMillis() - start;
        System.out.println(np + "，用时：" + duration);
    }
}
