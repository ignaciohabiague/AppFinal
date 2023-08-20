package com.curso.android.app.practica.appfinal

import com.curso.android.app.practica.appfinal.model.EditText
import org.junit.Test

import org.junit.Assert.assertEquals

class StringComparisonTest {

    @Test
    fun testSameStringsComparison() {
        val comparison = EditText("hello", "hello")
        val result = comparison.compareStrings()
        assertEquals("Las cadenas son idénticas", result)
    }

    @Test
    fun testDifferentStringsComparison() {
        val comparison = EditText("hello", "world")
        val result = comparison.compareStrings()
        assertEquals("Las cadenas son diferentes", result)
    }
}