package com.qhit.lh.g4.syw.t7;

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
 * @author 盛亚伟
 *TODO
 *2017年12月5日下午3:02:30
 */
public class FileAction extends ActionSupport {
	//封装
	private String username;
	private File uploadFile;
	private String uploadfileFileName;
	private String uploadfileContentType;
	
	public String upload(){
		if (uploadFile != null) {
			try {
				//1，读取上传文件的输入流
				InputStream is = new FileInputStream(uploadFile);
				//2，得到文件保存的路径
				String savePath = ServletActionContext.getServletContext().getRealPath("/")+"upload/"+uploadfileFileName;
				//3,保存到服务器，将上传的内容写入的savePath的文件中
				OutputStream os = new FileOutputStream(savePath);
				//4,写入数据
				byte[] buffer = new byte[8096];
				int len = 0;
				while((len = is.read(buffer)) != -1){
					os.write(buffer, 0, len);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				super.addFieldError("uploadFile", "文件未找到！");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				super.addFieldError("uploadFile", "文件保存服务器失败！");
			}
		}else {
			super.addFieldError("uploadFile", "文件未找到！");
			return "input";
		}
		return "uploadSuccess";
	}
	
	//添加get，set方法，带参数的和不带参数的
	public FileAction(String username, File uploadFile,
			String uploadfileFileName, String uploadfileContentType) {
		super();
		this.username = username;
		this.uploadFile = uploadFile;
		this.uploadfileFileName = uploadfileFileName;
		this.uploadfileContentType = uploadfileContentType;
	}
	public FileAction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public File getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}
	public String getuploadfileFileName() {
		return uploadfileFileName;
	}
	public void setuploadfileFileName(String uploadfileFileName) {
		this.uploadfileFileName = uploadfileFileName;
	}
	public String getUploadfileContentType() {
		return uploadfileContentType;
	}
	public void setUploadfileContentType(String uploadfileContentType) {
		this.uploadfileContentType = uploadfileContentType;
	}
	
	
}
