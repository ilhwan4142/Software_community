/**
 * ?��?��?? ????�????? ???��???? Action
 * 
 */
package com.login.action;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.board.controller.CommandAction;
 
public class JoinAction implements CommandAction {
 
    public String requestPro(HttpServletRequest request,
 
    HttpServletResponse response) throws Throwable {
    	
    	request.setCharacterEncoding("euc-kr");
    	
    	//loginform?��? �??? �??? ???��??? �?�?    	
		String id = request.getParameter("id");
    	String password = request.getParameter("password");
    	String name = request.getParameter("name");
    	String Snum = request.getParameter("Snum");
    	
    	//mysql ?��?��?��??��?��?? ???????? ?��???? ???��?��? ????
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	//?��?��?? �??��?? ?�결 �??? �??? ????
    	Connection conn = null;
    	PreparedStatement pstmt = null;    	
    	
    	try{ 		
        	
    		String jdbcDriver = "jdbc:mysql://localhost:3306/jspdb?serverTimezone=UTC"; 

			String dbUser = "root";
			String dbPass = "root";
    		
			//?��?��?��??��?��?? ?�결
			conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
    		
			//�? ??? ?��?��???? �????��?? ?��?��???.
      		pstmt = conn.prepareStatement(
    				"insert into usr values(?,?,?,?,now())");
    				pstmt.setString(1, id);
    				pstmt.setString(2, password);
    				pstmt.setString(3, name);
    				pstmt.setString(4, Snum);
    				
    		// pstmt?? ???��?? 쿼리 ?��??
    				pstmt.executeUpdate();
    		
    		//�?그�?? �??? ?��?? ????
    		HttpSession session = request.getSession();
    		
    		session.setAttribute("id", id);	
    				
    	} catch(SQLException ex){
			ex.printStackTrace();
		}finally{
			/*?��?��?? �??��?��?? ??????�? ???? ?��?��?? �??��?? ?�결?? ???��???
			  ??그�?? 경�?? ?????? ??�?�? �???
			*/
    		if(pstmt != null) try{pstmt.close();} catch(SQLException ex){}
    		if(conn != null) try{conn.close();} catch(SQLException ex){}
    		}
    	
 
        return "join.jsp";
 
    }
 
}