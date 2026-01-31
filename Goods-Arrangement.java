import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static List<Long> YueShu(long k) {//求约数
        List<Long> list = new ArrayList<>();
        for(long i = 1; i * i <= k; i++) {
            if(k % i == 0) {
                list.add(i);
                if(k / i != i) {
                    list.add(k / i);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int count = 0;
        List<Long> list = YueShu(2021041820210418L);
        for(Long l1 : list) {
            for(Long l2 : list) {
                for(Long l3 : list) {
                    if(l1 * l2 * l3 == 2021041820210418L) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        scan.close();
    }
}


