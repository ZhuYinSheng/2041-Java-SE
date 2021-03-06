### 目的
通过练习来掌握类的声明和使用，熟悉引用变量的使用。

### 练习
1. 在`class Fridge` 基础上进行修改，增加一个方法`Elephant remove()`，
将大象从冰箱中取出来，调用这个方法将返回之前保存的大象对象，
注意需要将冰箱中原本的大象对象的引用清除，请思考要如何做来清除一个变量的引用。

2. 构建一个狮子类，将冰箱类进行扩展，增加一个保存狮子类的成员变量。
在Fridge.java 中重载`store()`方法用于保存狮子对象，
在两个store 方法中增加判断，如果冰箱中已经装入了大象或者狮子，
就不能再装了，向控制台输出`冰箱已经满了`。

3. 在`class ObjectDemo`中增加一个方法
`static Lion createLion(int heightInCM)`用于创建狮子对象。
 `main`方法中增加创建狮子类对象，
 调用`fridge.store()` 传入狮子对象，编译运行代码。
 程序最后将会输出`冰箱已经满了`
 
4. 定义一个销售首饰的公司类。
```
   属性: 
   一个保存员工的数组。
   方法：
   1. 添加一个员工。
   2. 通过员工的名字来删除员工。
   3. 通过员工的名字来显示员工的工资。
   4. 输出所有员工的工资和。
```
   定义一个普通员工类
   ```
   属性： 
   工作时长（小时） 
   姓名
   基本工资
   方法： 
   1. 设置工作的时长
   2. 计算工资的方法： 
   当每月工作的小时数超过196 小时时，超出的部分按每小时200 元。 
   基本工资+（工作的小时-196）*200。  
```
   创建一个Main类其中main 方法作为程序入口 
   ```
   创建一个公司对象； 
   创建一个普通员工对象，工作小时205 小时。 
   创建一个普通员工对象，工作小时220 小时。 
   创建一个普通员工对象，工作小时180 小时。 
   创建一个普通员工对象，工作小时196 小时。 
   将以上员工对象加入公司对象中，然后调用输出所有员工工资和的方法，查看该公司该月应
   该发的工资总和。 
    ```

5. 分数
设计一个表示分数的类Fraction。这个类有两个int类型的成员分别表示分子和分母。

这个类要提供以下的功能：
double toDouble();
将分数转换为double
Fraction plus(Fraction r);
将自己的分数和r的分数相加，产生一个新的Fraction的对象。
Fraction multiply(Fraction r);
将自己的分数和r的分数相乘，产生一个新的Fraction的对象。
void print();
将自己以“分子/分母”的形式输出到标准输出，并带有回车换行。如果分数是1/1，应该输出1。当分子大于分母时，不需要提出整数部分，即31/30是一个正确的输出。
注意，在创建和做完运算后应该化简分数为最简形式。如2/4应该被化简为1/2。
