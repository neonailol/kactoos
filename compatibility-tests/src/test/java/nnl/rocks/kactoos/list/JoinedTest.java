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
package nnl.rocks.kactoos.list;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test case for {@link nnl.rocks.kactoos.collection.Joined}.
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id: eef0d66faee6f1fd8dfedc6ae0badb3bb4e5dcd2 $
 * @since 0.20
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumber (500 line)
 */
@SuppressWarnings("PMD.TooManyMethods")
public final class JoinedTest {

    @Test
    public void behavesAsCollection() {
        MatcherAssert.assertThat(
            "Can't behave as a list",
            new Joined<Integer>(
                new ListOf<>(1, 2),
                new ListOf<>(3, 4)
            ),
            new BehavesAsList<>(2)
        );
    }

    @Test
    public void size() {
        MatcherAssert.assertThat(
            new Joined<Integer>(
                new ListOf<>(1, 2),
                new ListOf<>(3, 4)
            ).size(),
            Matchers.equalTo(4)
        );
    }

    @Test
    public void isEmpty() {
        MatcherAssert.assertThat(
            new Joined<Integer>(
                new ListOf<Integer>(5, 6)
            ).isEmpty(),
            Matchers.equalTo(false)
        );
    }

    @Test
    public void contains() {
        final int element = 0;
        MatcherAssert.assertThat(
            new Joined<Integer>(
                new ListOf<>(7, 8),
                new ListOf<>(9, element)
            ).contains(element),
            Matchers.equalTo(true)
        );
    }

    @Test
    public void iterator() {
        final String element = "element";
        MatcherAssert.assertThat(
            new Joined<String>(
                new ListOf<>(element, "first"),
                new ListOf<>("second", "third")
            ).iterator().next(),
            Matchers.equalTo(element)
        );
    }

    @Test
    public void toArray() {
        MatcherAssert.assertThat(
            new Joined<Integer>(
                new ListOf<>(11, 12),
                new ListOf<>(13, 14)
            ).toArray(),
            Matchers.equalTo(new ListOf<>(11, 12, 13, 14).toArray())
        );
    }

    @Test(expected = UnsupportedOperationException.class)
    public void add() {
        new Joined<String>(new ListOf<String>("add0")).add("new add0");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void remove() {
        new Joined<String>(new ListOf<String>("remove")).remove("new remove");
    }

    @Test
    public void containsAll() {
        final String first = "item1";
        final String second = "item2";
        MatcherAssert.assertThat(
            new Joined<String>(
                new ListOf<>(first, "item3"),
                new ListOf<>(second, "item4")
            ).containsAll(new ListOf<>(first, second)),
            Matchers.equalTo(true)
        );
    }

    @Test(expected = UnsupportedOperationException.class)
    public void addAll() {
        new Joined<String>(
            new ListOf<String>("addAll")
        ).addAll(new ListOf<>("new addAll"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void addAllSecond() {
        new Joined<String>(
            new ListOf<String>("addAll1")
        ).addAll(22, new ListOf<>("new addAll1"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void removeAll() {
        new Joined<String>(
            new ListOf<String>("removeAll")
        ).removeAll(new ListOf<>("new removeAll"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void retainAll() {
        new Joined<String>().retainAll(new ListOf<>("retain", "All"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void clear() {
        new Joined<String>(new ListOf<String>("clear")).clear();
    }

    @Test
    public void get() {
        final String element = "element2";
        MatcherAssert.assertThat(
            new Joined<String>(
                new ListOf<>("element1"),
                new ListOf<>(element, "element3")
            ).get(1),
            Matchers.equalTo(element)
        );
    }

    @Test(expected = UnsupportedOperationException.class)
    public void set() {
        new Joined<String>(new ListOf<String>("set")).set(33, "new set");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void addSecond() {
        new Joined<String>(new ListOf<String>("add")).add(44, "new add");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void removeSecond() {
        new Joined<String>().remove(55);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void listIteratorSecond() {
        new Joined<Integer>().listIterator(66);
    }

    @Test
    public void subList() {
        final String element = "elem2";
        MatcherAssert.assertThat(
            new Joined<String>(
                new ListOf<>("elem1", element),
                new ListOf<>("elem3", "elem4")
            ).subList(1, 3).iterator().next(),
            Matchers.equalTo(element)
        );
    }
}
