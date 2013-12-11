package net.randomsync.testng.excel.demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DependencyTest {

	@Parameters({ "message" })
	@Test(groups = { "b" })
	public void test1(@Optional("default message") String message) {
		System.out.println("Test1. Message=" + message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Parameters({ "message" })
	@Test(groups = { "a" })
	public void test2(@Optional("default message") String message) {
		System.out.println("Test2. Message=" + message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Parameters({ "message" })
	@Test(groups = { "init" })
	public void test3(@Optional("default message") String message) {
		System.out.println("Test3. Message=" + message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
