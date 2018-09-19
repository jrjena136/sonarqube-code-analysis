package com.jyoti.sonar.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
	private int x;
	private int y;

	public App(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public void method1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		Object obj = getData();
		if(obj!=null) {
			obj.toString();
		}
		System.out.println("x:"+x + "| y:"+y);
	}
	public Object getData() {
		return null;
	}
    public static void main( String[] args )
    {
        App app = new App(10,15);
        app.method1();
         
    }
    
}
