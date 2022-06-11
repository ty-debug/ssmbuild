<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/5/26
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12-column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/addBook" method="post">
        <div class="form-group">
            <label for="bookName">书籍名称：</label>
            <input type="text" class="form-control" id="bookName" name="bookName" required>
        </div>
        <div class="form-group">
            <label for="bookCounts">书籍数量：</label>
            <input type="number" class="form-control" id="bookCounts" name="bookCounts" required>
        </div>
        <div class="form-group">
            <label for="detail">书籍描述：</label>
            <input type="text" class="form-control" id="detail" name="detail" required>
        </div>

        <button type="submit" class="btn btn-primary">添加</button>
    </form>
</div>
</body>
</html>
