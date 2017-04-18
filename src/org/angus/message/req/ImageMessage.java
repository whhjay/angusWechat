package org.angus.message.req;

/**
 * 图片消息类
 * @author angus
 *
 */
public class ImageMessage
  extends BaseMessage
{
  private String PicUrl;
  
  public String getPicUrl()
  {
    return this.PicUrl;
  }
  
  public void setPicUrl(String picUrl)
  {
    this.PicUrl = picUrl;
  }
}
