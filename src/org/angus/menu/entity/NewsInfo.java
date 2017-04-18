package org.angus.menu.entity;

import java.util.List;

/**
 * 图文消息
 * @author angus
 *
 */
public class NewsInfo {
	public List<NewsInfo> list;//图文消息的信息
	public String title;//图文消息的标题 
	public String author;//作者
	public String digest;//摘要 
	public Integer show_cover;//是否显示封面，0为不显示，1为显示
	public String cover_url;//封面图片的URL
	public String content_url;//正文的URL 
	public String source_url;//原文的URL，若置空则无查看原文入口 
	public List<NewsInfo> getList() {
		return list;
	}
	public void setList(List<NewsInfo> list) {
		this.list = list;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDigest() {
		return digest;
	}
	public void setDigest(String digest) {
		this.digest = digest;
	}
	public Integer getShow_cover() {
		return show_cover;
	}
	public void setShow_cover(int show_cover) {
		this.show_cover = show_cover;
	}
	public String getCover_url() {
		return cover_url;
	}
	public void setCover_url(String cover_url) {
		this.cover_url = cover_url;
	}
	public String getContent_url() {
		return content_url;
	}
	public void setContent_url(String content_url) {
		this.content_url = content_url;
	}
	public String getSource_url() {
		return source_url;
	}
	public void setSource_url(String source_url) {
		this.source_url = source_url;
	}
	
	
}
