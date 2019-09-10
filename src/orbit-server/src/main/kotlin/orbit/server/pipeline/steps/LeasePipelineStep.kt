/*
 Copyright (C) 2015 - 2019 Electronic Arts Inc.  All rights reserved.
 This file is part of the Orbit Project <https://www.orbit.cloud>.
 See license in LICENSE.
 */

package orbit.server.pipeline.steps

import orbit.server.net.Message
import orbit.server.net.NodeLeases
import orbit.server.pipeline.PipelineContext

internal class LeasePipelineStep(private val nodeLeases: NodeLeases) : PipelineStep {
    override suspend fun onInbound(context: PipelineContext, msg: Message) {
        if (msg.source != null && this.nodeLeases.checkLease(msg.source)) {
            super.onInbound(context, msg)
        }
    }

    override suspend fun onOutbound(context: PipelineContext, msg: Message) {
        super.onOutbound(context, msg)
    }
}