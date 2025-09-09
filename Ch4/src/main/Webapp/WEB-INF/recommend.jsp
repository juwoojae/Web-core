<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>점심 메뉴 추천</title>
    <script>
        // 두번째 select 옵션 데이터
        const options = {
            "가격": ["0~10,000", "10,000~30,000", "30,000~50,000", "50,000~"],
            "맵기": ["매움", "보통", "순함"]
        };

        // 첫번째 select 변경 시 호출
        function updateSecondSelect() {
            const firstSelect = document.getElementById("criteria");
            const secondSelect = document.getElementById("detail");
            const selectedValue = firstSelect.value;

            // 기존 옵션 초기화
            secondSelect.innerHTML = "";

            // 새로운 옵션 추가
            options[selectedValue].forEach(function(opt) {
                const optionElement = document.createElement("option");
                optionElement.value = opt;
                optionElement.text = opt;
                secondSelect.appendChild(optionElement);
            });
        }

        // form submit 전에 hidden input 값 세팅
        function setHiddenValues() {
            const criteria = document.getElementById("criteria").value;
            const detail = document.getElementById("detail").value;

            // 기준이 가격이면 hiddenName에 값, 맵기이면 hiddenSpicy에 값
            if(criteria === "가격") {
                document.getElementById("hiddenName").value = detail;
                document.getElementById("hiddenSpicy").value = "";
            } else if(criteria === "맵기") {
                document.getElementById("hiddenSpicy").value = detail;
                document.getElementById("hiddenName").value = "";
            }
        }
    </script>
</head>
<body>
    <h2>점심 메뉴 추천 선택</h2>

    <form action="/lunch/recommend/card" method="post" id="menuForm" onsubmit="setHiddenValues()">
        <!-- 첫번째 select -->
        <label for="criteria">추천 기준:</label>
        <select id="criteria" name="criteria" onchange="updateSecondSelect()">
            <option value="가격">가격</option>
            <option value="맵기">맵기</option>
        </select>

        <!-- 두번째 select -->
        <label for="detail">상세 조건:</label>
        <select id="detail" name="detail">
            <option value="10000">0~10,000</option>
            <option value="20000">10,000~30,000</option>
            <option value="40000">30,000~50,000</option>
            <option value="100000">50,000~</option>
        </select>

        <!-- hidden input -->
        <input type="hidden" name="price" id="hiddenName" value="">
        <input type="hidden" name="spicy" id="hiddenSpicy" value="">

        <button type="submit">추천 받기</button>
    </form>
</body>
</html>
