package org.angus.menu.entity;

import java.util.List;

/**
 * 按钮类
 * @author angus
 *
 */
public class Button {
	public String name;
	public Button sub_button;
	public String type;
	public String key;
	public String url;
	public String media_id;
	public List<Button> list;
	public NewsInfo news_info;
	
	public NewsInfo getNews_info() {
		return news_info;
	}



	public void setNews_info(NewsInfo news_info) {
		this.news_info = news_info;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Button getSub_button() {
		return sub_button;
	}



	public void setSub_button(Button sub_button) {
		this.sub_button = sub_button;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getKey() {
		return key;
	}



	public void setKey(String key) {
		this.key = key;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getMedia_id() {
		return media_id;
	}



	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}



	public List<Button> getList() {
		return list;
	}



	public void setList(List<Button> list) {
		this.list = list;
	}



	public static class Type{
		
		/**
		 * 点击推事件
		 * 用户点击click类型按钮后，微信服务器会通过消息接口推送消息类型为event	的结构给开发者（参考消息接口指南），并且带上按钮中开发者填写的key值，开发者可以通过自定义的key值与用户进行交互
		 */
		public final static String CLICK = "click";
		
		/**
		 * 跳转URL
		 * 用户点击view类型按钮后，微信客户端将会打开开发者在按钮中填写的网页URL，可与网页授权获取用户基本信息接口结合，获得用户基本信息
		 */
		public final static String VIEW = "view";
		
		/**
		 * 扫码推事件
		 * 用户点击按钮后，微信客户端将调起扫一扫工具，完成扫码操作后显示扫描结果（如果是URL，将进入URL），且会将扫码的结果传给开发者，开发者可以下发消息。
		 */
		public final static String SCANCODE_PUSH = "scancode_push";
		
		/**
		 * 扫码推事件且弹出“消息接收中”提示框
		 * 用户点击按钮后，微信客户端将调起扫一扫工具，完成扫码操作后，将扫码的结果传给开发者，同时收起扫一扫工具，然后弹出“消息接收中”提示框，随后可能会收到开发者下发的消息
		 */
		public final static String SCANCODE_WAITMSG = "scancode_waitmsg";
		
		/**
		 * 弹出系统拍照发图
		 * 用户点击按钮后，微信客户端将调起系统相机，完成拍照操作后，会将拍摄的相片发送给开发者，并推送事件给开发者，同时收起系统相机，随后可能会收到开发者下发的消息
		 */
		public final static String PIC_SYSPHOTO = "pic_sysphoto";
		
		/**
		 * 弹出拍照或者相册发图
		 * 用户点击按钮后，微信客户端将弹出选择器供用户选择“拍照”或者“从手机相册选择”。用户选择后即走其他两种流程
		 */
		public final static String PIC_PHOTO_OR_ALBUM = "pic_photo_or_album";
		
		/**
		 * 弹出微信相册发图器
		 * 用户点击按钮后，微信客户端将调起微信相册，完成选择操作后，将选择的相片发送给开发者的服务器，并推送事件给开发者，同时收起相册，随后可能会收到开发者下发的消息。
		 */
		public final static String PIC_WEIXIN = "pic_weixin";
		
		/**
		 * 弹出地理位置选择器
		 * 用户点击按钮后，微信客户端将调起地理位置选择工具，完成选择操作后，将选择的地理位置发送给开发者的服务器，同时收起位置选择工具，随后可能会收到开发者下发的消息。
		 */
		public final static String LOCATION_SELECT = "location_select";
		
		/**
		 * 下发消息（除文本消息）
		 * 用户点击media_id类型按钮后，微信服务器会将开发者填写的永久素材id对应的素材下发给用户，永久素材类型可以是图片、音频、视频、图文消息。请注意：永久素材id必须是在“素材管理/新增永久素材”接口上传后获得的合法id
		 */
		public final static String MEDIA_ID = "media_id";
		
		/**
		 * 跳转图文消息URL
		 * 用户点击view_limited类型按钮后，微信客户端将打开开发者在按钮中填写的永久素材id对应的图文消息URL，永久素材类型只支持图文消息。请注意：永久素材id必须是在“素材管理/新增永久素材”接口上传后获得的合法id。
		 */
		public final static String VIEW_LIMITED = "view_limited";
	}
	
	
}
