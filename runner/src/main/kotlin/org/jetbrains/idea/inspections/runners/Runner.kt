package org.jetbrains.idea.inspections.runners

import org.jetbrains.intellij.Logger

abstract class Runner<in T>(protected val logger: Logger) {
    abstract fun run(parameters: T): Boolean

    abstract fun finalize()
}
