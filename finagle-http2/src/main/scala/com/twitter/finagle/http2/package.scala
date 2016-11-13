package com.twitter.finagle

import com.twitter.finagle.netty4.http.{Netty4ClientStreamTransport, Netty4ServerStreamTransport}

package object http2 {
  private[finagle] val Http2: Http.HttpImpl = Http.HttpImpl(
    new Netty4ClientStreamTransport(_),
    new Netty4ServerStreamTransport(_),
    Http2Transporter.apply _,
    Http2Listener.apply _
  )
}
