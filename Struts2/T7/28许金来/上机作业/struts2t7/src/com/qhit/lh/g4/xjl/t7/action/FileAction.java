package com.qhit.lh.g4.xjl.t7.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.Servlet;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
/**
 * @author 许金来
 *2017年12月5日下午3:20:04
 *struts2的文件上传和下载
 */
public class FileAction extends ActionSupport {


	private String username;
	private File uploadfile;
	private String uploadfileFileName;
	private String uploadfileContentType;

	public String upload(){
		if(uploadfile != null){
			
			try {
				//1,读取上传文件的输入流
				InputStream is = new FileInputStream(uploadfile);
				//2,得到文件保存路径
				String savaPath = ServletActionContext.getServletContext().getRealPath("/")+"upload";
				File file = new File(savaPath);
				//先创建文件夹
				if(!file.exists()){
					file.mkdirs();

				}
				//3,保存到服务器，将上传的内容写入到savaPath文件中
				OutputStream os = new FileOutputStream(savaPath+"/"+uploadfileFileName);
				//4,写入数据
				byte[] buffer = new byte[8096];
				int len = 0;
				try {
					while((len=is.read(buffer))!= -1){
						os.write(buffer, 0, len);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					super.addFieldError("uploadfile", "文件未找到");
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				super.addFieldError("uploadfile", "文件保存服务器失败");
			}


		}else{
			super.addFieldError("uploadfile","文件未找到");
			return "input";
		}
		return "success";
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
