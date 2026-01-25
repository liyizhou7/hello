import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {

    public static void resetBits(boolean[] s){//重置对应位的值
    for(int i=0;i<7;i++){
      s[i] = false;
      }
    }

    public static int returnDown(int s){//返回第一个为1下标
    for(int i=0;i<7;i++){
      if (((s>>i)&1)==1)
      return i;
    }
    return -1;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...

        int[][] a ={//邻接表
          {1,5},//a-0
          {0,2,6},//b-1
          {1,3,6},//c-2
          {2,4},//d-3
          {3,5,6},//e-4
          {0,4,6},//f-5
          {1,2,4,5} //g-6
        };
        int sum=0;
        boolean[] state=new boolean[7];//判断七位是否联通
        

    
        for(int i=0b00000001;i<=0b01111111;i++){
          Queue<Integer> queue = new LinkedList<>();
          int j = i;//哨兵
          int count=0;//出队次数
          int time=0;//j中1的个数
          resetBits(state);
          if(returnDown(j)!=-1){
            queue.offer(returnDown(j));
            state[returnDown(j)]=true;
          }
          while(!queue.isEmpty()){
            int k = queue.poll();//出队
            count++;

            for(int k1 = 0;k1<a[k].length;k1++){
                if(((j>>a[k][k1])&1)==1&&!state[a[k][k1]]){
                  queue.offer(a[k][k1]);//入队
                  state[a[k][k1]]=true;
                }
            }
            
          }
          for(int z=0;z<7;z++){
            if(((j>>z)&1)==1){
              time++;
            }
          }
          if(time==count)sum++;
        }
        System.out.println(sum);
        scan.close();
    }
}
