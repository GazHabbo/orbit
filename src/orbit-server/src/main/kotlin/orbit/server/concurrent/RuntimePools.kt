/*
 Copyright (C) 2015 - 2019 Electronic Arts Inc.  All rights reserved.
 This file is part of the Orbit Project <https://www.orbit.cloud>.
 See license in LICENSE.
 */

package orbit.server.concurrent

import kotlinx.coroutines.CoroutineDispatcher

data class RuntimePools(
    val cpuPool: CoroutineDispatcher,
    val ioPool: CoroutineDispatcher
)