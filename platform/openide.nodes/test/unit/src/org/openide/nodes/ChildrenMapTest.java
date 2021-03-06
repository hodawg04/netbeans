/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.openide.nodes;

import org.netbeans.junit.NbTestCase;

public class ChildrenMapTest extends NbTestCase {
    public ChildrenMapTest(String name) {
        super(name);
    }

    public void testGetNodesCount() {
        MM m = new MM();
        Node n = new AbstractNode(m);
        m.put("a", new AbstractNode(Children.LEAF));
        m.put("b", new AbstractNode(Children.LEAF));
        assertEquals("Two", 2, n.getChildren().getNodesCount());
        m.remove("b");
        assertEquals("One", 1, n.getChildren().getNodesCount());
    }
    
    class MM extends Children.Map<String> {
        
    }
}
