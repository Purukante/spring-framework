/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.web.socket.sockjs;

import java.io.IOException;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;

/**
 * A service for processing SockJS requests.
 *
 * @author Rossen Stoyanchev
 * @since 4.0
 *
 * @see org.springframework.web.socket.sockjs.support.SockJsHttpRequestHandler
 */
public interface SockJsService {


	void handleRequest(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler handler)
			throws IOException, TransportErrorException;

}