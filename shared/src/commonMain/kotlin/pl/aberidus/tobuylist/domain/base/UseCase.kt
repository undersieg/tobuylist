package pl.aberidus.tobuylist.domain.base

abstract class UseCase<P, R> {
    abstract suspend fun execute(param: P): R
}