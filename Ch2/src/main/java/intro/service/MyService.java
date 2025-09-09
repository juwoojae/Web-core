package intro.service;

import org.springframework.ui.Model;

import java.util.Map;

public class MyService {

    private static final Map<String, String> MBTI_EMOJI_MAP = Map.ofEntries(
            Map.entry("ISTJ", "📘"), // 신중한 관리자 – 책
            Map.entry("ISFJ", "🛡️"), // 헌신적인 수호자 – 방패
            Map.entry("INFJ", "🔮"), // 통찰력 있는 조언자 – 수정구슬
            Map.entry("INTJ", "♟️"), // 전략적인 사색가 – 체스말

            Map.entry("ISTP", "🛠️"), // 논리적인 장인 – 공구
            Map.entry("ISFP", "🎨"), // 예술적인 예민가 – 팔레트
            Map.entry("INFP", "🌸"), // 감성적인 중재자 – 벚꽃
            Map.entry("INTP", "💡"), // 논리적인 사색가 – 전구

            Map.entry("ESTP", "🏍️"), // 모험적인 활동가 – 오토바이
            Map.entry("ESFP", "🎉"), // 자유로운 연예인 – 폭죽
            Map.entry("ENFP", "🔥"), // 열정적인 외교관 – 불꽃
            Map.entry("ENTP", "⚡"), // 재기발랄한 발명가 – 번개

            Map.entry("ESTJ", "📋"), // 현실적인 관리자 – 체크리스트
            Map.entry("ESFJ", "🤝"), // 친화력 좋은 사회자 – 악수
            Map.entry("ENFJ", "🌟"), // 정의로운 주도자 – 별
            Map.entry("ENTJ", "👑")  // 당당한 리더 – 왕관
    );
    private static final Map<String, String> BackgroundColorMap = Map.ofEntries(
            Map.entry("빨강", "#f87171"),
            Map.entry("파랑", "#60a5fa"),
            Map.entry("초록", "#34d399"),
            Map.entry("노랑", "#facc15")
    );
    public static void process(String color,String mbit,Model model) {
        createBackground(color, model); //좋아하는 배경색 지정
        convertMbti(mbit, model);      //내 mbti 에 해당하는 이모지 전환
    }
    //Mpti 에 따라 이모지 출력하기
    private static void convertMbti(String mbit, Model model) {
        String myMbti = MBTI_EMOJI_MAP.get(mbit);
        model.addAttribute("mbtiimg", myMbti);
    }
    //좋아하는 색상에 따라 배경색 적용하기
    private static void createBackground(String color, Model model) {
        String mycolor = BackgroundColorMap.get(color);
        if(mycolor==null){
            model.addAttribute("backgroundColor","#f0f4f8");//기본색 반환
        }else {
            model.addAttribute("backgroundColor", mycolor);
        }
    }
}
