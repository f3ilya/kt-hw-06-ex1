package ru.netology

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun add() {
        var result = WallService.add(Post())
        assertEquals(1, result.id)
    }

    @Test
    fun updateExisting() {
        WallService.add(Post(text = "ha"))
        WallService.add(Post(text = "haha"))
        WallService.add(Post(text = "hahaha"))
        val result = WallService.update(Post(id = 1, text = "haha"))
        assertTrue(result)
    }

    @Test
    fun updateNotExisting() {
        WallService.add(Post(text = "haha"))
        WallService.add(Post(text = "haha"))
        val result = WallService.update(Post(id = 50, text = "haha"))
        assertFalse(result)
    }
}