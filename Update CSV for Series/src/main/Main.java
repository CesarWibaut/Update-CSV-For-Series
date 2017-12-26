package main;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
import model.Parser;
import model.Serie;
import view.View;

public class Main extends Application{
	public static void main(String args[]) throws Exception {
		Application.launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		View v = new View();
		String file = v.choix(arg0);
		if(file!=null) {
			Parser p = new Parser(file);
			ArrayList<Serie> s = p.getSeries();
			p.update(s);
			v.done();
		}else {
			v.failed();
		}
		
	}
}
