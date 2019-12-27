<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>文件上传</title>
</head>
<body>
<h1>文件上传</h1>

<form method="post" action="fileUpload" enctype="multipart/form-data">


    <label>用户名
        <input type="text" name="username"/>
    </label>
    <br/><br/>

    <label>年龄
        <input type="text" name="age"/>
    </label>
    <br/><br/>

    选择一个文件:
    <input type="file" name="uploadFile"/>
    <br/><br/>

    <input type="submit" value="上传"/>
</form>


</body>
</html>