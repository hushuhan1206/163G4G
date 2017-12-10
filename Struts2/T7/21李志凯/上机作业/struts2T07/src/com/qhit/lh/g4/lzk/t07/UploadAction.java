/**
 * 
 */
package com.qhit.lh.g4.lzk.t07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 李志凯
 * TODO 
 * 2017年12月6日下午3:14:19
 */
public class UploadAction extends ActionSupport {
	private String username;
	
	//与文件上传有关的三个属性
	private File uploadfile;
	private String uploadfileFileName;
	private String uploadfileContentType;
	
	//与下载有关的属性
	private String downfile_name;
	private InputStream downfile_is;
	
	public String upload(){
		if(uploadfile!=null) {
			try {
				InputStream is=new FileInputStream(uploadfile);

				String destfile = ServletActionContext.getServletContext().getRealPath("/")+uploadfileFileName;
				OutputStream os = new FileOutputStream(destfile);
				
				byte[] buffer = new byte[8096];
				int len = 0;
				while((len=is.read(buffer))!=-1) {
					os.write(buffer,0,len);
				}
				is.close();
				os.flush();
				os.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return "info";
	}
	
	public String download() {
		if(downfile_name!=null) {
			
			try {
				String destfile = ServletActionContext.getServletContext().getRealPath("/")+downfile_name;
				downfile_is = new FileInputStream(destfile);
				
				return "down";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return null;
	}
	/**
	 * @return the downfile_name
	 */
	public String getDownfile_name() {
		return downfile_name;
	}
	/**
	 * @param downfile_name the downfile_name to set
	 */
	public void setDownfile_name(String downfile_name) {
		this.downfile_name = downfile_name;
	}
	/**
	 * @return the downfile_is
	 */
	public InputStream getDownfile_is() {
		return downfile_is;
	}
	/**
	 * @param downfile_is the downfile_is to set
	 */
	public void setDownfile_is(InputStream downfile_is) {
		this.downfile_is = downfile_is;
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
