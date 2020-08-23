package com.ramco.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before("@mobTest")
	public void prerequisite() {
		System.out.println("it is prerequisite for mobile");
	}
	
	@After("@mobTest")
	public void prerequisiter() {
		System.out.println("it is prerequisiter for mobile");
	}

}
