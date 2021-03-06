package ch.tutteli.atrium.domain.builders

import ch.tutteli.atrium.domain.builders.creating.*
import ch.tutteli.atrium.domain.creating.BigDecimalAssertions
import ch.tutteli.atrium.domain.creating.ChronoZonedDateTimeAssertions
import ch.tutteli.atrium.domain.creating.LocalDateAssertions
import ch.tutteli.atrium.domain.creating.LocalDateTimeAssertions
import ch.tutteli.atrium.domain.creating.OptionalAssertions
import ch.tutteli.atrium.domain.creating.PathAssertions

/**
 * Returns [BigDecimalAssertionsBuilder]
 * which inter alia delegates to the implementation of [BigDecimalAssertions].
 */
inline val ExpectImpl.bigDecimal get() = BigDecimalAssertionsBuilder

/**
 * Returns [OptionalAssertionsBuilder]
 * which inter alia delegates to the implementation of [OptionalAssertions].
 */
inline val ExpectImpl.optional get() = OptionalAssertionsBuilder

/**
 * Returns [PathAssertionsBuilder]
 * which inter alia delegates to the implementation of [PathAssertions].
 */
inline val ExpectImpl.path get() = PathAssertionsBuilder

/**
 * Returns [ChronoLocalDateAssertionsBuilder]
 * which inter alia delegates to the implementation of [ChronoLocalDateAssertions].
 */
inline val ExpectImpl.chronoLocalDate get() = ChronoLocalDateAssertionsBuilder

/**
 * Returns [ChronoLocalDateTimeAssertionsBuilder]
 * which inter alia delegates to the implementation of [ChronoLocalDateTimeAssertions].
 */
inline val ExpectImpl.chronoLocalDateTime get() = ChronoLocalDateTimeAssertionsBuilder

/**
 * Returns [ChronoZonedDateTimeAssertionsBuilder]
 * which inter alia delegates to the implementation of [ChronoZonedDateTimeAssertions].
 */
inline val ExpectImpl.chronoZonedDateTime get() = ChronoZonedDateTimeAssertionsBuilder

/**
 * Returns [LocalDateAssertionsBuilder]
 * which inter alia delegates to the implementation of [LocalDateAssertions].
 */
inline val ExpectImpl.localDate get() = LocalDateAssertionsBuilder

/**
 * Returns [LocalDateTimeAssertionsBuilder]
 * which inter alia delegates to the implementation of [LocalDateTimeAssertionsBuilder].
 */
inline val ExpectImpl.localDateTime get() = LocalDateTimeAssertionsBuilder

/**
 * Returns [ZonedDateTimeAssertionsBuilder]
 * which inter alia delegates to the implementation of [ZonedDateTimeAssertionsBuilder].
 */
inline val ExpectImpl.zonedDateTime get() = ZonedDateTimeAssertionsBuilder
