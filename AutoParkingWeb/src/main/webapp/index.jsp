<html>
   <head>
         <!-- this is the comment line -->
         <title>Admin Login!</title>
   </head>
   <body>
      <marquee><h1>Auto Parking Application</h1></marquee>
      <center>
         <h3>Welcome Admin..Please Login to continue....</h3>
         <form action="LoginServlet" method="post">
            <input type="text" name="userName" id="userName" placeholder="Enter User Name"><br><br>
            <input type="password" name="password" id="password" placeholder="Enter password"><br><br>
            <input type="submit" name="submit" value="Login">
         </form>
      </center>
   </body>
</html>