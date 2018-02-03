/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2017-2018 Yegor Bugayenko
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package nnl.rocks.kactoos.time;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Tests for {@link ZonedDateTimeOf}.
 * @author Sven Diedrichsen (sven.diedrichsen@gmail.com)
 * @version $Id: cebadd468b2b81f378edc3d0ec4a9e61f14d649d $
 * @since 1.0
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class ZonedDateTimeOfTest {

    @Test
    public final void testParsingIsoFormattedStringToZonedDateTime() {
        MatcherAssert.assertThat(
            "Can't parse a ZonedDateTime with default/ISO format.",
            new ZonedDateTimeOf("2017-12-13T14:15:16.000000017+01:00").value(),
            Matchers.equalTo(
                ZonedDateTime.of(
                    2017, 12, 13, 14, 15, 16, 17,
                    ZoneId.ofOffset("", ZoneOffset.ofHours(1))
                )
            )
        );
    }

    @Test
    public final void testParsingFormattedStringWithZoneToZonedDateTime() {
        MatcherAssert.assertThat(
            "Can't parse a ZonedDateTime with custom format and zone.",
            new ZonedDateTimeOf(
                "2017-12-13 14:15:16",
                "yyyy-MM-dd HH:mm:ss",
                ZoneId.of("Europe/Berlin")
            ).value(),
            Matchers.is(
                ZonedDateTime.of(
                    LocalDateTime.of(2017, 12, 13, 14, 15, 16),
                    ZoneId.of("Europe/Berlin")
                )
            )
        );
    }

    @Test
    public final void testParsingFormattedStringWithFormatterToZonedDateTime() {
        MatcherAssert.assertThat(
            "Can't parse a ZonedDateTime with custom format and zone.",
            new ZonedDateTimeOf(
                "2017-12-13 14:15:16",
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                                 .withZone(ZoneId.of("Europe/Berlin"))
            ).value(),
            Matchers.is(
                ZonedDateTime.of(
                    LocalDateTime.of(2017, 12, 13, 14, 15, 16),
                    ZoneId.of("Europe/Berlin")
                )
            )
        );
    }

}
