package org.angus.message.auto;

/**
 * 自动回复规则
 * @author angus
 *
 */
public class AutoReply {
	private int is_add_friend_reply_open;//关注后自动回复是否开启，0代表未开启，1代表开启
	private int is_autoreply_open;//消息自动回复是否开启，0代表未开启，1代表开启
	private DefaultReply add_friend_autoreply_info;//关注后自动回复的信息 
	private DefaultReply message_default_autoreply_info;//消息自动回复的信息 
	private KeywordAutoreplyInfo keyword_autoreply_info;//关键词自动回复的信息
	public int getIs_add_friend_reply_open() {
		return is_add_friend_reply_open;
	}
	public void setIs_add_friend_reply_open(int is_add_friend_reply_open) {
		this.is_add_friend_reply_open = is_add_friend_reply_open;
	}
	public int getIs_autoreply_open() {
		return is_autoreply_open;
	}
	public void setIs_autoreply_open(int is_autoreply_open) {
		this.is_autoreply_open = is_autoreply_open;
	}
	public DefaultReply getAdd_friend_autoreply_info() {
		return add_friend_autoreply_info;
	}
	public void setAdd_friend_autoreply_info(DefaultReply add_friend_autoreply_info) {
		this.add_friend_autoreply_info = add_friend_autoreply_info;
	}
	public DefaultReply getMessage_default_autoreply_info() {
		return message_default_autoreply_info;
	}
	public void setMessage_default_autoreply_info(DefaultReply message_default_autoreply_info) {
		this.message_default_autoreply_info = message_default_autoreply_info;
	}
	public KeywordAutoreplyInfo getKeyword_autoreply_info() {
		return keyword_autoreply_info;
	}
	public void setKeyword_autoreply_info(KeywordAutoreplyInfo keyword_autoreply_info) {
		this.keyword_autoreply_info = keyword_autoreply_info;
	}
	
	
}
