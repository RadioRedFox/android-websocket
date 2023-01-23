package ru.radioFox.stomp.pathmatcher;

import ru.radioFox.stomp.dto.StompMessage;


public interface PathMatcher {

    boolean matches(String path, StompMessage msg);
}
