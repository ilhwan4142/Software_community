<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<<<<<<< HEAD
  <!-- Theme CSS -->
  <link href="css/freelancer.min.css" rel="stylesheet">
<title>�α��� ������</title>
<script type="text/javascript">
	function login(){
		document.form.submit();
	}
	
	function cancel(){
		document.form.reset();
	}	
</script>
</head>
<body>
<header class="masthead bg-primary text-white text-center">
    <div class="container d-flex align-items-center flex-column">

      <!-- Masthead Avatar Image -->
      <img class="masthead-avatar mb-5" src="img/mark.png" alt="">

      <!-- Masthead Heading -->
      <h1 class="masthead-heading text-uppercase mb-0">SOFTWARE DEPARTMENT</h1>

      <!-- Icon Divider -->
      <div class="divider-custom divider-light">
        <div class="divider-custom-line"></div>
        <div class="divider-custom-icon">
          <i class="fas fa-star"></i>
        </div>
        <div class="divider-custom-line"></div>
      </div>

      <!-- Masthead Subheading -->
      <p class="masthead-subheading font-weight-light mb-0">COMMUNITY SITE</p>

    </div>
  </header>
	<form action="login.do" method="post" name="form">
		<table class="table table-striped table-bordered table-hover">
			<caption style="text-align:center">�α���</caption>
			<tr>
				<th>ID</th> 
				<th><input type="text" name="id" /></th>
			</tr>
			<tr>
				<th>PW</th>
				<th><input type="password" name="password" /></th>
			</tr>
			<tr>
				<th></th>
				<th>
					<input type="button" class="btn btn-primary" value="�α���" onClick="login()" />
					<input type="button" class="btn btn-secondary" value="���" onClick="cancel()" />
					<input type="button" class="btn btn-success" value="ȸ������" onClick="window.location='loginform.jsp'" />
				</th>
			</tr>
		</table>
	</form>
	<footer class="footer text-center">
    <div class="container">
      <div class="row">

        <!-- Footer Location -->
        <div class="col-lg-4 mb-5 mb-lg-0">
          <h4 class="text-uppercase mb-4">Location</h4>
          <p class="lead mb-0">1. Seowon-gu,Cheongju,Chungbuk
            <br>Chungbuk national university</p>
        </div>

        <!-- Footer Social Icons -->
        <div class="col-lg-4 mb-5 mb-lg-0">
          <h4 class="text-uppercase mb-4">Software Site</h4>
          <!-- <a class="btn btn-outline-light btn-social mx-1" href="#">
            <i class="fab fa-fw fa-facebook-f"></i>
          </a>
          <a class="btn btn-outline-light btn-social mx-1" href="#">
            <i class="fab fa-fw fa-twitter"></i>
          </a>
          <a class="btn btn-outline-light btn-social mx-1" href="http://www.chungbuk.ac.kr/site/www/main.do" target="_blank">
            <i class="fab fa-fw fa-linkedin-in"></i>
          </a> -->
          <a class="btn btn-outline-light btn-social mx-1" href="https://software.cbnu.ac.kr/" target="_self">
            <i class="fab fa-fw fa-dribbble"></i>
          </a>
        </div>

        <!-- Footer About Text -->
        <div class="col-lg-4 mb-5 mb-lg-0">
          <h4 class="text-uppercase mb-4">OPEN SOURCE PROJECT TEAM 1</h4>
          <p class="lead mb-0"><b>�̿��� ���� ������ ����ȯ</b></p>
        </div>
        

      </div>
    </div>
  </footer>
=======
<title>�α��� ������</title>
<script type="text/javascript">
	function login(){
		document.form.submit();
	}
	
	function cancel(){
		document.form.reset();
	}	
</script>
</head>
<body>
	<form action="login.do" method="post" name="form">
		<table class="table table-striped table-bordered table-hover">
			<caption style="text-align:center">�α���</caption>
			<tr>
				<th>ID</th> 
				<th><input type="text" name="id" /></th>
			</tr>
			<tr>
				<th>PW</th>
				<th><input type="password" name="password" /></th>
			</tr>
			<tr>
				<th></th>
				<th>
					<input type="button" class="btn btn-primary" value="�α���" onClick="login()" />
					<input type="button" class="btn btn-secondary" value="���" onClick="cancel()" />
					<input type="button" class="btn btn-success" value="ȸ������" onClick="window.location='loginform.jsp'" />
				</th>
			</tr>
		</table>
	</form>
>>>>>>> refs/remotes/origin/master
</body>
</html>