<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>점심 메뉴 없음</title>
    <!-- Bootstrap CSS -->
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
            max-width: 400px;
            background-color: #fff;
        }
        .card-title {
            font-size: 1.8rem;
            font-weight: 700;
            margin-bottom: 20px;
        }
        .card-text {
            font-size: 1.3rem;
            margin-bottom: 30px;
            color: #555;
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
    <div class="card">
        <div class="card-body">
            <h5 class="card-title">등록된 점심메뉴가 없어요 ㅠㅠ</h5>
            <p class="card-text">아직 메뉴가 등록되지 않았습니다.</p>
            <a href="http://localhost:8080/lunch/recommend" class="btn btn-success btn-custom">메뉴 등록하러 가기</a>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
