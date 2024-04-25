/*
 * MIT License
 *
 * Copyright (c) 2023 OrdinaryRoad
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package tech.ordinaryroad.live.chat.client.kuaishou.listener;

import tech.ordinaryroad.live.chat.client.commons.base.listener.*;
import tech.ordinaryroad.live.chat.client.kuaishou.msg.KuaishouDanmuMsg;
import tech.ordinaryroad.live.chat.client.kuaishou.msg.KuaishouGiftMsg;
import tech.ordinaryroad.live.chat.client.kuaishou.msg.KuaishouLikeMsg;
import tech.ordinaryroad.live.chat.client.kuaishou.msg.KuaishouRoomStatsMsg;
import tech.ordinaryroad.live.chat.client.kuaishou.netty.handler.KuaishouBinaryFrameHandler;
import tech.ordinaryroad.live.chat.client.kuaishou.protobuf.PayloadTypeOuterClass;

/**
 * @author mjz
 * @date 2024/1/5
 */
public interface IKuaishouMsgListener extends IBaseMsgListener<KuaishouBinaryFrameHandler, PayloadTypeOuterClass.PayloadType>,
        IDanmuMsgListener<KuaishouBinaryFrameHandler, KuaishouDanmuMsg>,
        IGiftMsgListener<KuaishouBinaryFrameHandler, KuaishouGiftMsg>,
        ILikeMsgListener<KuaishouBinaryFrameHandler, KuaishouLikeMsg>,
        IRoomStatsMsgListener<KuaishouBinaryFrameHandler, KuaishouRoomStatsMsg> {
}
