package org.angus.renturn;

public class RetrunCodeUtil {
	public static String getReturnMsg(int code){
		String result = "";
		switch (code) {
		case -1:
			result =  "系统繁忙，此时请开发者稍候再试 ";
			break;
		case 0:
			result =  "请求成功";
			break;
		case 40001:
			result =  "获取access_token时AppSecret错误，或者access_token无效。请开发者认真比对AppSecret的正确性，或查看是否正在为恰当的公众号调用接口 ";
			break;
		case 40002:
			result =  "不合法的凭证类型";
			break;
		case 40003:
			result =  "不合法的OpenID，请开发者确认OpenID（该用户）是否已关注公众号，或是否是其他公众号的OpenID";
			break;
		case 40004:
			result =  "不合法的媒体文件类型";
			break;
		case 40005:
			result =  "不合法的文件类型";
			break;
		case 40006:
			result =  "不合法的文件大小";
			break;
		case 40007:
			result =  "不合法的媒体文件id";
			break;
		case 40008:
			result =  "不合法的消息类型";
			break;
		case 40009:
			result =  "不合法的图片文件大小";
			break;
		case 40010:
			result =  "不合法的语音文件大小";
			break;
		case 40011:
			result =  "不合法的视频文件大小";
			break;
		case 40012:
			result =  "不合法的缩略图文件大小";
			break;
		case 40013:
			result =  "不合法的AppID，请开发者检查AppID的正确性，避免异常字符，注意大小写";
			break;
		case 40014:
			result =  "不合法的access_token，请开发者认真比对access_token的有效性（如是否过期），或查看是否正在为恰当的公众号调用接口";
			break;
		case 40015:
			result =  "不合法的菜单类型";
			break;
		case 40016:
			result =  "不合法的按钮个数";
			break;
		case 40017:
			result =  "不合法的按钮个数 ";
			break;
		case 40018:
			result =  "不合法的按钮名字长度";
			break;
		case 40019:
			result =  "不合法的按钮KEY长度";
			break;
		case 40020:
			result =  "不合法的按钮URL长度 ";
			break;
		case 40021:
			result =  "不合法的菜单版本号";
			break;
		case 40022:
			result =  "不合法的子菜单级数";
			break;
		case 40023:
			result =  "不合法的子菜单按钮个数 ";
			break;
		case 40024:
			result =  "不合法的子菜单按钮类型";
			break;
		case 40025:
			result =  "不合法的子菜单按钮名字长度";
			break;
		case 40026:
			result =  "不合法的子菜单按钮KEY长度";
			break;
		case 40027:
			result =  "不合法的子菜单按钮URL长度";
			break;
		case 40028:
			result =  "不合法的自定义菜单使用用户";
			break;
		case 40029:
			result =  "不合法的oauth_code";
			break;
		case 40030:
			result =  "不合法的refresh_token";
			break;
		case 40031:
			result =  "不合法的openid列表";
			break;
		case 40032:
			result =  "不合法的openid列表长度";
			break;
		case 40033:
			result =  "不合法的请求字符，不能包含\\uxxxx格式的字符";
			break;
		case 40035:
			result =  "不合法的参数";
			break;
		case 40038:
			result =  "不合法的请求格式";
			break;
		case 40039:
			result =  "不合法的URL长度";
			break;
		case 40050:
			result =  "不合法的分组id";
			break;
		case 40051:
			result =  "分组名字不合法";
			break;
		}
		return result;
	}
}
