<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>자기소개 결과</title>
    <style>
        body {
            font-family: 'Noto Sans KR', sans-serif;
            background: #f0f4f8;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }

        .container {
            background: #ffffff;
            padding: 30px;
            border-radius: 16px;
            box-shadow: 0 4px 10px rgba(0,0,0,0.1);
            width: 400px;
            text-align: center;
        }

        h2 {
            margin-bottom: 20px;
            color: #333;
        }

       ul {
           list-style-type: disc; /* 기본 점 스타일 */
           padding-left: 20px;
           margin-bottom: 20px;
       }

       ul li {
           background: #e6f0fa;
           margin: 5px 0;
           padding: 10px;
           border-radius: 6px;
       }


        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }

        td {
            background: #e6f0fa;
            padding: 10px;
            border-radius: 6px;
            margin: 5px 0;
            text-align: center;
        }

        a {
            display: inline-block;
            padding: 10px 16px;
            border-radius: 8px;
            background: #4f8ef7;
            color: #fff;
            text-decoration: none;
            font-weight: bold;
            transition: 0.2s;
        }

        a:hover {
            background: #356ad3;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>자기소개 결과</h2>

    <ul>
        <li><strong>이름:</strong> ${name}</li>
        <li><strong>나이:</strong> ${age}</li>
        <li><strong>MBTI:</strong> ${mbti}</li>
    </ul>

   <h3>좋아하는 음식</h3>
   <ul>
       <c:forEach var="food" items="${favoriteFoods}">
           <li>${food}</li>
       </c:forEach>
   </ul>


    <a href="/index.html">메인으로 돌아가기</a>
</div>
</body>
</html>
