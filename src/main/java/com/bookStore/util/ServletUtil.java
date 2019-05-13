package com.bookStore.util;

import java.io.File;

public class ServletUtil {
	
	public static final String ERROR_MESSAGE = "errorMsg";
	public static final String LOGIN_USER = "loginUser";
	
	public static final String LOGIN_ADMIN = "loginAdmin";
	public static final String PicPath = "picPath";
	
	public static final String VIRTUAL_UPLOAD_DIR ="/upload/";

	public static String UPLOAD_DIR;   //文件的路径   ，在项目加载时给予赋值
	
	public static String DEPLOY_NAME;
	
	public static File getUploadFile(String fileName){
		File file = new File(UPLOAD_DIR,fileName);  //上传文件
		
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();  //如果不存在，则创建
		}
		return file;
	}

}
