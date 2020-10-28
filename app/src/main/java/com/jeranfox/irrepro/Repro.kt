package com.jeranfox.irrepro

class Repro {

    fun ok(suspendAction: SuspendAction) {
        invoke(suspendAction::invoke)
    }

    fun notOk(action: Action) {
        invoke(action::invoke)
    }

    fun workAround(action: Action) {
        invoke { action.invoke() }
    }

    fun invoke(action: suspend () -> Unit) {

    }
}

interface Action {
    fun invoke()
}

interface SuspendAction {
    suspend fun invoke()
}
