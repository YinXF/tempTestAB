package com.example.temptestab;

public class Contants {
	public static final String BASE_URL = "http://115.29.141.148/testab/user/login";
	//public static final String BASE_URL = "http://192.168.1.106:8080/MO/";
	//public static final String BASE_URL = "http://192.168.1.104:8080/MO/";
	//public static final String BASE_URL = "http://moco-channel.com:7575/";
	public static final String URL_GETCATALOGLIST = "index_mobile.jspx?action=getCatalogList";
	public static final String URL_GETSUBCATALOGLIST = "catalog_mobile.jspx?catalog_id=";
	public static final String URL_GETSUBCATALOGLISTV2 = "catalog_mobile_v2.jspx?catalog_id=";
	public static final String URL_NEWSLIST = "content_mobile.jspx?action=getNews&catalog_id=";
	public static final String URL_NEWSEASONLIST = "content_mobile.jspx?action=getNewSeason&catalog_id=";
	public static final String URL_NEWSEASONLISTV2 = "content_mobile_v5.jspx?action=getNewSeason&content_id=";
	public static final String URL_LOGINMOBILE = "login_mobile.jspx?version=1.1.5&username=";
	public static final String URL_GETFAV = "favorite_mobile.jspx?UID=";
	public static final String URL_ISFAV = "member/collect_exist_mobile.jspx?content_id=";
	public static final String URL_SETFAV = "member/collect_mobile.jspx?content_id=";
	public static final String URL_CONTENTS = "content_mobile_v3.jspx?catalog_id=";
	public static final String URL_IMAGECONTENT = "content_mobile_v2.jspx?catalog_id=";
	public static final String URL_PRODUCT = "content_mobile.jspx?action=getProduct&catalog_id=";
	public static final String URL_PRODUCTV2 = "content_mobile_v6.jspx?action=getProduct&catalog_id=";
	public static final String URL_VIDEOLIST = "content_mobile_v4.jspx?catalog_id=";
	public static final String URL_WEIBOLIST = "weibo_mobile_android.jspx?action=getLatest";
	public static final String URL_READCONTENT = "content_read_mobile.jspx?content_id=";
	public static final String URL_USERINFO = "member/member_mobile.jspx?UID=";
	public static final String URL_MODPASSWD = "member/chpwd_mobile.jspx?UID=";
	public static final String URL_UPLOAD = "member/o_upload_weiboimage.jspx";
	public static final String URL_SAVEWEIBO = "member/contribute_save.jspx?title=";
	public static final String URL_GETPRESENT = "content_mobile.jspx?action=getPresent&catalog_id=";
	public static final String URL_GETPRESENTV2 = "content_mobile_v6.jspx?action=getPresent&catalog_id=";
	public static final String URL_SEARCH = "mobile_search.jspx?queryString=";
	public static final String URL_INTRODUCTION = "http://moco-channel.com:7575/introduction/introduction.html";
	public static final String URL_UPDATEUNAME = "modify_userinfo_mobile.jspx?realname=";
	public static final String URL_UPDATEUNOTE = "modify_userinfo_mobile.jspx?intro=";
	public static final String URL_UPDATEUIMG = "modify_userinfo_mobile.jspx?fileUrl=";
	public static boolean isLogin = false;
	public static String fileContent = "";
	
	public static final int NEWSVIEWACTIVITY = 1000;
	public static final int CONTENTSVIEWACTIVITY = 1001;
	public static final int IMAGEVIEWACTIVITY = 1002;
	public static final int VIDEOLISTACTIVITY = 1003;
	public static final int IMAGECONTENTACTIVITY = 1004;
	public static final int WEIBOACTIVITY = 1005;
	public static final int LOGINACTIVITY = 1006;
	public static final int FAVACTIVITY = 1007;
	public static final int WEIBOUSERACTIVITY = 1008;
	public static final int SETTINGACTIVITY = 1009;
	public static final int MODPASSWD = 1010;
	public static final int FAVSEARCHCONTENTSVIEWACTIVITY = 1011;
	public static final int FAVSEARCHIMAGESVIEWACTIVITY = 1012;
	public static final int FAVSEARCHIMAGEVIEWACTIVITY = 1013;
	public static final int SEARCHCONTENTSVIEWACTIVITY = 1014;
	public static final int SEARCHIMAGESVIEWACTIVITY = 1015;
	public static final int SEARCHIMAGEVIEWACTIVITY = 1016;
	public static final int MAINACTIVITY = 1017;
	public static final int PRODUCTSACTIVITY = 1018;
	public static final int PRODUCTSCATALOGSACTIVITY = 1019;
	public static final int PERSONALSETTINGSACTIVITY = 1020;
	public static final int WEIBOUSERACTIVITYMODNAME = 10081;
    public static final int WEIBOUSERACTIVITYMODNOTES = 10082;
	
	public static final int CAPTURE_CODE = 1014;
	public static final int IMAGE_CODE = 1015;
	public static final int CAPTURE_CROP = 10151;
	public static final int IMAGE_CROP = 10152;
	public static final int SENDWEIBO_IMAGE_CODE = 10153;
	
	public static class Config {
		public static final boolean DEVELOPER_MODE = false;
	}
	
	public static class Extra {
		public static final String IMAGES = "com.nostra13.example.universalimageloader.IMAGES";
		public static final String IMAGE_POSITION = "com.nostra13.example.universalimageloader.IMAGE_POSITION";
	}

}
