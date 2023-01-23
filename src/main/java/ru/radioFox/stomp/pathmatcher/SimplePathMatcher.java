package ru.radioFox.stomp.pathmatcher;

import ru.radioFox.stomp.dto.StompHeader;
import ru.radioFox.stomp.dto.StompMessage;

public class SimplePathMatcher implements PathMatcher {

    @Override
    public boolean matches(String path, StompMessage msg) {
        String dest = msg.findHeader(StompHeader.DESTINATION);
        if (dest == null) return false;
        else return path.equals(dest);
    }
}
