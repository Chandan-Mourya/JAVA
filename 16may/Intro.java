// 1) write the differenc between JRE, JDK and JVM?
// -> JDK is a software development kit,
//    whereas JRE is a software bundle that allows Java program to run, whereas JVM is an environment for executing bytecode.
//    The full form of JDK is Java Development Kit, while the full form of JRE is Java Runtime Environment, 
//    while the full form of JVM is Java Virtual Machine.

// 2) Write the difference between JSE, JEE and JME?
// -> JSE − Java Standard Edition using this, you can develop stand-alone applications. 
// 	This provides the following packages −
//     	java.lang − This package provides the language basics.
//     	java.util − This package provides classes and interfaces (API’s) related to collection framework, events, 
// 	data structure and other utility classes such as date.
//     	etc.

//    JEE − Java Enterprise Edition using this, you can develop Enterprise applications. 
//   	This includes API’s like Servlets, WebSocket, JavaServerFaces, Unified Expression Language.
// 	Web service specifications like API for Restful web services, API for JSON processing, API for JSON Bonding,
//  	Architecture for XML binding, API for XML web services.

//    JME − Java Micro Edition using this, you can develop applications that run on small scale devices like mobile phones.

// 3) How does java achieve platform independency?
// ->   Java is platform-independent because it uses a virtual machine. 
//    The Java programming language and all APIs are compiled into bytecodes.
//         Bytecodes are effectively platform-independent. 
//         The virtual machine takes care of the differences between the bytecodes for the different platforms.

// 4) what are the features of the java explain them?
// -> Java is a language that has become successful and popular because of the following features.
// 	-> Platform Independent
// 	   The Java programs compiled on one operating system can be transferred and executed on any Operating System without modifications. 
// 	   This can be achieved through an application called Java Virtual Machine or simply JVM, as follows:

// 	->   Object Oriented
// 	   Java is the only language that is a purely object-oriented language. This means that every OOP concept is supported by Java.
// 	    Also, it should be noted that even the main() function needs to be defined under a class.
	
// 	->  Compiled and interpreted 
// 	   Java is a language that provides both compilation and interpretation of programs. Once the java program is created,
// 	       it is compiled by Java Compiler. This compiled code (Byte code) can be executed using Java Interpreter.

// 	->   Multi Threaded
// 	   With this feature, Java supports “Multitasking”. Multitasking is when multiple jobs are executed simultaneously.
//        	    Multitasking improves CPU and Main Memory Utilization.

// 5) Write a Java Application which prints your details?
package com.chandan;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("Name:Chandan Mourya");
		System.out.println("Age:21");
		System.out.println("Gender:Male");
		System.out.println("Address:Boisar");
		System.out.println("Mobile:1234567890");
		

	}

}
