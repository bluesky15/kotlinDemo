package hello

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

internal class MainKtTest{
    @Test
    fun testHelloWorld(){
        assertEquals("Hello World!",helloWorld() )
    }
}