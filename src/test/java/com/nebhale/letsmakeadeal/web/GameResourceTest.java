/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nebhale.letsmakeadeal.web;

import static org.junit.Assert.assertEquals;

import java.util.Collections;

import org.junit.Test;

import com.nebhale.letsmakeadeal.Door;
import com.nebhale.letsmakeadeal.Game;
import com.nebhale.letsmakeadeal.GameStatus;

public final class GameResourceTest {

    private final Game game = new Game(1L, Collections.<Door> emptySet());

    private final GameResource resource = new GameResource(this.game);

    @Test
    public void test() {
        assertEquals(GameStatus.AWAITING_INITIAL_SELECTION, this.resource.getStatus());
    }

}
