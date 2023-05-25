public class pollsWithoutMethod {
    public static void main(String[] args) {
        String [][] numbers = {
                {"교수는 수업 전 강의 목표를 명확히 제시하였습니까?"},
                {"전혀아니다.", "아니다.", "그렇다.", "매우그렇다."},
                {"강의의 내용은 체계적이고 성의있게 구성되었는가?"},
                {"전혀아니다.", "아니다.", "그렇다.", "매우그렇다."},
                {"교수는 강의 내용에 대해 전문적 지식이 있었는가?"},
                {"전혀아니다.", "아니다.", "그렇다.", "매우그렇다."},
                {"강의 진행 속도는 적절하였는가?"},
                {"전혀아니다.", "아니다.", "그렇다.", "매우그렇다."}
            };
        for (int second = 0; second < numbers.length; second = second+2) {
            for (int third = 0; third < numbers[second].length; third=third+2){
                System.out.println(numbers[second][third]);
            }
            System.out.println();
        }
        // return 0;
    }
}
