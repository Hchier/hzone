package cc.hchier.nettyTalk.client.handler;

import cc.hchier.nettyTalk.message.PrivateChatRespMsg;
import cc.hchier.service.WsService;
import cc.hchier.wsMsgs.PrivateChatMsg;
import cc.hchier.wsMsgs.WsMsgDTO;
import cc.hchier.wsMsgs.WsMsgType;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * @author by Hchier
 * @Date 2023/2/25 18:12
 */
@Slf4j
public class PrivateChatRespMsgHandler extends SimpleChannelInboundHandler<PrivateChatRespMsg> {
    private final WsService wsService;

    public PrivateChatRespMsgHandler(WsService wsService) {
        this.wsService = wsService;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, PrivateChatRespMsg msg) {
        PrivateChatMsg wsMsg = new PrivateChatMsg()
            .setId(msg.getId())
            .setSender(msg.getFrom())
            .setReceiver(msg.getTo())
            .setContent(msg.getContent())
            .setCreateTime(msg.getCreateTime());
        log.info("用户" + wsMsg.getReceiver() + "收到消息：" + msg + "并发送wsMsg：" + wsMsg);
        wsService.sendWsDTO(WsMsgDTO.build(WsMsgType.PrivateChatMsg.getCode(), wsMsg));
    }
}
