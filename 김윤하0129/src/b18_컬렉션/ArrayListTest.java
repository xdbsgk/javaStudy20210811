package b18_�÷���;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>();	// ��ĳ����
		//arrayList = new LinkedList<String>();
		//arrayList = new Vector<String>();
		//arrayList = new Stack<String>();
		
		arrayList.add("java");
		arrayList.add("c");
		arrayList.add("python");
		
		System.out.println(arrayList.get(1));
		
		// for������ ���
		for(int i=0; i<arrayList.size(); i++)
		System.out.println(arrayList.get(i));
		
		// foreach������ ���
		for(String str : arrayList)
			System.out.println(str);
		
		System.out.println(arrayList.remove(0));	// �����ϴ� ���� ��ȯ�Ѵ�.
		
		System.out.println(arrayList);
		
	}
}
