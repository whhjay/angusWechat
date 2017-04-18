package org.angus.message;

import java.util.Date;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import org.angus.message.resp.TextMessage;
import org.angus.message.util.MessageUtil;

public class CoreService
{
  public static String processRequest(HttpServletRequest request)
  {
    String respMessage = null;
    try
    {
      String respContent = "请求处理异常，请稍候尝试！";
      

      Map<String, String> requestMap = MessageUtil.parseXml(request);
      

      String fromUserName = (String)requestMap.get("FromUserName");
      
      String toUserName = (String)requestMap.get("ToUserName");
      
      String msgType = (String)requestMap.get("MsgType");
      

      TextMessage textMessage = new TextMessage();
      textMessage.setToUserName(fromUserName);
      textMessage.setFromUserName(toUserName);
      textMessage.setCreateTime(new Date().getTime());
      textMessage.setMsgType("text");
      textMessage.setFuncFlag(0);
      if (msgType.equals("text"))
      {
        respContent = "您发送的是文本消息！";
      }
      else if (msgType.equals("image"))
      {
        respContent = "您发送的是图片消息！";
      }
      else if (msgType.equals("location"))
      {
        respContent = "您发送的是地理位置消息！";
      }
      else if (msgType.equals("link"))
      {
        respContent = "您发送的是链接消息！";
      }
      else if (msgType.equals("voice"))
      {
        respContent = "您发送的是音频消息！";
      }
      else if (msgType.equals("event"))
      {
        String eventType = (String)requestMap.get("Event");
        if (eventType.equals("subscribe")) {
          respContent = "谢谢您的关注！";
        } else if (!eventType.equals("unsubscribe")) {
          eventType.equals("CLICK");
        }
      }
      textMessage.setContent(respContent);
      respMessage = MessageUtil.textMessageToXml(textMessage);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    return respMessage;
  }
}
