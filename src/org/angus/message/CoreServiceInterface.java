package org.angus.message;

import javax.servlet.http.HttpServletRequest;

import org.angus.message.resp.MusicMessage;
import org.angus.message.resp.NewsMessage;
import org.angus.message.resp.TextMessage;

/**
 * 消息业务接口
 * @author angus
 *
 */
public interface CoreServiceInterface {
	
	/**
	 * 接收并返回消息数据
	 * @param request
	 * @return  数据格式xml字符串
	 */
	String receiveAndToResponse(HttpServletRequest request);
	
	/**
	 * 接收并返回文本消息
	 * @param request
	 * @return
	 */
	TextMessage responseTextMessage(HttpServletRequest request);
	
	/**
	 * 接收并返回音频消息
	 * @param request
	 * @return
	 */
	MusicMessage responseMusicMessage(HttpServletRequest request);
	
	/**
	 * 接收并返回图文消息
	 * @param request
	 * @return
	 */
	NewsMessage responseNewsMessage(HttpServletRequest request);
}
