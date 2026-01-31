import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static int gcd(int a,int b){//最大公约数
      return b==0?a:gcd(b,a%b);
    }
    public static int lcm(int a,int b){//最小公倍数
      return a/gcd(a,b)*b;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));
        int[] dist = new int[2022]; 
        for(int i=0;i<2022;i++)dist[i]=Integer.MAX_VALUE;//初始化
        dist[1]=0;
        pq.offer(new int[]{1,0});//[0]表示编号，[1]表示距离
        while(!pq.isEmpty()){
          int[] front = pq.poll();//出队 赋值给front front[0]表示编号，[1]表示最小距离
          if (front[1] > dist[front[0]]) continue;//剪枝
          for(int i = 1; i <= 21; i++){
            if(front[0]+i>2021)continue;
            int u = front[0] + i;//邻居编号
            int v = front[1] + lcm(front[0],u);//邻居到起点的最小距离
            if(dist[u]>v)dist[u]=v;
            pq.offer(new int[]{u,v});
          }
        }
        System.out.println(dist[2021]);
        //System.out.println(pq.poll()[0]);
        scan.close();
    }
}
