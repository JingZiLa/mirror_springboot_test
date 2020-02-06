<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
    <title>数据显示页面</title>
    <style>
        #tables{
            text-align: center;
        }
        #tables th{
            width: 100px;
            height: 30px;
        }
        #tables:nth-child(2){
            width: 100px;
            height: 50px;
        }
    </style>
</head>
<body>
<table cellpadding="0" cellspacing="0" border="1" id="tables">
    <tbody>
        <tr>
            <th>用户ID</th>
            <th>用户名</th>
            <th>密码</th>
            <th>年龄</th>
            <th>性别</th>
        </tr>
<%--        遍历Controller传过来的list集合--%>
        <c:forEach items="${list}" var="list" varStatus="sta">
        <tr>
                <td><c:out value="${list.uid}"></c:out></td>
                <td><c:out value="${list.username}"></c:out></td>
                <td><c:out value="${list.password}"></c:out></td>
                <td><c:out value="${list.age}"></c:out></td>
                <td>${list.username}</td>
        </tr>
        </c:forEach>
    </tbody>
</table>

<script src="${ pageContext.request.contextPath }/webjars/jquery/3.3.1-2/jquery.min.js"></script>
<script>

    $(function(){
        //获得所有的行 :元素选择器
        $("tbody > tr:even").css("background-color","#CCCCCC");
        //修改基数行
        $("tbody > tr:odd").css("background-color","#FFF38F");
    });


    // $.load().ajax({
    //     url:"/UserController/list",
    //     type:"json",
    //     data:"",
    //     success: function (data) {
    //         var tab = $("#tables");
    //         $.each(data, function (name, val) {
    //             tab.append("<tr>");
    //             var item = "<tr><td>" + val['uid'] + "</td><td>" + val['username'] + "</td><td>" + val['password'] + "</td><td>" + val['age'] + "</td><td>" + val['sex'] + "</td></tr>";
    //             tab.append(item);
    //                 });
    //             }
    //         });
</script>
</body>
</html>