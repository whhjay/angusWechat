package org.angus.user.entity;

import java.util.List;

/**
 * 用户分组列表
 * @author angus
 *
 */
public class Groups {
	List<Group> groups;
	
	List<String> openid_list;
	

	public List<String> getOpenid_list() {
		return openid_list;
	}

	public void setOpenid_list(List<String> openid_list) {
		this.openid_list = openid_list;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}
	
}
