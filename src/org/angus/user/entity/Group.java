package org.angus.user.entity;

/**
 * 用户组
 * @author angus
 *
 */
public class Group {
	public int id;//分组id，由微信分配
	public String name;//分组名字，UTF8编码 
	public int count;//分组内用户数量 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
