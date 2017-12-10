/**
 * 
 */
package com.qhit.lh.g4.sea.sbm.user.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.sea.sbm.user.bean.User;
import com.qhit.lh.g4.sea.sbm.user.service.UserService;
import com.qhit.lh.g4.sea.sbm.user.service.impl.UserServiceImpl;

/**
 * @author 李海洋
 *TODO
 *2017年12月8日下午5:08:08
 */
public class UserAction extends ActionSupport {
	
	//保存User数据
	private User user;
	private List<User> users;
	
	private File uploadfile;//包含文件内容
	private String uploadfileFileName;//上传文件的名称
	private String uploadfileContentType;//上传文件的MIME类型
	
	private UserService userService = new UserServiceImpl();
	
	public String login(){
		user = userService.doLogin(user.getUserName(), user.getUserPassword());
		if(user !=null){
			ServletActionContext.getRequest().getSession().setAttribute("user", user);
		}else{
			super.addActionError("账户名或密码错误！！");
		}
		return "loginSuccess";
	}
	
	public String upload() {
		//首先判断文件是否为空
		if (uploadfile != null) {
			//读取上传文件的输入流
			try {
				InputStream is = new FileInputStream(uploadfile);
				//得到保存路径
				String path = ServletActionContext.getServletContext().getRealPath("/")+"upload";
				File file = new File(path);
				//创建文件夹
				if (!file.exists()) {
					file.mkdirs();
				}
				//设置相对路径
				user.setPic("upload/"+uploadfileFileName);
				OutputStream os = new FileOutputStream(path+"/"+uploadfileFileName);
				//写入数据
				byte[] buffer = new byte[1024];
				int len = 0;
				while ((len=is.read(buffer)) != -1) {
					os.write(buffer, 0, len);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return "uploadSuccess";
	}
	//修改文件
	public String updateUpload() {
		//首先判断文件是否为空
		if (uploadfile != null) {
			//读取上传文件的输入流
			try {
				InputStream is = new FileInputStream(uploadfile);
				//得到保存路径
				String path = ServletActionContext.getServletContext().getRealPath("/")+"upload";
				File file = new File(path);
				//创建文件夹
				if (!file.exists()) {
					file.mkdirs();
				}
				//设置相对路径
				user.setPic("upload/"+uploadfileFileName);
				OutputStream os = new FileOutputStream(path+"/"+uploadfileFileName);
				//写入数据
				byte[] buffer = new byte[1024];
				int len = 0;
				while ((len=is.read(buffer)) != -1) {
					os.write(buffer, 0, len);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return "updateUploadSuccess";
	}
	//添加
	public String add(){
		int row = userService.addUser(user);
		if(row>0){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
		return "tolist";
	}
	//删除
	public String delete(){
		int row = userService.deleteUser(user.getUserId());
		if(row>0){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
		return "tolist";
	}
	//修改
	public String update(){
		int row = userService.updateUser(user, user.getUserId());
		if(row>0){
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
		}
		return "tolist"; 
	}
	public String getAll() throws SQLException{
		users = userService.getAll();
		return "list";
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
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
