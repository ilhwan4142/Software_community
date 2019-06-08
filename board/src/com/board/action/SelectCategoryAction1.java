/**
 * ���� �ۼ� �ϰ� �����ͺ��̽��� �ִ� Action
 */
package com.board.action;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.board.beans.board;
import com.board.controller.CommandAction;
import com.mysql.cj.protocol.Resultset;
 
public class SelectCategoryAction1 implements CommandAction {
 
    public String requestPro(HttpServletRequest request,
 
    HttpServletResponse response) throws Throwable {
    	
    	request.setCharacterEncoding("euc-kr");
    	//����� ������ �Է� �޾� ������ ����
    	String content = request.getParameter("content");
    	
    	String id = null;
    	String query=null;
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection conn = null;    	
    	Statement stmt = null;
    	ResultSet rs = null;
    	
    	try{
    		HttpSession session = request.getSession();
    		//������ �о� �α��� ���°� �ƴϸ� �α��� â���� �̵�
        	id = (String) session.getAttribute("id");
    		if( id == null){
    			return "loginerror.jsp";
    		}
    		
    		String jdbcDriver = "jdbc:mysql://localhost:3306/jspdb?serverTimezone=UTC";
    		          // +
						//		"useUnicode=true&characterEncoding = euc-kr";
			String dbUser = "root";
			String dbPass = "root";
			conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
			stmt = conn.createStatement();    	
			 query = "SELECT * FROM comment1 WHERE num = (SELECT max(num) FROM comment1);";					
			rs = stmt.executeQuery(query);
			//ArrayList<board> articleList = new ArrayList<board>();    		
    		int article = 0;
    		while(rs.next()){
    			article=rs.getInt("category");		
    		}
    		request.setAttribute("article",article);
    				
    		
    	} catch(SQLException ex){
			ex.printStackTrace();
		}finally{
			
    		if(stmt != null) try{stmt.close();} catch(SQLException ex){}
    		if(conn != null) try{conn.close();} catch(SQLException ex){}
    		}
    


    	//return "SelectCategoryAction.java";
        return "write.jsp";
 
    }
 
}