package org.angus.message.custorm;

/**
 * 客服消息类
 * @author angus
 *
 */
public class CustormMessage {
	private String touser;//普通用户openid
	private String msgtype;//消息类型，文本为text，图片为image，语音为voice，视频消息为video，音乐消息为music，图文消息（点击跳转到外链）为news，图文消息（点击跳转到图文消息页面）为mpnews，卡券为wxcard
	private Text text;//发送文本消息
	private Image image;//发送图片消息
	private Voice voice;//发送语音消息
	private Video video;//发送视频消息
	private Music music;//发送音乐消息
	private News news;//发送图文消息（点击跳转到外链） 图文消息条数限制在8条以内，注意，如果图文数超过8，则将会无响应。
	private Mpnews mpnews;//发送图文消息（点击跳转到图文消息页面） 图文消息条数限制在8条以内，注意，如果图文数超过8，则将会无响应。
	private CustomService customservice;//以某个客服帐号来发消息
	private WxCard wxcard;//发送卡券
	
	
	
	public String getTouser() {
		return touser;
	}



	public void setTouser(String touser) {
		this.touser = touser;
	}



	public String getMsgtype() {
		return msgtype;
	}



	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}



	public Text getText() {
		return text;
	}



	public void setText(Text text) {
		this.text = text;
	}



	public Image getImage() {
		return image;
	}



	public void setImage(Image image) {
		this.image = image;
	}



	public Voice getVoice() {
		return voice;
	}



	public void setVoice(Voice voice) {
		this.voice = voice;
	}



	public Video getVideo() {
		return video;
	}



	public void setVideo(Video video) {
		this.video = video;
	}



	public Music getMusic() {
		return music;
	}



	public void setMusic(Music music) {
		this.music = music;
	}



	public News getNews() {
		return news;
	}



	public void setNews(News news) {
		this.news = news;
	}



	public Mpnews getMpnews() {
		return mpnews;
	}



	public void setMpnews(Mpnews mpnews) {
		this.mpnews = mpnews;
	}



	public CustomService getCustomservice() {
		return customservice;
	}



	public void setCustomservice(CustomService customservice) {
		this.customservice = customservice;
	}



	public WxCard getWxcard() {
		return wxcard;
	}



	public void setWxcard(WxCard wxcard) {
		this.wxcard = wxcard;
	}



	public enum Msgtype{
		TEXT("text"),
		IMAGE("image"),
		VOICE("voice"),
		VIDEO("video"),
		Music("music"),
		NEWS("news"),
		MP_NEWS("mpnews"),
		WXCARD("wxcard")
		;
		public String value;
		private Msgtype(String value){
			this.value = value;
		}
	}
}
