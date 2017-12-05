/**
 * 
 */
package com.qhit.lh.g4.sea.t7.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 李海洋
 *TODO文件上传与下载
 *2017年12月5日下午2:43:59
 */
public class FileAction extends ActionSupport {
	private String username;//上传文件的用户名

	private File uploadfile;//包含文件内容
	private String uploadfileFileName;//上传文件的名称
	private String uploadfileContentType;//上传文件的MIME类型
	
	private String downloadfileName;//下载文件的名称
	private FileInputStream downloadfile;
	public String upload() {
		//首先判断文件是否为空
		if (uploadfile != null) {
			//读取上传文件的输入流
			try {
				InputStream is = new FileInputStream(uploadfile);
				//得到保存路径
				String path = ServletActionContext.getServletContext().getRealPath("/")+"upload";
				File file = new File(path);
				//创建文件夹
				if (!file.exists()) {
					file.mkdirs();
				}
				OutputStream os = new FileOutputStream(path+"/"+uploadfileFileName);
				//写入数据
				byte[] buffer = new byte[8096];
				int len = 0;
				while ((len=is.read(buffer)) != -1) {
					os.write(buffer, 0, len);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				super.addFieldError(uploadfileFileName, "上传文件未找到");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				super.addFieldError(uploadfileFileName, "上传文件保存服务器失败");
			}

		}else {
			super.addFieldError(uploadfileFileName, "上传文件未找到");
			return "input";
		}
		return "success";
	}
//	private String  download() throws Exception{
//		if (downloadfileName!=null) {
//			String path = ServletActionContext.getServletContext().getRealPath("/upload")+downloadfileName;
//			downloadfile = new FileInputStream(path);
//			return "down";
//		}
//		return null;
//	}
	public String getDownloadfileName() {
		return downloadfileName;
	}
	public void setDownloadfileName(String downloadfileName) {
		this.downloadfileName = downloadfileName;
	}
	public FileInputStream getDownloadfile() {
		return downloadfile;
	}
	public void setDownloadfile(FileInputStream downloadfile) {
		this.downloadfile = downloadfile;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public File getUploadfile() {
		return uploadfile;
	}
	public void setUploadfile(File uploadfile) {
		this.uploadfile = uploadfile;
	}
	public String getUploadfileFileName() {
		return uploadfileFileName;
	}
	public void setUploadfileFileName(String uploadfileFileName) {
		this.uploadfileFileName = uploadfileFileName;
	}
	public String getUploadfileContentType() {
		return uploadfileContentType;
	}
	public void setUploadfileContentType(String uploadfileContentType) {
		this.uploadfileContentType = uploadfileContentType;
	}
}
