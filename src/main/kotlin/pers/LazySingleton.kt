package pers

class LazySingleton private constructor() {

    companion object {
        private var lazyInstance: LazySingleton? = null
            get() {
                return field ?: LazySingleton()
            }

        @JvmStatic
        @Synchronized // 添加synchronized同步锁
        fun getInstance(): LazySingleton {
            return requireNotNull(lazyInstance)
        }
    }

    fun doSomething() {
        println("do some thing")
    }
}