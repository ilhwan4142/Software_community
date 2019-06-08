/**
 * db�� �����ϱ����� Ŀ�ؼ� ��ü �����ϴµ�, �̸� connection ��ü����� ������ ���°�. �پ��� ��ȯ
 */
package com.board.action;
 
import java.sql.*;
import java.util.ArrayList;
 


import javax.servlet.http.HttpServletRequest;
 
import javax.servlet.http.HttpServletResponse;
 
import javax.servlet.http.HttpSession;

import com.board.beans.comment;
import com.board.controller.CommandAction;
 
public class CommentWriteAction implements CommandAction {
	
	public String requestPro(HttpServletRequest request,
			 
		    HttpServletResponse response) throws Throwable {
		    	
		    	request.setCharacterEncoding("euc-kr");
		    	//??목과 ?��?��?? ???? �??? �????? ????
		    	
		    	String content = request.getParameter("content");
		    	
		    	String id=null;
		    	String query=null;
		    	Class.forName("com.mysql.cj.jdbc.Driver");
		    	
		    	Connection conn = null;
		    	PreparedStatement pstmt = null;
		    	ResultSet rs=null;
		    	
		    	try{
		    		HttpSession session = request.getSession();
		    		//?��???? ?��?? �?그�?? ????�? ????�? �?그�?? 창�?��? ?��??
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
					
		      		pstmt = conn.prepareStatement(      				
		      				"insert into comment1 values(NULL,?,?,now())");
		    				pstmt.setString(1, id);
		    				pstmt.setString(2, content);
		    				//쿼리 ?��??
		    				pstmt.executeUpdate();
		    			
		    				
		    				
		    	} catch(SQLException ex){
					ex.printStackTrace();
				}finally{
					
		    		if(pstmt != null) try{pstmt.close();} catch(SQLException ex){}
		    		if(conn != null) try{conn.close();} catch(SQLException ex){}
		    		}
		    

		    



		     //   return "write.jsp";
		        return  "category.do";
		    }
 
}