# java实验报告4
### 字符串实验 计172 李南峰 2017310456
+ 实验目的
	+ 掌握字符串String及其方法的使用
	+ 掌握异常处理结构
+ 实验要求
	+ 内容：利用已学的字符串处理知识编程《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：
		+ 每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
		+ 允许提供输入参数，统计古诗中某个字或词出现的次数
		+ 考虑操作中可能出现的异常，在程序中加入异常处理程序
+ 目录
	+ 流程图
	+ 过程，核心代码
	+ 心得体会

#### 流程图
[![](https://github.com/2018310985/Java-/blob/master/Java4.jpg)]
#### 过程
首先在一个.java文件中输入文本与参数
并且使用.main将数据传入text.java文件中
	
	package CHG;
	
	public class chang_hen_ge {
		public static void main(String args[]) {
			String chgString = new String(
				"汉皇重色思倾国御宇多年求不得杨家有女初…… "
						+ ",天生丽质");

			test.main(chgString);
		}
	}
	
传入数据后，将文本与参数分隔并分别赋值于两个String类中

	public class test {
		public static void main(String chgString) {
			try {
				String[] arrString = chgString.split(",");
				String txtString = arrString[0];
				String findString = arrString[1];
				String find_wordString = new String();
				String find_charString = new String();
				
做两次循环，将文本处理成此常见的形式，并输出

	StringBuffer midBuffer = new StringBuffer();
	for (int i = 0; i < txtString.length(); i++) {
		midBuffer.append(txt[i]);
		for (int j = 0; j < txtString.length() / 7; j++) {
			if (i == (2 * j - 1) * 7 - 1) {
				midBuffer.append("，");
			}
			if (i == (2 * j) * 7 - 1) {
				midBuffer.append("。");
				midBuffer.append("\n");
			}
		}
	}
	System.out.println(midBuffer);
	
通过获取与参数相同长度的顺序文本，既txt[m:m+find_wordString.length()]，再与参数对比，内容相同则使计数器加一

	if (findString.length() > 1) {
		find_wordString = findString;
		for (int l = 0; l < txt.length - find_wordString.length(); l++) {
			StringBuffer txtBuffer = new StringBuffer();
			for (int m = l; m < l + find_wordString.length(); m++) {
				txtBuffer.append(txt[m]);
			}
			if (find_wordString.equals(txtBuffer.toString())) {
				count_word++;
			} else {
			}
		}
		System.out.println("“" + find_wordString + "”" + "词出现的个数为：" + count_word);
		
最后添加异常处理结构

	} catch (Exception e) {
		System.out.println("错误原因" + e);
		// TODO: handle exception
	}

结果输出

[![](https://github.com/2018310985/Java-/blob/master/image.png)]

#### 心得体会

此次实验与前期学习的其他种类语言实验类型答题相同，逻辑思路可以类比，相比前几个实验，新鲜度不高，主要难点在于程序的表达，语法以及在其他语言中没有的特点，例如数组不能遍历，还有语法的问题。
此次实验丰富了我的语法，完善了我的代码逻辑，对于查找词汇这一难点，我花费了比较长的时间，但收获也是巨大的，唯有独立、完整地完成实验内容，自身的能力才能完成提高。
!!!!!!
