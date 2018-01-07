package fp.kotlin.example.chapter03.exercise

import fp.kotlin.example.plus

/**
 * 연습문제 3-7
 *
 * 이전 예제에서 다루었던 take 함수를 참고하여 repeat 함수를 테스트하기 위해서 사용한 takeSequence 함수를 작성해보자.
 * 그리고 repeat 함수가 잘 동작하는지 직접 테스트 해보라.
 *
 * 힌트: 함수의 선언 타입은 아래와 같다.
 * fun takeSequence(n: Int, sequence: Sequence<Int>): List<Int>
 */

fun main(args: Array<String>) {
    require(listOf(3, 3, 3, 3, 3) == takeSequence(5, repeat(3)))
}

private fun takeSequence(n: Int, sequence: Sequence<Int>): List<Int> = TODO()

private fun repeat(n: Int): Sequence<Int> = sequenceOf(n) + { repeat(n) }