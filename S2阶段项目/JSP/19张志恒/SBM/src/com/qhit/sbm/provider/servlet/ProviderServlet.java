/**
 * 
 */
package com.qhit.sbm.provider.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qhit.sbm.provider.bean.Provider;
import com.qhit.sbm.provider.service.ProviderService;
import com.qhit.sbm.provider.service.impl.ProviderServiceImpl;

/**
 * @author admin
 * 2017年11月11日
 */
public class ProviderServlet extends HttpServlet {
	private ProviderService providerService = new ProviderServiceImpl();

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		switch (cmd) {
		case "getProvider":
			getProvider(request, response);
			break;
		case "addProvider":
			addProvider(request, response);
			break;

		default:
			break;
		}
	}

	private void addProvider(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String providerName = (String)request.getAttribute("providerName");
		String providerDetail = (String) request.getAttribute("providerDetail");
		String contact = (String)request.getAttribute("contact");
		String telephone = (String)request.getAttribute("telephone");
		String facsimile = (String)request.getAttribute("facsimile");
		String address = (String)request.getAttribute("address");
		
		Provider provider = new Provider(
				providerName, 
				providerDetail,
				contact,
				telephone,
				facsimile, 
				address
				);
		
		int row = providerService.addProvider(provider);
		PrintWriter out = response.getWriter();
		if(row > 0){
			//添加成功:重新查询添加后的供应商列表，然后进入到供应商列表分页页面
			out.print("<script>alert('添加用户成功!');</script>");
			response.sendRedirect("jsp/providerAdmin.jsp");
		}else{
			//添加失败
			out.print("<script>alert('添加供应商失败!');</script>");
		}
	}

	/**
	 * @param request
	 * @param response
	 * 查询所有的供应商
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void getProvider(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Provider> list = providerService.getProvider();
		
		request.setAttribute("providers", list);
		//查询完所有的供应商之后再去进入到添加账单的页面
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/modify.jsp");
		requestDispatcher.forward(request, response);
	}

}
