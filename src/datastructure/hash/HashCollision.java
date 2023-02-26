package src.datastructure.hash;

public class HashCollision {

    /** 선형 조사법
     * 객체 x
     * int h 는 객체의 hashCode 값이다. int h = x.hashCode();
     *
     *  1. 객체.hashCode()로 인해 반환된 값을 양수로 바꿔준다
     *  h & 0x7FFFFFFF;
     *
     *  2. 결과값으로 나온걸 테이블의 size와 % 연산을 한다, 이 숫자는 테이블의 크기보다 작음
     *  h % table.size()
     *
     *  3. h를 가지고 x를 적절한 위치에 저장한다, 이 위치는 hashCode 값에 따라 다름
     *
     *  객체 y
     *  위와 동일한 방법으로 h를 구한다
     *  x의 위치와 동일한 값이 나오면 x의 위치에 y를 저장해야 한다
     *  이런 상황을 충돌이라고 한다
     *
     *  임시 해결
     *  x의 다음 칸에 y를 저장
     *  y의 위치가 바뀌었다는 사실을 알아야 함
     *  즉, 빈 공간을 찾을때까지 자료구조를 탐색한다
     *  삭제의 경우 데이터 삭제 후 null이 아닌
     */

}
