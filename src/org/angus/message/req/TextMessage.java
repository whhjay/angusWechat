package org.angus.message.req;

/**
 * 文本消息类
 * @author angus
 *
 */
public class TextMessage
  extends BaseMessage
{
  private String Content;
  
  public String getContent()
  {
    return this.Content;
  }
  
  public void setContent(String content)
  {
    this.Content = content;
  }
}
