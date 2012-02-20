package com.example.prototyyppi;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class PrototyyppiApplication extends Application {
	@Override
	public void init() {
		Window mainWindow = new Window("Prototyyppi Application");
		Label label = new Label("Hello Vaadin user");
		mainWindow.addComponent(label);
		setMainWindow(mainWindow);
	}

}
