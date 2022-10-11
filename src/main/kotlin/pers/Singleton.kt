package pers

// Kotlin中实现单例模式就比较简单，只需要定义一个object对象表达式即可，无需手动设置构造器私有化和提供全局的访问点
object Singleton {
    fun doSomething() {
        println("do some thing")
    }

    private fun readResult(): Any {
        return Singleton
    }
}