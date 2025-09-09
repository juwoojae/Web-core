<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>점심 메뉴 등록</title>
    <style>
        body {
            font-family: 'Noto Sans KR', sans-serif;
            background: #f9f9f9;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            margin: 0;
        }

        .form-container {
            background: #fff;
            padding: 30px 40px;
            border-radius: 12px;
            box-shadow: 0 4px 12px rgba(0,0,0,0.1);
            width: 400px;
        }

        h1 {
            text-align: center;
            margin-bottom: 25px;
            color: #333;
        }

        .form-group {
            margin-bottom: 18px;
        }

        label {
            display: block;
            margin-bottom: 6px;
            font-weight: bold;
            color: #444;
        }

        input[type="text"], input[type="number"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 8px;
            box-sizing: border-box;
            font-size: 14px;
        }

        button {
            width: 100%;
            padding: 12px;
            border: none;
            border-radius: 8px;
            background-color: #4f8ef7;
            color: white;
            font-size: 15px;
            cursor: pointer;
            transition: background 0.3s;
        }

        button:hover {
            background-color: #356ad3;
        }
    </style>
</head>
<body>
<div class="form-container">
    <h1>점심 메뉴 등록</h1>
    <form action="save" method="post">
        <div class="form-group">
            <label for="name">메뉴 이름</label>
            <input type="text" id="name" name="name" required />
        </div>

        <div class="form-group">
            <label for="spicy">맵기</label>
            <input type="text" id="spicy" name="spicy" placeholder="예: 매움, 보통, 순함" required />
        </div>

        <div class="form-group">
            <label for="price">가격</label>
            <input type="number" id="price" name="price" min="0" required />
        </div>

        <button type="submit">등록</button>
    </form>
</div>
</body>
</html>
