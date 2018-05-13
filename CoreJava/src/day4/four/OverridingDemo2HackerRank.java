package day4.four;

import java.util.*;
import java.io.*;

class BiCycle{
	String define_me(){
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle{
	String define_me(){
		return "a cycle with an engine.";
	}
	
	MotorCycle(){
		System.out.println("Hello I am a motorcycle, I am "+ define_me());
		String temp=super.define_me();
		System.out.println("My ancestor is a cycle who is "+ temp );
	}
	
}
public class OverridingDemo2HackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorCycle M=new MotorCycle();
		String temp = M.define_me();
		System.out.println(temp);
		
	}

}
