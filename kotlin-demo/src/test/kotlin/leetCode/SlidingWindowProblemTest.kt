package leetCode


import kotlin.test.Test
import kotlin.test.assertEquals

internal class SlidingWindowProblemTest{
    @Test
    fun testSlidingWindowMax(){
        //Arrange
        val nums = listOf(1, 2, 3, 1, 4, 5, 2, 3, 6)
        val expected = listOf<Int>(3,4,5,5,5,6)
        //Act
        val actual = slidingWindowMax(nums,3,nums.size)
        //Assert
        assertEquals(expected,actual)
    }

}