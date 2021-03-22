/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package org.apache.flink.runtime.scheduler.benchmark.e2e;

import org.apache.flink.runtime.scheduler.DefaultScheduler;
import org.apache.flink.runtime.scheduler.benchmark.JobConfiguration;
import org.apache.flink.util.TestLogger;

import org.junit.Test;

/**
 * The benchmark of scheduling tasks in a STREAMING/BATCH job. The related method is {@link
 * DefaultScheduler#startScheduling}.
 */
public class SchedulingAndDeployingBenchmarkTest extends TestLogger {

    @Test
    public void scheduleAndDeployInStreamingJob() throws Exception {
        SchedulingAndDeployingBenchmark benchmark = new SchedulingAndDeployingBenchmark();
        benchmark.setup(JobConfiguration.STREAMING_TEST);
        benchmark.startScheduling();
        benchmark.teardown();
    }

    @Test
    public void scheduleAndDeployInBatchJob() throws Exception {
        SchedulingAndDeployingBenchmark benchmark = new SchedulingAndDeployingBenchmark();
        benchmark.setup(JobConfiguration.BATCH_TEST);
        benchmark.startScheduling();
        benchmark.teardown();
    }
}