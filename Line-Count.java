import java.util.*;
import java.io.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static int gcd(int a,int b){//求两个数的最大公约
      a = Math.abs(a);
      b = Math.abs(b);
      return b==0?a:gcd(b,a%b);
    }
    public static int GCD(int a,int b,int c){//求三个数的最大公约
      return gcd(gcd(a,b),c);
    }
    public static String gcd_ABC(int a,int b,int c){//返回Stirng存入HashSet中
      String s ="";
      int k = GCD(a,b,c);//k为最大公约数
      a /= k;
      b /= k;
      c /= k;
      return a+","+b+","+c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        List<int[]> points = new ArrayList<>();//points表示对应的点
        Set<String> set = new HashSet<>();//set为整数表示直线
        for(int x=0;x<20;x++){
          for(int y=0;y<21;y++){
            points.add(new int[]{x,y});
          }
        }
        for(int i=0;i<points.size();i++){
          for(int j=i+1;j<points.size();j++){//双重for循环开始找直线
            int x1 = points.get(i)[0];
            int x2 = points.get(j)[0];
            int y1 = points.get(i)[1];
            int y2 = points.get(j)[1];
            int a = y2 - y1;
            int b = x2 - x1;
            int c = x2*y1 - x1*y2;
            set.add(gcd_ABC(a,b,c));
          }
        }
        System.out.println(set.size());
        scan.close();
    }
}
