<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>점심 메뉴 목록</title>
    <style>
        body {
            font-family: 'Noto Sans KR', sans-serif;
            background: #f9f9f9;
            display: flex;
            justify-content: center;
            padding: 40px;
        }

        .container {
            background: #fff;
            padding: 30px 40px;
            border-radius: 12px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
            width: 600px;
        }

        h3 {
            margin-bottom: 20px;
            color: #333;
            border-bottom: 2px solid #4f8ef7;
            padding-bottom: 10px;
        }

        ul {
            list-style-type: none;
            padding-left: 0;
        }

        ul li {
            background: #eaf2ff;
            margin: 8px 0;
            padding: 12px;
            border-radius: 6px;
            font-size: 15px;
            color: #333;
        }

        a {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 15px;
            background: #4f8ef7;
            color: #fff;
            text-decoration: none;
            border-radius: 6px;
            transition: 0.3s;
        }

        a:hover {
            background: #356ad3;
        }
    </style>
</head>
<body>
<div class="container">
    <h3>점심 메뉴 목록</h3>
    <ul>
        <c:forEach var="menu" items="${menus}">
            <li>
                메뉴 이름 : ${menu.name} &nbsp; | &nbsp;
                맵기 : ${menu.spicy} &nbsp; | &nbsp;
                가격 : ${menu.price} 원
            </li>
        </c:forEach>
    </ul>

    <a href="/index.html">메인으로 돌아가기</a>
</div>
</body>
</html>
