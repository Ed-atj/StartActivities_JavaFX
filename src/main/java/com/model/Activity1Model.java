package com.model;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import com.controller.Activity1Controller;

public class Activity1Model {


	public String result() {
    	ScriptEngineManager scriptManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptManager.getEngineByName("JavaScript");
        Activity1Controller controller = new Activity1Controller();
        double textNum = 0;
        try {
        	Object result = scriptEngine.eval(controller.calcText.getText());
        	if (result instanceof Number number) {
        		textNum = number.doubleValue();
        	}
        }catch(ScriptException e) {
        	e.printStackTrace();
        }
        return textNum+"";
	}
	
}
