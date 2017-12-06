/**
 * 
 */
package com.qhit.lh.g4.whw.t7;

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
 * @author 王虎威
 * TODO
 * 2017年12月5日下午3:29:34
 */
public class UploadFile extends ActionSupport {
	private String username;
	//上传文件的三个属性
	private File uploadfile;
	private String  uploadfileFileName;
	private String  uploadfileContentType;
	
	//处理上传文件的方法
	/**
	 * @return the username
	 */
	public String upload(){
		if(uploadfile != null){
			try {
				//1读取文件上传的输入流
				InputStream is = new FileInputStream(uploadfile);
				//2得到文件保存路径
				String savePath = ServletActionContext.getServletContext().getRealPath("/")+"upload";
				File file = new File(savePath);
				if(!file.exists()){
					file.mkdirs();
				}
				//3保存到服务器：文件写入savePath的文件中
				OutputStream os = new FileOutputStream(savePath+"/"+uploadfileFileName);
				//4写入数据
				byte[] buffer =new byte[8096];
				int len = 0;
				while((len=is.read(buffer)) != -1){
					os.write(buffer,0,len);
				
					}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				super.addFieldError("uploadfile", "文件未找到");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				super.addFieldError("uploadfile", "文件保存服务器失败");
			}
		}else{
			super.addActionError("uploadfile");
			return "input";
			
		}
		return "uploadSuccess";
}

	/**
	 * 
	 */
	public UploadFile() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
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
	 * @param username
	 * @param uploadfile
	 * @param uploadfileFileName
	 * @param uploadfileContentType
	 */
	public UploadFile(String username, File uploadfile,
			String uploadfileFileName, String uploadfileContentType) {
		super();
		this.username = username;
		this.uploadfile = uploadfile;
		this.uploadfileFileName = uploadfileFileName;
		this.uploadfileContentType = uploadfileContentType;
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
	}
