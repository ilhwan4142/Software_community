<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr"%>
    <script> 

function writeCheck()
  {
   var form = document.writeform;
   
  if( !form.subject.value )
   {
    alert( "������ �����ּ���" );
    form.subject.focus();
    return;
   }
 
  if( !form.content.value )
   {
    alert( "������ �����ּ���" );
    form.content.focus();
    return;
   }  
 
  form.submit();
  }
 </script>
 
 <script>
 function getSelectValue(frm)
 {
 	 frm.optionValue.value = frm.selectBox.options[frm.selectBox.selectedIndex].value;
 }
 </script>
 <script type="text/javascript">

$(document).ready(function(){
	$("#fileInput").on('change', function(){  // ���� ����Ǹ�
		if(window.FileReader){  // modern browser
			var filename = $(this)[0].files[0].name;
		} else {  // old IE
			var filename = $(this).val().split('/').pop().split('\\').pop();  // ���ϸ� ����
		}
		// ������ ���ϸ� ����
		$("#userfile").val(filename);
	});

});

</script>


<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
 	
 <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom fonts for this template -->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
  <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>

  <!-- Custom styles for this template -->
  <link href="css/clean-blog.min.css" rel="stylesheet">
<!-- �������� �ּ�ȭ�� �ֽ� �ڹٽ�ũ��Ʈ -->
<!--  <script src="//code.jquery.com/jquery.min.js"></script> -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


</head>

<body style="background-color:#FFE4B5">

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
    <div class="container">
      <a class="navbar-brand" href="index.html">�ҿ� Ŀ�´�Ƽ</a>
      <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        Menu
        <i class="fas fa-bars"></i>
      </button>
      <div style="margin-right:250px" class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
            <a class="nav-link" href="index.html">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="about.html">About</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="post.html">Sample Post</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="contact.html">Contact</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

	<div style="text-align:right">
		�����ID : ${id} <input type=button class="btn btn-warning" value="�α׾ƿ�" OnClick="window.location='logout.do'">
	</div>
	<div  style=" margin-top: 60px;" class="container">
	<form id="inform" action ="/board/write.do" method="post">
		<table  class="table table-borderless">
		<!--  	<caption style="text-align:center">�Խ��� �ۼ�</caption> -->
			<tr >
				<th>�۹�ȣ</th>
				<td>�۹�ȣ</td>
			
				<th>ī�װ�</th>
				<td >    
					<select class="form-control" name="category">
						 <option value="">����</option>
						<option value="1" <c:if test="${category == 1}"> selected </c:if>>one</option> 
					    <option value="2" <c:if test="${category == 2}"> selected </c:if>>Two</option> 
					    <option value="3" <c:if test="${category == 3}"> selected</c:if>>Three</option>
					    <option value="4" <c:if test="${category == 4}"> selected</c:if>>Four</option>
					    <option value="5" <c:if test="${category == 5}"> selected</c:if>>Five</option>
					</select>
				</td>
			</tr>
			<tr >
				<th>����</th>
				<td ><input type="text" name="subject" class="form-control" placeholder="������ �Է��ϼ���. "></td>
			
				<th>�ۼ���</th>
				<td >${id} </td>
				
			</tr>
			
			<tr >	
				<th>����</th>
				<td colspan="3"><textarea class="form-control" name="content"  rows="20" cols="50" placeholder="������ �Է��ϼ���" form="inform"></textarea></td>
			</tr>	
			<tr>
				<th>÷������</th>
				<td colspan="3"><div class="form-group">
					<label for="InputSubject1"></label>
					<input id="fileInput" filestyle="" type="file" data-class-button="btn btn-default" data-class-input="form-control" data-button-text="" data-icon-name="fa fa-upload" class="form-control" tabindex="-1" style="position: absolute; clip: rect(0px 0px 0px 0px);">				
					<div class="bootstrap-filestyle input-group">			
						<input type="text" id="userfile" class="form-control" name="userfile" disabled="">				
						<span class="group-span-filestyle input-group-btn" tabindex="0">				
							<label for="fileInput" class="btn btn-default ">				
							<span class="glyphicon fa fa-upload"></span>				
							</label>				
						</span>				
					</div>				
				</div>
				</td>
			</tr>
			<tr>
				<th></th>
				<td colspan="3" >		
					<input type=submit class="btn btn-warning" value="���" Onclick="javascript:writeCheck();">
					
					<input type=button class="btn btn-secondary" value="���" OnClick="window.location='main.jsp'">
				</td>
			</tr>
			
		</table>
	</form>
	</div>
</body>
</html>