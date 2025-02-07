/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.plugin.task.api;

import static com.google.common.truth.Truth.assertThat;

import org.apache.dolphinscheduler.plugin.task.api.task.ConditionsLogicTaskChannelFactory;
import org.apache.dolphinscheduler.plugin.task.api.task.DependentLogicTaskChannelFactory;
import org.apache.dolphinscheduler.plugin.task.api.task.SubWorkflowLogicTaskChannelFactory;
import org.apache.dolphinscheduler.plugin.task.api.task.SwitchLogicTaskChannelFactory;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TaskPluginManagerTest {

    @ParameterizedTest
    @ValueSource(strings = {
            ConditionsLogicTaskChannelFactory.NAME,
            DependentLogicTaskChannelFactory.NAME,
            SubWorkflowLogicTaskChannelFactory.NAME,
            SwitchLogicTaskChannelFactory.NAME})
    void testGetTaskChannel_logicTaskChannel(String type) {
        assertThat(TaskPluginManager.getTaskChannel(type)).isNotNull();
    }

}
