package com.bookStore.util;

import java.io.File;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class DataListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		String deployName = sce.getServletContext().getContextPath();
		ServletUtil.DEPLOY_NAME = deployName + "/";// 取到发布名
		sce.getServletContext().setAttribute("deployName", ServletUtil.DEPLOY_NAME);// 为了在页面使用
		ServletUtil.UPLOAD_DIR = sce.getServletContext().getRealPath(ServletUtil.VIRTUAL_UPLOAD_DIR)
				.replace(deployName.substring(1) + File.separator, "");// 文件上传目录
	}

	public void contextDestroyed(ServletContextEvent sce) {
	}

}
