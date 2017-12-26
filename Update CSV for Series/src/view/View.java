package view;

import java.io.File;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class View {
	
	
	public String choix(Stage stage) {
		FileChooser f = new FileChooser();
		f.getExtensionFilters().addAll(new ExtensionFilter("CSV Files" , "*.csv"));
		f.setTitle("Selectionnez le fichier à mettre à jour");
		File file = f.showOpenDialog(stage);
		if(file != null) {
			return file.getAbsolutePath();
		}
		return null;
	}

	public void done() {
		Text text = new Text("Mise à jour réussie");
		text.setFont(Font.font(25));
		BorderPane bPane = new BorderPane();
		Button ok = new Button("   OK   ");
		
		bPane.setTop(text);
		bPane.setCenter(ok);
		BorderPane.setMargin(ok, new Insets(10,0,0,0));
		bPane.setPadding(new Insets(5,5,5,5));
		Scene scene = new Scene(bPane);
		Stage tmp = new Stage();
		tmp.setScene(scene);
		tmp.setTitle("Done");
		tmp.setResizable(false);
		tmp.setFullScreen(false);
		tmp.show();
		
		ok.setOnAction(e->{
			tmp.close();
		});

		
	}

	public void failed() {
		Text text = new Text("Mise à jour échouée");
		text.setFont(Font.font(25));
		BorderPane bPane = new BorderPane();
		Button ok = new Button("   OK   ");
		
		bPane.setTop(text);
		bPane.setCenter(ok);
		BorderPane.setMargin(ok, new Insets(10,0,0,0));
		bPane.setPadding(new Insets(5,5,5,5));
		Scene scene = new Scene(bPane);
		Stage tmp = new Stage();
		tmp.setScene(scene);
		tmp.setTitle("Error");
		tmp.setResizable(false);
		tmp.setFullScreen(false);
		tmp.show();
		
		ok.setOnAction(e->{
			tmp.close();
		});

		
	}
}
