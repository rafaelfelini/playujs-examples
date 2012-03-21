package controllers;

import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void save() {
    	sleep();
    	render();
    }
    
    public static void show() {
    	sleep();
    	render();
    }

    public static void country() {
    	sleep();
    	render();
    }
    
    public static void error() {
    	error(500, "Simulating an server error.");
    }

    /**
     * Simulanting server load.
     */
    private static void sleep() {
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
}