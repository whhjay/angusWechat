package org.angus.message.custorm;

import java.util.List;

/**
 * 发送图文消息（点击跳转到外链） 图文消息条数限制在8条以内，注意，如果图文数超过8，则将会无响应。 
 * @author angus
 *
 */
public class News{
		private List<Article> articles;

		public List<Article> getArticles() {
			return articles;
		}

		public void setArticles(List<Article> articles) {
			this.articles = articles;
		}
		
	}