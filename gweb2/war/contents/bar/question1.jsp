<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>CODE PRACTICE</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- The styles -->
    <link href="../../css/bootstrap.css" rel="stylesheet">
    <style type="text/css">
      body {
        background:url('../../img/bg.gif');
        padding-top: 60px;
        /*padding-bottom: 40px;*/
      }
    </style>
    <link href="../../css/bootstrap-responsive.css" rel="stylesheet">
     <link href="../../css/global.css" rel="stylesheet">

    </head>
  <body>

    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="index.html">Code Practical</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li class="active"><a href="#">Home</a></li>
              <li><a href="design.html"> Design Info</a></li>
              <li><a href="question1.html">Question 1</a></li>
              <li><a href="question2.html">Question 2</a></li>
              <li><a href="question3.html">Question 3</a></li>
              
            </ul>
              <div class="pull-right">
                  <a class="btn btn-inverse">Logout</a>
              </div>
          </div>
        </div>
      </div>
    </div>

    <div class="container">

      <div class="row">
              <div class="content">
                    <div class="content-header">
                        <br>
                        <h3>Question 1</h3>
                    </div>
                    <div class="content-list" >
                        <p>This practical includes two main parts, front-end design and algorithm implementations.</p>
                    </div>
                    <div class="content-list" >                       
                        <form name="form1" method="post" action="value1.jsp">
                            <fieldset>
                        <label>Input</label>
                        <input type="text" name="input1" id="input1" placeholder="Enter the input...">
                        <span class="help-block">Example: </span>
                        <button type="submit" class="btn">Submit</button>
                           </fieldset>
                        </form>
                    </div>
                    <div class="content-list" >
                        <h5>ALGORITHM QUESTIONS</h5>
                        <ol>
                           <li>Monkey on Pyramid</li>
                           <li>Stock Trading</li>
                           <li>Facebook Friends</li>
                        </ol>
                        <p></p>
                        
                    </div>
                  <div class="content-list">
                         <h5>Notice </h5>
                         <p>Questions in the website are confidential documents. Please DO NOT copy. This website should be only used for the exhibition purpose.</p>
                  </div>
              </div>
      </div>
        
<!--    <footer>
        <p>&copy; Company 2013</p>
        </footer>-->
    </div>
      <!-- /container end-->
   
      <!--footer-->
      <div class="footer">
          <p>
              <a>Contact   </a>|
              <a>  About</a>
          </p>
          <p>&CircleTimes;  Designed by Zihan, 2014</p>
      </div>
      <!--/footer-->
    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="../../js/jquery.js"></script>
    <script src="../../js/bootstrap.js"></script>
    
  </body>
</html>
