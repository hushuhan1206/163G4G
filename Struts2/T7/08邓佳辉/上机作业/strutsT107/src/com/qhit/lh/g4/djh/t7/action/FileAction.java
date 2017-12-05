/**
 * 
 */
package com.qhit.lh.g4.djh.t7.action;

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
 * @author 邓佳辉
 *TODO
 *2017年12月5日下午3:01:31
 */
public class FileAction extends ActionSupport {

	//封装属性
	private String username;
	private File uploadFile;
	private String uploadFileFileName;
	private String uploadFileContentType;
	
//**********************************************
	
	//处理文件上传的方法
	public String upload(){
		if(uploadFile != null){
			try {
				//读取上传文件的输入流
				InputStream is = new FileInputStream(uploadFile);
				//获取文件保存的路径
				String path = ServletActionContext.getServletContext().getRealPath("/")+"upload/"+uploadFileFileName;
				//将上传的内容保存到path中
				OutputStream os = new FileOutputStream(path);
				//写入数据
				byte[] buffer = new byte[8096];
				int leng = 0;
				while((leng = is.read(buffer)) != -1){
					os.write(buffer, 0, leng);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				super.addFieldError("uploadFile", "文件未找到");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				super.addFieldError("uploadFile", "文件未保存成功");
			}
		}else{
			super.addFieldError("uploadFile", "文件未找到");
			return "input";
		}
		return "uploadSuccess";
	}
//**********************************************	
	//添加get、set、带参数、不带参数的方法
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
	public String getUploadFileFileName() {
		return uploadFileFileName;
	}
	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}
	public String getUploadFileContentType() {
		return uploadFileContentType;
	}
	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}
	
	
}

