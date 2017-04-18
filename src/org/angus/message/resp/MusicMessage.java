package org.angus.message.resp;

/**
 * 音频消息类
 * @author angus
 *
 */
public class MusicMessage
  extends BaseMessage
{
  private Music Music;
  
  public Music getMusic()
  {
    return this.Music;
  }
  
  public void setMusic(Music music)
  {
    this.Music = music;
  }
}
