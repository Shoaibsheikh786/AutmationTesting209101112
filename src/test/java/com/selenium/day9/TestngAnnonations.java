package com.selenium.day9;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAnnonations {

	@BeforeMethod
	public void setUp() {
		System.out.println("BeforeMethod");
	}

	@Test(priority = 5)
	public void createanewAccount() {

		System.out.println("create a new account");
	}

	@Test(priority = 5)
	public void login() {
		System.out.println("login");
	}

}
