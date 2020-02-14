import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import socks_problem.sockMerchant

class TestMain {
    @Test
    fun `test case 1`() {
        val actualData = sockMerchant(4, arrayOf(1, 1, 2, 1))
        assertEquals(1, actualData)
    }

    @Test
    fun `test case 2`() {
        val actualData = sockMerchant(4, arrayOf(1, 1, 1, 1))
        assertEquals(2, actualData)
    }

    @Test
    fun `test case 3`() {
        val actualData = sockMerchant(4, arrayOf(1, 3,2,4,5))
        assertEquals(0, actualData)
    }
}
