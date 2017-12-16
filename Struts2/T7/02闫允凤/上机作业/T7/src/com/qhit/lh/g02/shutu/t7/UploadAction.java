/**
 * 
 */
package com.qhit.lh.g02.shutu.t7;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author shutu
 * TODO
 *下午2:45:432017年12月5日
 */
public class UploadAction extends ActionSupport {
    private String username;
    
    //上传文件有关的三个属性
    private File uploadfile;
    private String uploadfileFileName;
    private String uploadfileContentType;
    
    public String upload() {
    	//与下载有关的属性
    		String downfile_name;
        	String downfile_is;
			return uploadfileFileName;  		
	}
    public String download() {
		return uploadfileContentType;
    	 }	
}
