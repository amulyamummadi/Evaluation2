 <div align="right" >   
            
     <form style="float:right; margin-right:12px;" method="post" class="log" action="index.jsp">
     <input type="submit"  value="Logout">
     </form>
     </div>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String id = request.getParameter("userId");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost/employee";

String userId ="root";
String password = "ammu";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h1 align="center"><font><strong>Registered Techtalks</strong></font></h1>
<table align="center" cellpadding="2" cellspacing="2" border="1">
<tr>

</tr>
<tr bgcolor="ADD8E6">
<td><b>Date</b></td>
<td><b>Title</b></td>
<td><b>Description</b></td>
<td><b>Presentor</b></td>
<td><b>Id</b></td>
</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM techtoch";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>

<tr bgcolor="E6E6FA">

<td><%=resultSet.getString(1) %></td>
<td><%=resultSet.getString(2) %></td>
<td><%=resultSet.getString(3) %></td>
<td><%=resultSet.getString(4) %></td>
<td><%=resultSet.getString(5) %></td>

</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="utf-8">
<title>jQuery Add / Remove Table Rows Dynamically</title>

<style type="text/css">
    form{
        margin: 20px 0;
    }
    form input, button{
        padding: 5px;
    }
    table{
        width: 50%;
        margin-bottom: 20px;
		
    }
    table, th, td{
        border: 1px solid #cdcdcd;
    }
    table th, table td{
        padding: 5px;
        text-align: left;
    }
    h1 {
    text-align: center;
    text-decoration: underline; 
    
}
  body {
    background-image: url("images/world.jpg");
   -webkit-background-size: cover;
        -moz-background-size: cover;
        -o-background-size: cover;
        background-size: cover;
} 
</style>
<script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        $(".add-row").click(function(){
            var date= $("#date").val();
            var title = $("#title").val();
            var description = $("#description").val();
            var presentor = $("#presentor").val();
            var id = $("#id").val();
            var markup = "<tr><td>" +date+ "</td><td>"+title+ "</td><td>"+description+ "</td><td>" + presentor + "</td><td>" + id + "</td><td><input type='checkbox' name='record'></td></tr>";
            $("table tbody").append(markup);
        });
        
        // Find and remove selected table rows
        $(".delete-row").click(function(){
            $("table tbody").find('input[name="record"]').each(function(){
            	if($(this).is(":checked")){
                    $(this).parents("tr").remove();
                }
            });
        });
    });    
</script>
</head>
 <body>

    <form method="post" action="UpdateServletAdd">
    <table align="center" cellpadding="5" cellspacing="5" border="1">
       <h4>Enter details here to insert into table</h4>
                 <th  bgcolor="ADD8E6">Date</th>
                 <th  bgcolor="ADD8E6">Title </th>
                 <th  bgcolor="ADD8E6">Description</th>
                 <th  bgcolor="ADD8E6">Presentor</th>
                 <th  bgcolor="ADD8E6">Id</th>
         <tr bgcolor="E6E6FA">
         <td><input type="text" name="date" id="date" placeholder="Date"></td>
         <td><input type="text" name="title" id="title" placeholder="Title"></td>
         <td> <input type="text" name="description" id="description" placeholder="Description"></td>
         <td><input type="text" name="presentor"id="presentor" placeholder="presentor"></td>
         <td><input type="number" name="id"id="id" placeholder="id"></td>
         <td><input type="button" class="add-row" value="Insert-row"></td>
          <td><button type="submit" class="delete-row">Click-Refresh</button></td>
         </tr>
         
    </table>
        
    </form>
  
  <form method="post" action="updateServlet">
    <table align="center" cellpadding="2" cellspacing="2" border="1">
      <h4>Enter details here to update the table</h4>
                 <th  bgcolor="ADD8E6">Date</th>
                 <th  bgcolor="ADD8E6">Title </th>
                 <th  bgcolor="ADD8E6">Description</th>
                 <th  bgcolor="ADD8E6">Presentor</th>
                 <th  bgcolor="ADD8E6">Id</th>
         <tr bgcolor="E6E6FA">
         <td><input type="text" name="udate" id="date" placeholder="Date"></td>
         <td><input type="text" name="utitle" id="title" placeholder="Title"></td>
         <td> <input type="text" name="udescription" id="description" placeholder="Description"></td>
         <td><input type="text" name="upresentor"id="presentor" placeholder="presentor"></td>
         <td><input type="number" name="uid"id="id" placeholder="id"></td>
         <td><input type="submit" value="Update-row"></td>
  
         </tr> 
    </table>
       </form>  
</body> 
</html>              
                  		