/**
 * 
 */
package com.qhit.lh.g4.hsj.t7.action;

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
 * @author 胡圣洁
 *TODO
 *2017年12月5日下午2:57:43
 */
public class FileAction extends ActionSupport {
     private String username;
     private File uploadfile;
     private String uploadfileFileName;
     private String uploadfileContentType;
     
     public String upload(){
    	 if (uploadfile != null) {
			try {
				//1,读取上传文件的输入流
				InputStream is = new FileInputStream(uploadfile);
				//2,得到文件保存的路径
				String savePath = ServletActionContext.getServletContext().getRealPath("/")
						+ "upfile/" + uploadfileFileName;
				File file = new File(savePath);
				//先创建文件夹
				if(!file.exists()){
					file.mkdirs();
				}
				//3,保存到服务器，将上传的内容写入到savePath路径的文件中
				OutputStream os = new FileOutputStream(savePath + "/" + uploadfileFileName);
				//4,写入数据
				byte[] buffer = new byte[8096];
				int len = 0;
				while((len=is.read(buffer)) != -1){
					os.write(buffer, 0, len);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				super.addFieldError("uploadfile", "文件未找到！");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				super.addFieldError("uploadfile", "文件保存服务器失败！");
			}
		} else {
			super.addFieldError("uploadfile", "文件未找到！");
			return "input";
		}
    	 return "uploadSuccess";
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
