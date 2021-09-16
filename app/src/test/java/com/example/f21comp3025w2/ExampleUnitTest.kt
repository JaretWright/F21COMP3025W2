package com.example.f21comp3025w2

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun readOnly(){
        //val means that it is immutable.  Once it has a value, it cannot be changed
        //In Java final String flavour = "Peach"; would be an equivalent
//        val flavour : String = "strawberry"
        val flavour = "strawberry"
//        flavour = "cookie dough"
        println("The first choice flavour was $flavour")
    }

    @Test
    fun changeVar()
    {
        //var are said to be "mutable" which means that the value can change
        var flavour = "black thunder"
        flavour = "banana boat"
        println("allowing for change, the flavour is $flavour")
    }

    @Test
    fun allowForNull()
    {
//        String flavour;
        var flavour : String?

        flavour = null

        if (flavour.equals("Banana boat"))
            println("Banana boat rocks")
        else
            println(flavour)
    }

    @Test
    fun elvisOperator(){
        var flavour: String? = null

        //elvis ?: if it's null, assign another value
        println(flavour ?: "something else")

        flavour = "chocolate peanut butter"

        println(flavour ?: "something else")
    }

    //In Java public int multiply(int left, int right) {...}
    fun multiply(left : Int, right: Int = 10) : Int
    {
        println("left: $left * right: $right = " + left*right )
        return left * right
    }

    //In Java public int multiply(int left, int right) {...}
    fun addition(left : Int, right: Int = 10, another:Int = 20) : Int
    {
        var result = left+right+another
        println("left: $left + right: $right + $another = $result")
        return left + right + another
    }

    @Test
    fun testWithMultipleDefaultValues()
    {
        assertEquals(6, addition(1,2,3))
        assertEquals(23, addition(1,2))
        assertEquals(31, addition(1))
    }

    @Test
    fun testMultiplyFuncton()
    {
//        assertEquals(50, multiply(10,5))
//        assertEquals(20, multiply(2))
        assertEquals(600, multiply(right=30, left=20))
        assertEquals(600, multiply(30, 20))
    }
}