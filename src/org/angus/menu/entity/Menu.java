package org.angus.menu.entity;

import java.util.ArrayList;
import java.util.List;


/**
 * 菜单类
 * @author angus
 *
 */
public class Menu {
	
	public Menu(){
		this.button = new ArrayList<Button>();
	}
	
	public List<Button> button;
	
	public void addButton(Button subButton){
		button.add(subButton);
	}

}
