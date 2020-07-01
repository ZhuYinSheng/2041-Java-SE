#### 1.
```
class Main {
   public static void main(String args[]) {
      try {
         throw 10;
      }
      catch(int e) {    // 编译报错，类型不对，声明的类型应该是Throwable类或是子类的对象。
         System.out.println("Got the  Exception " + e);
      }
  }
}
```

#### 2.
```
class Test extends Exception { }
  
class Main {
   public static void main(String args[]) { 
      try {
         throw new Test();
      }
      catch(Test t) {
         System.out.println("Got the Test Exception");
      }
      finally {
         System.out.println("Inside finally block ");
      }
  }
}
```
```
Got the Test Exception
Inside finally block 
```
#### 3.
```
class Main {
   public static void main(String args[]) {
      int x = 0;
      int y = 10;
      int z = y/x;      // 除数不能为0,抛出非受查异常ArithmeticException 
  }
}
```
```
class Main {
  public static void main(String args[]) {
    int x = 0;
    int y = 10;
    try {
      int z = y/x;
    } catch (Exception e) {
      System.out.println("除数不能为0");;
    }
  }
}
```
#### 4.
```
class Base extends Exception {}
class Derived extends Base  {}
 
public class Main {
  public static void main(String args[]) {
   // some other stuff
   try {
       // Some monitored code
       throw new Derived();
    }
    catch(Base b)     { 
       System.out.println("Caught base class exception"); 
    }
    catch(Derived d)  {     // 捕捉异常时，子类要在父类之前，否则需要删除子类。子类对象的异常已经在上面处理过了。
       System.out.println("Caught derived class exception"); 
    }
  }
} 
```
#### 5.
```
class Test
{
    public static void main (String[] args)
    {
        try
        {
            int a = 0;
            System.out.println ("a = " + a);
            int b = 20 / a;
            System.out.println ("b = " + b);
        }
 
        catch(ArithmeticException e)
        {
            System.out.println ("Divide by zero error");
        }
 
        finally
        {
            System.out.println ("inside the finally block");
        }
    }
}
```
```
a = 0
Divide by zero error
inside the finally block
```
#### 6.
```
class Test
{
    public static void main(String[] args)
    {
        try
        {
            int a[]= {1, 2, 3, 4};
            for (int i = 1; i <= 4; i++)
            {
                System.out.println ("a[" + i + "]=" + a[i] + "n");
            }
        }
         
        catch (Exception e)
        {
            System.out.println ("error = " + e);
        }
         
        catch (ArrayIndexOutOfBoundsException e)        // 已经抓过，小的异常应该在上。
        {
            System.out.println ("ArrayIndexOutOfBoundsException");
        }
    }
}
```
#### 7.
```
class Test
{
    String str = "a";
 
    void A()
    {
        try
        {
            str +="b";	// 执行顺序1. ab
            B();		// 执行顺序2.
        }
        catch (Exception e)
        {
            str += "c";	// 执行顺序8. abdec
        }
    }
 
    void B() throws Exception
    {
        try
        {
            str += "d";		// 执行顺序3. abd
            C();
        }
        catch(Exception e)
        {
            throw new Exception();	// 执行顺序6.
        }
        finally
        {
            str += "e";				// 执行顺序7. abde
        }
 
        str += "f";	
 
    }
     
    void C() throws Exception
    {
        throw new Exception();		// 执行顺序5.
    }
 
    void display()
    {
        System.out.println(str);
    }
 
    public static void main(String[] args)
    {
        Test object = new Test();
        object.A();
        object.display();
    }
 
}

```
abdec
#### 8.
```
class Test
{   int count = 0;
 
    void A() throws Exception
    {
        try
        {
            count++;		// 1
             
            try
            {
                count++;	// 2
 
                try
                {
                    count++;	// 3
                    throw new Exception();
 
                }
                 
                catch(Exception ex)
                {
                    count++;		// 4
                    throw new Exception();
                }
            }
             
            catch(Exception ex)
            {
                count++;		// 5
            }
        }
         
        catch(Exception ex)
        {
            count++;
        }
 
    }
 
    void display()
    {
        System.out.println(count);
    }
 
    public static void main(String[] args) throws Exception
    {
        Test obj = new Test();
        obj.A();
        obj.display();
    }
}
```
5

#### 9.方法返回值是
```
public int myMethod(){

  try {

  return 1;

  }

  Catch (Exception e){

  return 2;

  }

  finally{

  return 3;

 }

}
```
#### 10.

```
 try {

      File file = new File("filename.txt");

      Scanner sc = new Scanner(file);	// 抛出异常

      throw new IOException();		// 此处不执行
    }

    catch (FileNotFoundException e) {

      System.out.println("FileNotFoundException called!!!");

    }

    catch (IOException e) {

      System.out.println("IOException called!!!");

    } 

```
FileNotFoundException called!!!
#### 11.

```
try {

      File file = new File("filename.txt");

      Scanner sc = new Scanner(file);	// 抛出异常

      throw new IOException();	// 此处不执行
    }

    catch (IOException e) {

      System.out.println("IOException called!!!");

    } 
```
IOException called!!!

#### 12.
```
public class Test {

  private static String result = "";

  public static void main(String[] args) {
    test(1); // 0.
    result += "*";  //5. 1245*
    test(0); // 6.
    System.out.println(result);
  }

  public static void test(int i) {
    result += "1"; // 1. 1   // 7. 1245*1
    try {
      if (i == 0) {
        throw new RuntimeException(""); // 8.
      }
      result += "2"; // 2. 12
    } catch (Exception e) {
      result += "3"; // 9. 1245*13
      return;
    } finally {
      result += "4"; // 3. 124 // 10.1245*134
    }
    result += "5"; // 4. 1245
  }
}
```

