<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>추천 메뉴</title>
    <!-- Bootstrap CSS CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: linear-gradient(135deg, #fceabb, #f8b500);
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .card {
            border-radius: 15px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.2);
            text-align: center;
            padding: 30px;
            max-width: 350px;
        }
        .card-title {
            font-weight: 700;
            font-size: 1.8rem;
            color: #343a40;
            margin-bottom: 20px;
        }
        .card-text {
            font-size: 1.3rem;
            margin-bottom: 20px;
        }
        .emoji {
            font-size: 2.5rem;
            margin-bottom: 25px;
        }
        .btn-custom {
            width: 100%;
            padding: 12px;
            font-size: 1rem;
            font-weight: 600;
            border-radius: 10px;
        }
    </style>
</head>
<body>
    <div class="card bg-white">
        <div class="card-body">
            <h5 class="card-title">오늘의 추천 메뉴</h5>
            <p class="card-text"><strong>${menu.name}</strong> 를 추천합니다!!</p>
            <div class="emoji">🍽️</div>
            <a href="http://localhost:8080/index.html" class="btn btn-primary btn-custom">홈으로 돌아가기</a>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
