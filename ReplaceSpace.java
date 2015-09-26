package com.lcafe8.offer;

/***
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。 例如，当字符串为We Are
 * Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author Administrator
 * @date 2015年9月18日
 */
public class ReplaceSpace
{
	public String replaceSpace(StringBuffer str)
	{
		String result = str.toString();
		return result.replaceAll("[ ]","%20");
	}
	
	public static void main(String[] args)
	{
		String str = "We Are Happy";
		
		StringBuffer str1 = new StringBuffer(str);
		
		System.out.println(new ReplaceSpace().replaceSpace(str1));
	}
}
