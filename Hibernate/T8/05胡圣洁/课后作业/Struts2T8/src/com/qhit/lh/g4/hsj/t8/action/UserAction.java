package com.qhit.lh.g4.hsj.t8.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.hsj.t8.bean.User;
import com.qhit.lh.g4.hsj.t8.service.BaseService;
import com.qhit.lh.g4.hsj.t8.service.impl.BaseServiceImpl;

/**
 * @author 胡圣洁
 * TODO
 * 2017年12月8日下午10:28:22
 * 保存数据
 * 处理业务
 */
public class UserAction extends ActionSupport {
	private BaseService baseService = new BaseServiceImpl();
	private User user;
	private List<User> users;
	
	private File uploadPhoto;
	
	private String uploadPhotoFileName;
	private String uploadPhotoContentType;
	
	public String login(){
		user = baseService.doLogin(user.getUserName(), user.getUserPassword());
		if(user != null){
			ServletActionContext.getRequest().getSession().setAttribute("user", user);
		}else{
			super.addFieldError("loginFail", "账户密码错误！");
			return "loginFail";
		}
		return "loginSuccess";
	}
	public String getAll(){
		users = baseService.queryAll(user);
		return "listSuccess";
	}
	
	public String upload(){
		if (uploadPhoto != null) {
			try {
				//1,读取上传文件的输入流
				InputStream is = new FileInputStream(uploadPhoto);
				//2,得到文件保存的路径
				String savePath = ServletActionContext.getServletContext().getRealPath("/")+ "upload/";
				File file = new File(savePath);
				//先创建文件夹
				if(!file.exists()){
					file.mkdirs();
				}
				//获取并设置相对路径
				user.setPic("upload/" + uploadPhotoFileName);
				//3,保存到服务器，将上传的内容写入到savePath路径的文件中
				OutputStream os = new FileOutputStream(savePath + "/" + uploadPhotoFileName);
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
	public String add(){
		baseService.add(user);
		return "addSuccess";
	}
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public File getUploadPhoto() {
		return uploadPhoto;
	}
	public void setUploadPhoto(File uploadPhoto) {
		this.uploadPhoto = uploadPhoto;
	}
	public String getUploadPhotoFileName() {
		return uploadPhotoFileName;
	}
	public void setUploadPhotoFileName(String uploadPhotoFileName) {
		this.uploadPhotoFileName = uploadPhotoFileName;
	}
	public String getUploadPhotoContentType() {
		return uploadPhotoContentType;
	}
	public void setUploadPhotoContentType(String uploadPhotoContentType) {
		this.uploadPhotoContentType = uploadPhotoContentType;
	}

	
}
