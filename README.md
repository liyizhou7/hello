# 蓝桥杯算法题解集

本仓库包含蓝桥杯相关算法题的Java实现，旨在学习和展示常见的算法解题思路。

## 项目结构


.
├── Matrix-2020-Counter.java    # 2020年省赛真题：寻找2020
├── Maze-BFS-30x50.java         # 迷宫最短路径BFS算法
└── README.md                   # 项目说明文档


## 题目详解

### 1. Matrix-2020-Counter# # # 1。矩阵- 2020计数器
**文件**: `Matrix-2020-Counter.java`  
**描述**: 蓝桥杯2020年省赛真题 - 寻找2020  
**问题**: 在一个只包含0和2的矩阵中，统计"2020"模式出现的次数，包括：
- 水平方向（同一行连续4个字符）
- 垂直方向（同一列连续4个字符）  
- 对角线方向（左上到右下连续4个字符）

**解题思路**:
- 将输入的字符串矩阵转换为字符二维数组
- 遍历每个起始位置，检查三个方向是否匹配"2020"
- 注意边界条件判断，防止数组越界

**关键代码**:
java
// 横向检查
if(j+3 < b[0].length && b[i][j]'2' && b[i][j+1]'0' && b[i   我][j+2]'2' && b[i   我][j+3]'0') sum++;if(j 3 < b[0].length && b[i   我][j]   [j] .'2' && b[i][j 1]'0' && b[i][j 2]'2' && b[i][j 3]'0') sum  ;
// 纵向检查  
if(i+3 < b.length && b[i][j]'2' && b[i+1][j]'0' && b[i+2][j]'2' && b[i+3][j]'0') sum++;if(i 3 < b.length && b[i   我][j]   [j] .'2' && b[i 1][j]   [j] .'0' && b[i 2][j]   [j] .'2' && b[i 3][j]   [j] .'0') sum  ;
// 斜向检查
if(j+3<b[0].length && i+3<b.length && b[i][j]'2' && b[i+1][j+1]'0' && b[i+2][j+2]'2' && b[i+3][j+3]'0') sum++;if(j 3<b[0].length && i 3<b.length && b[i   我][j]   [j] .'2' && b[i 1][j 1]'0' && b[i 2][j 2]'2' && b[i 3   我3][j 3]'0') sum  ;


### 2. Maze-BFS-30x50   # # # 2。Maze-BFS-30x50
**文件**: `Maze-BFS-30x50.java`  
**描述**: 迷宫最短路径BFS算法（30×50迷宫）  
**问题**: 在30行50列的迷宫中，0表示通路，1表示障碍，从左上角(0,0)到右下角(29,49)寻找最短路径，按D(下)、L(左)、R(右)、U(上)输出路径。

**解题思路**:
- 使用BFS（广度优先搜索）寻找最短路径
- 用队列存储待访问节点，visited数组记录访问状态
- fromDir数组记录每个位置的来源方向
- 到达终点后反向追踪构建完整路径

**关键代码**:
java
// 方向数组：下、左、右、上
int[][] dirs = {{1,0},{0,-1},{0,1},{-1,0}};
char[] dirChar = {'D','L','R','U'};char[] dirChar = {'D','L','R','U'}；

// BFS核心逻辑
while(!queue.isEmpty()){   而(! queue.isEmpty ()) {
    int[] pos = queue.poll();Int [] pos = queue.poll()；Int [] pos = queue.poll()；Int [] pos = queue.poll()；
    int x = pos[0], y = pos[1];Int x = pos[0], y = pos[1]；Int x = pos[0], y = pos[1]；Int x = pos[0], y = pos[1]；Int x = pos[0], y = pos[1]；Int x = pos[0], y = pos[1]；
    
    if(xn-1 && ym-1) break; // 到达终点if(xn-1 && ym-1) break; // 到达终点if(xn-1 && ym-1) break; // 到达终点if(xn-1 && ym-1) break; // 到达终点if(xn-1 && ym-1) break; // 到达终点if(xn-1 && ym-1) break; // 到达终点if(xn-1 && ym-1) break; // 到达终点if(xn-1 && ym-1) break; // 到达终点
    
    for(int i=0; i<4; i++){   For (int i=0; i<4; i){for(int i=0; i<4; i){for(int i=0; i<4; i){(int i = 0; i< 4; i){为(int i = 0; i< 4。我){为(int i = 0; i< 4。我){为(int i = 0; i< 4。我){
        int nx = x + dirs[i][0];Int nx = x dirs[i][0]；Int nx = x dirs[i][0]；Int nx = x dirs[i][0]；Int nx = x dirs[i][0]；Int nx = x dirs[i][0];Int nx = x dirs[i][0]；
        int ny = y + dirs[i][1];int ny = y   dirs[i][1];int ny = y   dirs[i][1];int ny = y   dirs[i][1];
        
        if(nx>=0 && nx<n && ny>=0 && ny<m && if (nx> = 0 & & nx< n & & ny> = 0 & & ny< m & &if (nx> = 0 & & nx< n & & ny> = 0 & & ny< m & & if (nx> = 0 & & nx< n & & ny> = 0 & & ny< m & &
           !visited[nx][ny] && maze[nx][ny]=='0'){！参观了[nx][ny] &；&；迷宫[nx][ny]=='0'){
            visited[nx][ny] = true;   Visited [nx][ny] = true；
            fromDir[nx][ny] = dirChar[i];fromDir[nx][ny] = dirChar[i]；
            queue.offer(new int[]{nx, ny});队列中。Offer (new int[]{nx, ny})；
        }
    }
}


## 运行方法

1. 确保已安装Java开发环境（JDK 8+）
2. 编译单个文件：
   bash
   javac Matrix-2020-Counter.java- 2020 counter.java javac矩阵

3. 运行程序：
   bash
   java Matrix-2020-Counter   java矩阵- 2020计数器


## 更新记录
- **Matrix-2020-Counter.java** - 刚刚创建
- **Maze-BFS-30x50.java** - 昨天创建

## 作者
liyizhou7
