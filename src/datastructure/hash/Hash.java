package src.datastructure.hash;

public class Hash {

    // ----- 문자열을 기반으로 정수를 계산해주는 hashCode, 충돌 문제 해결-----
    static int hashCode(String s) { // this 가 입력으로 들어온다고 가정
        int g = 31;
        int hash = 0; // 키 배열에 저장될 반환값

        // 상수 g를 문자의 위치만큼 제곱한뒤 곱한다
        for (int i=s.length()-1; i>=0; i--) { // s, i, h, t
            hash = g * hash + s.charAt(i);
            System.out.println(hash);
        }
        return hash;
    }

    // 116 + g(104 + g(105 + g(115)))
    public static void main(String[] args) {
        System.out.println(hashCode("this"));
        System.out.println("----------");
        System.out.println(hashCode("siht"));
    }


    // ----- 해시 크기 최적화 -----
    // 반환된 정수를 배열의 인덱스로 사용할수 있게 최적화
}
