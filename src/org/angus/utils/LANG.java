package org.angus.utils;

/**
 * 国家地区语言版本，zh_CN 简体，zh_TW 繁体，en 英语
 * 
 * @author angus
 *
 */
public enum LANG {
	ZH_CN("zh_CN"), ZH_TW("zh_TW"), EN("en");

	String VALUE;

	private LANG(String value) {
		this.VALUE = value;
	}
}