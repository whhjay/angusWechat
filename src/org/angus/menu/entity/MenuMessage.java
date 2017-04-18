package org.angus.menu.entity;


/**
 * 获取自定义菜单配置
 * @author angus
 *
 */
public class MenuMessage {
	public int is_menu_open;
	public Menu selfmenu_info;
	public int getIs_menu_open() {
		return is_menu_open;
	}
	public void setIs_menu_open(int is_menu_open) {
		this.is_menu_open = is_menu_open;
	}
	public Menu getSelfmenu_info() {
		return selfmenu_info;
	}
	public void setSelfmenu_info(Menu selfmenu_info) {
		this.selfmenu_info = selfmenu_info;
	}
	
	
}
