package com.question1;

public interface X {
		abstract void FunA();
		
		default void FunB() {
			System.out.println("FunB in interface X");
		
		}
		
		static void funC() {
			System.out.println("FunC in interface  X");
		}
}

interface Y{
	abstract void funD();
	
	default void funE() {
		System.out.println("FunD in interface Y");
	}
	
	static void FunF() {
		System.out.println("FunF in interface Y");
	}
}

interface Z extends X, Y{
	abstract void FunZ();
}

class Zimpl implements Z{

	@Override
	public void FunA() {
		// TODO Auto-generated method stub
		System.out.println("FunA in Zimpl");
	}

	@Override
	public void funD() {
		// TODO Auto-generated method stub
		System.out.println("FunD in Zimpl");
	}

	@Override
	public void FunZ() {
		// TODO Auto-generated method stub
		System.out.println("Funz in Zimpl");
		
	}
	
	
}

class Demo{
	public static void main(String[] args) {
		
		Z z=new Zimpl();
		z.FunA();
		z.FunB();
		z.funD();
		z.funE();
		z.FunZ();
		X.funC();
		Y.FunF();
	
	}
}








