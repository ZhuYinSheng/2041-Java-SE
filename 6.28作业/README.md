### 写出以下程序的输出结果

#### 1. 以下代码能否通过编译，为什么

```
class Outer{
 public static void main(String[] args){
  new Inner(); 
 } 
 class Inner { 
  Inner() {} 
 }  
}
```

编译不通过，需要 new Outer().new Inner() ，在静态域中使用内部类的时候，并没有外部类对象被创造出来。

#### 2. 以下代码能否通过编译，为什么

```
static class Outer{
 public static void main(String[] args){
 
 }
 private class Inner{
  Inner() {} 
 }
}
```

编译报错，因为外部类不可以用static关键字修饰。

#### 3.

```
class Outer {
 String s1 = "Java";
 String s2 = "2";

 public static void main(String[] args) { 
  Outer outer = new Outer();  
 }
 Outer() { 
  Inner inner = new Inner();  
 }
 class Inner {
  String s1 = "Certification";
  String s2 = "Exam";
        
  Inner() {
   System.out.println(Outer.this.s1);
   System.out.println(this.s1);
   System.out.println(s2);
  }
 }
}
```
Java		
Certification		
Exam

#### 4. 以下代码能否通过编译，为什么

```
class A
{
    class B
    {
        static void methodB()
        {
            System.out.println("Method B");
        }
    }
}
```
编译报错，因为非静态的内部类中不允许定义静态的成员和方法。

#### 5.

```
class OuterInnerStatic {
 static String s1 = "Java"; 
 static String s2 = "2";
 public static void main(String[] args) { 
  Inner inner = new Inner();  
}

 static class Inner {
  String s1 = "Certification";
  String s2 = "Exam";
  Inner() {
   System.out.println(OuterInnerStatic.s1); // Java
   System.out.println(this.s1);  // Certification
   System.out.println(s2); // Exam
  }
 }
}
```

#### 6. 在下面的示例中，如何访问"XYZ"类的"i"字段？

```
class ABC
{
    class XYZ
    {
        int i = 111;
    }
}
```
new ABC().new XYZ().i
ABC.XYZ a = new ABC().new XYZ();
        a.i

#### 7. 运行以下程序时，它是否在控制台上打印“SUCCESS”？

```
class A
{
    {               // 第二种改法：static {
        new B();
    }
     
    static class B                  // 第一种改法：class B
    {
        {           // 第三种改法：static {
            new A().new C();        // 第一种改法：new C();
        }
    }
     
    class C
    {
        {
            System.out.println("SUCCESS");
        }
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        new A();
    }
}
```
类A被加载的时候，没有调用new B或new C，内部类不会被自动加载。可以使class B 的 static 移除,并且只new C()。

#### 8. 以下代码能否通过编译，为什么

```
class A
{
    String s = "AAA";       // 或者改为：static String s = "AAA";
     
    void methodA()
    {
        System.out.println(s);
    }
     
    static class B
    {
        void methodB()
        {
            methodA();
        }
    }
}
```
编译报错，因为静态内部类中无法直接调用外部类的非静态方法，可以使用new A().methodA() 
#### 9.

```
abstract class A
{
    {
        System.out.println(1);	// 2
    }
     
    static
    {
        System.out.println(2);	// 1
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A a = new A() { };		// 3  相当于建了一个匿名内部类。去掉大括号那么就没有办法新建一个抽象类的实例。
    }
}
```

#### 10.

```
class A
{
    static String s = "AAA";
     
    class B
    {
        String s = "BBB";
         
        void methodB()
        {
            System.out.println(s);	// BBB
        }
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A a = new A();
         
        System.out.println(a.s);	// AAA
         
        A.B b = a.new B();
         
        System.out.println(b.s);	// BBB
         
        b.methodB();
    }
}
```

#### 11. 以下代码能否通过编译，为什么

```
class A
{
    void methodOne()			// 方法中的内部类，属于局部类，只能在方法中使用。
    {
        class B
        {
            void methodTwo()
            {
                System.out.println("Method Two");
            }
        }
    }
     
    void methodThree()
    {
        new B().methodTwo();	// 找不到Class B
    }
}
```

#### 12. 以下代码能否通过编译，为什么

```
class A
{
    class B
    {
        {
            System.out.println(1);
        }
         
        static
        {
            System.out.println(2);
        }
    }
}
```
编译报错，因为非静态内部类中不允许出现静态域中的内容。
#### 13.

```
class A
{
    void methodA1(int i)
    {
        System.out.println(i+++i);		// 10 + 11
    }
     
    void methodA2(int i)
    {
        System.out.println(--i-i--);	// 9 - 9
    }
}
 
class B
{
    A a = new A()
    {
        void methodA1(int i)
        {
            System.out.println(++i+i++);	// 11 + 11
        }
         
        void methodA2(int i)
        {
            System.out.println(i---i);		// 10 -9
        }
    };
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A a = new A();
         
        a.methodA1(10);
         
        a.methodA2(10);
         
        B b = new B();
         
        b.a.methodA1(10);
         
        b.a.methodA2(10);
    }
}
```

#### 14. 以下代码能否通过编译，为什么

```
class A
{
    class B extends A
    {
        class C extends B
        {
            class D extends C
            {
                 
            }
        }
    }
}
```
编译通过。

#### 15. 在下面的示例中，如何访问“内部类”的“i”字段？

```
class OuterClass
{
    static class InnerClass
    {
        int i;
    }
}

// new InnerClass().i

class Main {
	public static void main(String[] args) {
		System.out.println(new OuterClass.InnerClass().i);
	}
}
```

#### 16.

```
class A
{   
    abstract class B
    {
        abstract void method();
    }
     
    {
        new B()
        {
             
            @Override
            void method()
            {
                System.out.println("BBB");
            }
        }.method();
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        new A();
    }
}
```
BBB

#### 17. 如何在class A以外的其他类中实例化 class B

```
class A
{
    void methodA()
    {
        class B
        {
             
        }
    }
}
```
没有办法创建B的实例，只能在这个方法中创建B的对象。
#### 18.

```
public class Outer 
{ 
	public static int temp1 = 1; 
	private static int temp2 = 2; 
	public int temp3 = 3; 
	private int temp4 = 4; 
	
	public static class Inner 
	{ 
		private static int temp5 = 5; 
		
		private static int getSum() 
		{ 
			return (temp1 + temp2 + temp3 + temp4 + temp5); 
			// 报错，3，4 必要要有Outer创建的对象。
			//return (temp1 + temp2 + new Outer().temp3 + new Outer().temp4 + temp5);
		} 
	} 
	
	public static void main(String[] args) 
	{ 
		Outer.Inner obj = new Outer.Inner(); 
		System.out.println(obj.getSum()); 
	} 
	
} 
```

#### 19.

```
interface Anonymous 
{ 
	public int getValue(); 
} 
public class Outer 
{ 
	private int data = 15; 
	public static void main(String[] args) 
	{ 
		Anonymous inner = new Anonymous() 
				{ 
					int data = 5; 
					public int getValue() 
					{ 
						return data; 
					} 
					public int getData() 
					{ 
						return data; 
					} 
				}; 
		Outer outer = new Outer(); 
		System.out.println(inner.getValue() + inner.getData() + outer.data); 	// 编译报错，匿名内部类不能通过变量来访问。inner 没有getData方法，没有办法访问。
	} 
} 
```