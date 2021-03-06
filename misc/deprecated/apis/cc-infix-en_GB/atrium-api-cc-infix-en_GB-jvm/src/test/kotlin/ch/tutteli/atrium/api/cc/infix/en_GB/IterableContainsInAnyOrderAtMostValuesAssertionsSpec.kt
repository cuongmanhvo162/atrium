// TODO remove file with 1.0.0
@file:Suppress("DEPRECATION", "TYPEALIAS_EXPANSION_DEPRECATION")
package ch.tutteli.atrium.api.cc.infix.en_GB

import ch.tutteli.atrium.verbs.internal.AssertionVerbFactory
import ch.tutteli.atrium.api.cc.infix.en_GB.keywords.contain
import ch.tutteli.atrium.api.cc.infix.en_GB.keywords.order
import ch.tutteli.atrium.api.infix.en_GB.*
import ch.tutteli.atrium.api.infix.en_GB.atMost
import ch.tutteli.atrium.creating.Assert
import ch.tutteli.atrium.creating.AssertionPlant
import ch.tutteli.atrium.domain.builders.migration.asAssert
import ch.tutteli.atrium.domain.builders.migration.asExpect

//TODO remove with 1.0.0, no need to migrate to Spek 2
class IterableContainsInAnyOrderAtMostValuesAssertionsSpec : ch.tutteli.atrium.spec.integration.IterableContainsInAnyOrderAtMostValuesAssertionSpec(
    AssertionVerbFactory,
    getAtMostTriple(),
    getContainsNotPair(),
    getExactlyPair(),
    "◆ "
) {

    companion object : IterableContainsSpecBase() {

        private fun getAtMostTriple() = Triple(
            "$toContain $inAnyOrder $atMost",
            { what: String, times: String -> "$toContain $what $atMost $times" },
            Companion::containsAtMost
        )

        private fun containsAtMost(plant: Assert<Iterable<Double>>, atMost: Int, a: Double, aX: Array<out Double>): AssertionPlant<Iterable<Double>> {
            val values = Values(a, *aX)
            return (plant.asExpect().contains(o) inAny ch.tutteli.atrium.api.infix.en_GB.order).atMost(atMost)
                .the<Double, Iterable<Double>>(values(values.expected, *values.otherExpected)).asAssert()
        }


        private fun getContainsNotPair() = containsNotValues to Companion::getErrorMsgContainsNot

        private fun getErrorMsgContainsNot(times: Int)
            = "use `$containsNotValues` instead of `$atMost $times`"

        private fun getExactlyPair() = exactly to Companion::getErrorMsgExactly

        private fun getErrorMsgExactly(times: Int)
            = "use `$exactly $times` instead of `$atMost $times`; `$atMost $times` defines implicitly `$atLeast $times` as well"
    }
}
