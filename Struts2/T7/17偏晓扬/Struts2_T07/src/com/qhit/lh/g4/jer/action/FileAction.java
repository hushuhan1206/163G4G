package com.qhit.lh.g4.jer.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileAction extends ActionSupport {
	private String usernames;
	private File uploadFile;
	
	private String uploadFileName;
	private String uploadFileContentType;
	/**
	 * @author 偏晓扬
	 *TODO
	 *${date}下午5:10:55
	 */
	public String upload(){
		if (uploadFile != null) {
			try {
				InputStream is = new FileInputStream(uploadFile);
				String sac = ServletActionContext.getServletContext().getRealPath("/")+"upload/"+uploadFileName;
				File file = new File(sac);
				if (!file.exists()) {
					file.createNewFile();
				}
				OutputStream os = new FileOutputStream(sac+"/"+uploadFileName);
				byte [] buffer = new byte[8096];
				int len = 0;
				while ((len = is.read(buffer)) != -1 ) {
					os.write(buffer, 0, len);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				super.addFieldError("uploadFile", "文件未找到！");
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				super.addFieldError("uploadFile", "文件保存服务器失败！");
			}
		}
		return "uploadSuccess";
	}
}
