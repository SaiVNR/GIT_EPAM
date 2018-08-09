<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Admin</title>
</head>
<body>
      <marquee><h1>Auto Parking Application</h1></marquee>
      <center>
         <h3>Welcome Admin..!</h3>
         <h3>Please select your option..!</h3>
         <form action="HomeServlet" method="post">
            <table>
            <tr>
               <td>
                  <input type="radio" name="choice" value="Park" checked> Park<br>
               </td>
            </tr>
            <tr>
               <td>
                  <input type="radio" name="choice" value="Unpark"> Unpark<br>
               </td>
            </tr>
            <tr>
               <td>
                  <input type="radio" name="choice" value="Display"> Display Status<br>
               </td>
            </tr>
            <tr>
               <td>
                  <input type="text" name="carNumber" placeholder="Enter car number">
               </td>
            </tr>
            <tr>
               <td>
                  <center><input type="submit" value="Submit"></center>
               </td>
            </tr>
            </table>
         </form>
      </center>
</body>
</html>