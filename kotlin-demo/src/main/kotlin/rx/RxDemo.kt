package rx

import io.reactivex.rxjava3.core.Observable

open abstract class Xyz {
    abstract fun create()
}

class Yy(val x: String, block: () -> Unit) : Xyz() {
    init {
        println("init block called")
        block()
    }

    constructor(x: String, block: () -> Unit, y: String) : this(x, block) {
        println("Secondary constructor")
    }

    override fun create() {
        println("You Have Created Yy which extends Yyz")
    }

    companion object {
        fun getMsg(): String {
            return "Hello"
        }
    }
}

fun main() {
    val s = fun() {
        println("Anonymous function")
    }
    println(Yy.getMsg())
    val xy = Yy("Hi", s, "Hello")
    xy.create()
    //getMergedObservable()
    // howToCreateObservable()
}


fun getMergedObservable() {
    val ob1 = Observable.just(1, 3, 5)
    val ob2 = Observable.just(2, 4, 6)
    val ob3 = Observable.merge(ob1, ob2)
    ob3.subscribe(::println)
}

fun howToCreateObservable() {
    //using just method
    val observable = Observable.just(1, 2, 3, 4, 5)
    //observable.subscribe(::println)
    //using fromIterable method
    val list = listOf<Int>(1, 2, 3, 4, 5)
    //val observable2 = Observable.fromIterable(list)
    //observable2.subscribe(::println)
    //using the create method
    val observable3 = Observable.create<Int> { emitter ->
        emitter.onNext(1)
        emitter.onNext(3)
        emitter.onNext(5)
        emitter.onNext(6)
        //emitter.onNext(null) null not permitted
        emitter.onComplete()
    }
    observable3.subscribe(
        ::println,
        { error -> print(error.localizedMessage) },
        { println("completed") }
    )
}