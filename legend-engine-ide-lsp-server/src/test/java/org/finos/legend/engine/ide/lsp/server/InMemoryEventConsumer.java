/*
 * Copyright 2024 Goldman Sachs
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

package org.finos.legend.engine.ide.lsp.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.finos.legend.engine.ide.lsp.extension.features.LegendUsageEventConsumer;

public class InMemoryEventConsumer implements LegendUsageEventConsumer
{
    public final List<LegendUsageEvent> events = Collections.synchronizedList(new ArrayList<>());

    @Override
    public String description()
    {
        return "in memory consumer";
    }

    @Override
    public void consume(LegendUsageEvent event)
    {
        this.events.add(event);
    }
}