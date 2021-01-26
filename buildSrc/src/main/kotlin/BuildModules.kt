/**
 * Configuration of build modules
 */
object BuildModules {
    const val app = ":app"
    const val core = ":core"

    object Feature {
        const val shopping = ":feature:shopping"
    }

    object Common {
        const val testShared = ":common:testShared"
        const val androidShared = ":common:androidShared"
    }
}
