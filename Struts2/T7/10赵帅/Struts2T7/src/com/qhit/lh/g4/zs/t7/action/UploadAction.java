/**
 * 
 */
package com.qhit.lh.g4.zs.t7.action;

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
 * @author 赵帅
 *TODO
 *2017年12月5日下午3:18:53
 */
public class UploadAction extends ActionSupport{
	//设置属性
	private String name;
	private File uploadfile;
	private String uploadfileFileName;
	private String uploadfileContentType;

	public String upload(){
		if(uploadfile != null){
			try {
				//上传文件
				InputStream is = new FileInputStream(uploadfile);
				//保存路径
				String savePath = ServletActionContext.getServletContext().getRealPath("/")+"/upload";
				File file = new File(savePath);
				if(!file.exists()){
					file.mkdirs();
					//保存服务器
					OutputStream os = new FileOutputStream(savePath+"/"+uploadfileFileName);
					//写入数据
					byte[] buffer = new byte[8096];
					int len = 0;
					while((len=is.read(buffer)) != -1){
						os.write(buffer, 0, len);
					}
				}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					super.addFieldError("uploadfile", "xxxxxxxxx");
				}
		}else {
			super.addFieldError("uploadfile", "xxxxxxx");
			return "input";
		}
			return"uploadSuccess";
		}
		
	}

