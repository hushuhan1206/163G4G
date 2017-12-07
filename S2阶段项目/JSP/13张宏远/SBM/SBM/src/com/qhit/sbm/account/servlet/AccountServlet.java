/**
 * 
 */
package com.qhit.sbm.account.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qhit.sbm.account.service.AccountService;
import com.qhit.sbm.account.service.impl.AccountServiceImpl;
import com.qhit.sbm.common.bean.PageBean;
import com.qhit.sbm.common.service.CommonService;
import com.qhit.sbm.common.service.impl.CommonServiceImpl;

/**
 * @author admin
 * 2017年11月11日
 */
public class AccountServlet extends HttpServlet {
	private CommonService cService = new CommonServiceImpl();
	private AccountService aService = new AccountServiceImpl();

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
		case "getPagebean":
			getPagebean(request, response);
			break;
		case "getPagebeanByParam":
			getPagebeanByParam(request, response);
			break;

		default:
			break;
		}
	}

	/**
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void getPagebeanByParam(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		List<String> wheres = new ArrayList<>();
		List<String> values = new ArrayList<>();

		String productName = request.getParameter("productName");
		String isPayed = request.getParameter("isPayed");

		if(productName != null && productName != ""){
			wheres.add("goodsName");
			values.add(productName);
		}
		if(isPayed != null && isPayed != ""){
			wheres.add("isPayed");
			values.add(isPayed);
		}

		/**
		 * pagesize:5
		 * data:实例化
		 * count：有
		 * pagetotal：有
		 * p：
		 * */
		PageBean pageBean = new PageBean();

		//先获取count
		int count = aService.getCount(wheres, values);
		//设置count的值，同时也设置pagetotal的值
		pageBean.setCount(count);
		//设置p的值
		String p = request.getParameter("p");

		if(p != null && p != ""){
			pageBean.setP(Integer.parseInt(p));
		}else{
			pageBean.setP(1);
		}
		/**
		 * 然后再去求当前页的数据结合
		 * */
		pageBean = aService.getAccount(pageBean, wheres, values);

		request.getSession().setAttribute("pageBean", pageBean);

		//更新子窗口视图
		PrintWriter out = response.getWriter();
		out.print("<script>location.href='jsp/admin_bill_list.jsp'</script>");

	}

	/**
	 * @param request
	 * @param response.
	 * 账单列表的分页查询功能
	 * @throws IOException 
	 */
	private void getPagebean(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		/**
		 * pagesize:5
		 * data:实例化
		 * count：有
		 * pagetotal：有
		 * p：
		 * */
		PageBean pageBean = new PageBean();
		//先获取count
		int count = cService.getCount("tb_account", null, null);
		//设置count的值，同时也设置pagetotal的值
		pageBean.setCount(count);
		//设置p的值
		String p = request.getParameter("p");

		if(p != null && p != ""){
			pageBean.setP(Integer.parseInt(p));
		}else{
			pageBean.setP(1);
		}
		/**
		 * 然后再去求当前页的数据结合
		 * */
		pageBean = aService.getAccount(pageBean);

		request.getSession().setAttribute("pageBean", pageBean);

		if(p != null && p != ""){
			//
			PrintWriter out = response.getWriter();
			out.print("<script>location.href='jsp/admin_bill_list.jsp'</script>");
		}else{
			//说明第一次进入
			response.sendRedirect("jsp/admin_index.jsp");
		}
	}

}
