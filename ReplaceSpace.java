package com.lcafe8.offer;

/***
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20���� ���磬���ַ���ΪWe Are
 * Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 * @author Administrator
 * @date 2015��9��18��
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
