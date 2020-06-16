#### 2.定义一个StringBuffer类对象, 对外提供方法接收字符串或字符，通过一个方法将之前接收到的字符拼接到一起返回
```
/**
    接收字符串
*/
void append(String str)
```

```
/**
    接收字符
*/
void append(Char str)
```

```
/**
将之前接收到的字符拼接到一起返回
*/
String toString()
```

```
/**
清除之前的而输入内容
*/
void clear()
```

```
/**
将之前的输入内容反转
*/
String reverse()
```

```
/**
将指定位置的字符串反转
from 从0起始
to 不包含在内
即[from,to)
例如 abcdefg => reverse(1,3) => acbdefg
*/
String reverse(int from, int to)
```
FlipLetters