package fp.kotlin.example.chapter03.exercise

/**
 * 연습문제 3-8
 *
 * quicksort 함수를 작성해보자.
 *
 * 힌트1: 퀵정렬 알고리즘의 동작 방식은 아래 위키를 참고하자.
 * https://en.wikipedia.org/wiki/Quicksort
 * 힌트2: 리스트를 분할하기 위한 함수 partition을 활용해보자.
 */

fun main(args: Array<String>) {
    require(listOf(1, 2, 3, 4, 5, 6, 7) == quicksort(listOf(5, 3, 7, 6, 2, 1, 4)))
}

private fun quicksort(list: List<Int>): List<Int> = TODO()