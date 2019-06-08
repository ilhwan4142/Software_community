/**
 * �??? ???? ??�? ?��?��?��??��?��?? ?��?? Action
 */
package com.board.action;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.board.beans.board;
import com.board.controller.CommandAction;
import com.mysql.cj.protocol.Resultset;
 
public class WriteAction implements CommandAction {
 
    public String requestPro(HttpServletRequest request,
 
    HttpServletResponse response) throws Throwable {
    	
    	request.setCharacterEncoding("euc-kr");
    	//??목과 ?��?��?? ???? �??? �????? ????
    	String subject = request.getParameter("subject");
    	String content = request.getParameter("content");
    	String category = request.getParameter("category");
    	
    	String id = null;
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
      				"insert into board1 values(NULL,?,?,?,now(),0,?)");
    				pstmt.setString(1, id);
    				pstmt.setString(2, subject);
    				pstmt.setString(3, content);
    				pstmt.setString(4, category);
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