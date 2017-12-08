/**
 * 
 */
package com.qhit.t7.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;


public class UploadAction extends ActionSupport {
	private String uname;
	//与上传有关的Action组件
	private File uploadfile;
	private String uploadfileFileName;
	private String uploadfileContentType;
	//与下载有关的Action组件
	private String downfile_name;
	private InputStream downfile_is;
	//处理上传的请求
	public String upload(){
		if (uploadfile != null) {
			try {
				//读取上传文件的输入流
				InputStream is = new FileInputStream(uploadfile);
				//得到文件路径
				String savePath = ServletActionContext.getServletContext().getRealPath("/") + "upfile";
				File file = new File(savePath);
				//先创建文件夹
				if(!file.exists()){
					file.mkdirs();
				}
				//保存到服务器中：将上传内容写到savePath的文件夹中
				OutputStream os = new FileOutputStream(savePath + "/" + uploadfileFileName);
				//写入数据
				byte[] buffer = new byte[8096];
				int len = 0;
				while ((len = is.read(buffer)) != -1) {
					os.write(buffer, 0, len);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				super.addFieldError("index", "文件创建失败");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				super.addFieldError("index", "文件上传失败");
			}
		}
		return "info";
	}
	//处理下载的请求
	public String download(){
		if(downfile_name != null){
			try {
				//得到文件路径
				String savePath = ServletActionContext.getServletContext().getRealPath("/") + "upfile/" + downfile_name;
				downfile_is = new FileInputStream(savePath);
				return "down";
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}
	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}
	/**
	 * @return the uploadfile
	 */
	public File getUploadfile() {
		return uploadfile;
	}
	/**
	 * @param uploadfile the uploadfile to set
	 */
	public void setUploadfile(File uploadfile) {
		this.uploadfile = uploadfile;
	}
	/**
	 * @return the uploadfileFileName
	 */
	public String getUploadfileFileName() {
		return uploadfileFileName;
	}
	/**
	 * @param uploadfileFileName the uploadfileFileName to set
	 */
	public void setUploadfileFileName(String uploadfileFileName) {
		this.uploadfileFileName = uploadfileFileName;
	}
	/**
	 * @return the uploadfileContentType
	 */
	public String getUploadfileContentType() {
		return uploadfileContentType;
	}
	/**
	 * @param uploadfileContentType the uploadfileContentType to set
	 */
	public void setUploadfileContentType(String uploadfileContentType) {
		this.uploadfileContentType = uploadfileContentType;
	}
	public String getDownfile_name() {
		return downfile_name;
	}
	public void setDownfile_name(String downfile_name) {
		this.downfile_name = downfile_name;
	}
	public InputStream getDownfile_is() {
		return downfile_is;
	}
	public void setDownfile_is(InputStream downfile_is) {
		this.downfile_is = downfile_is;
	}
	
}
