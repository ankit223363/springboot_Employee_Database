<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd" > 
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<title>EditEmployee</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
  box-sizing: border-box;
  font-family: Arial, Helvetica, sans-serif;
}

body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the top navigation bar */
.topnav {
  overflow: hidden;
  background-color: #333;
}

/* Style the topnav links */
.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change color on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;
}

/* Style the content */
.content {
  background-color: #ddd;
  align: center;
  padding: 10px;
  height: 300px; /* Should be removed. Only for demonstration */
}
.tbl{
	align :center";
    WIDTH :30%;
    padding-top:40px;
    padding-left:400px;
   


}

/* Style the footer */
.footer {
  background-color: #f1f1f1;
  padding: 10px;
}
</style>
</head>
<body>

<div class="topnav">
<p><a href="/Sopra/home">HOME</a></p>
 <a href="/Sopra/display">Employee Details</a>
  
  
</div>

<div class="content" align="center">

<FORM  align="center" action="/Sopra/editemployee" modelAttribute="${Employee}" method="POST" >
    <TABLE class="tbl" >
    <TR>
	      <TH width="50%">ID</TH>
		  <TD width="50%"><INPUT TYPE="text" NAME="empId"></TD>
	  </tr>
         <TR>
	      <TH width="50%">Name</TH>
		  <TD width="50%"><INPUT TYPE="text" NAME="name"></TD>
	  </tr>
      <TR>
	     <TH width="50%">Project</TH>
		 <TD width="50%"><INPUT TYPE="text" NAME="projectName"></TD>
	  </tr>
	  <TR>
	     <TH width="50%">Delivery Unit</TH>
		 <TD width="50%"><INPUT TYPE="text" NAME="DU"></TD>
	  </tr>
	 
	  	  <TR>
	      <TH></TH>
		  <TD width="50%"><INPUT TYPE="submit" VALUE="submit"></TD>
	  </tr>
   </TABLE>
   </div>

  </FORM>

</div>

<div class="footer">
  <p></p>
</div>

</body>
</html>